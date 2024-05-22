package exercise.controller;

import static io.javalin.rendering.template.TemplateUtil.model;
import exercise.dto.MainPage;
import exercise.dto.LoginPage;
import exercise.repository.UsersRepository;
import static exercise.util.Security.encrypt;

import io.javalin.http.Context;

public class SessionsController {

    // BEGIN
    public static void root(Context context) {
        var page = new MainPage(context.sessionAttribute("username"));
        context.render("index.jte", model("page", page));
    }

    public static void build(Context context) {
        context.render("build.jte", model("page", new LoginPage()));
    }

    public static void create(Context context) {
        var username = context.formParam("username");
        var password = encrypt(context.formParam("password"));

        var user = UsersRepository.findByName(username);

        if (UsersRepository.findByName(username) == null || !password.equals(user.getPassword())) {
            var page = new LoginPage(username, "Wrong username or password");
            context.render("build.jte", model("page", page));
            return;
        }

        context.sessionAttribute("username", username);
        context.redirect("/");
    }

    public static void delete(Context context) {
        context.sessionAttribute("username", null);
        context.redirect("/");
    }
    // END
}
