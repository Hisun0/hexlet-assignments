package exercise;

import io.javalin.Javalin;
import java.util.List;
import io.javalin.http.NotFoundResponse;
import exercise.model.User;
import exercise.dto.users.UserPage;
import exercise.dto.users.UsersPage;
import static io.javalin.rendering.template.TemplateUtil.model;
import io.javalin.rendering.template.JavalinJte;

public final class App {

    // Каждый пользователь представлен объектом класса User
    private static final List<User> USERS = Data.getUsers();

    public static Javalin getApp() {

        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
            config.fileRenderer(new JavalinJte());
        });

        // BEGIN
        app.get("/users", context -> {
            var page = new UsersPage(USERS);
            context.render("users/index.jte", model("page", page));
        });

        app.get("/users/{id}", context -> {
            var pathId = context.pathParamAsClass("id", Long.class).get();
            var user = USERS.stream()
                    .filter(u -> u.getId() == pathId)
                    .findFirst()
                    .orElse(null);

            if (user == null) {
                throw new NotFoundResponse("Пользователь не найден!");
            }

            var page = new UserPage(user);
            context.render("users/show.jte", model("page", page));
        });
        // END

        app.get("/", ctx -> {
            ctx.render("index.jte");
        });

        return app;
    }

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }
}
