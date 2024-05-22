package exercise.controller;

import org.apache.commons.lang3.StringUtils;
import exercise.util.Security;
import exercise.model.User;
import exercise.util.NamedRoutes;
import static io.javalin.rendering.template.TemplateUtil.model;
import exercise.repository.UserRepository;
import exercise.dto.users.UserPage;
import io.javalin.http.NotFoundResponse;
import io.javalin.http.Context;


public class UsersController {

    public static void build(Context ctx) throws Exception {
        ctx.render("users/build.jte");
    }

    // BEGIN
    public static void root(Context ctx) {
        ctx.render("index.jte");
    }

    public static void register(Context ctx) {
        var firstName = ctx.formParam("firstName");
        var lastName = ctx.formParam("lastName");
        var email = ctx.formParam("email");
        var password = ctx.formParam("password");
        var token = Security.generateToken();

        var user = new User(firstName, lastName, email, password, token);
        ctx.cookie("token", token);

        UserRepository.save(user);
        ctx.redirect(NamedRoutes.userPath(user.getId()));
    }

    public static void show(Context ctx) {
        var id = ctx.pathParamAsClass("id", Long.class).get();
        var user = UserRepository.find(id)
                        .orElseThrow(() -> new NotFoundResponse("User not found!"));

        var currentCookie = ctx.cookie("token");

        if (currentCookie == null || !currentCookie.equals(user.getToken())) {
            ctx.redirect(NamedRoutes.buildUserPath());
            return;
        }

        var page = new UserPage(user);
        ctx.render("users/show.jte", model("page", page));
    }
    // END
}
