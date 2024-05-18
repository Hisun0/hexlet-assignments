package exercise;

import io.javalin.Javalin;

public final class App {

    public static Javalin getApp() {

        // BEGIN
        var javalin = Javalin.create(javalinConfig -> {
            javalinConfig.bundledPlugins.enableDevLogging();
        });

        javalin.get("/phones", context -> context.json(Data.getPhones()));
        javalin.get("/domains", context -> context.json(Data.getDomains()));

        return javalin;
        // END
    }

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }
}
