package exercise;

import exercise.model.Address;
import exercise.annotation.Inspect;
import java.lang.reflect.Method;

public class Application {
    public static void main(String[] args) {
        var address = new Address("London", 12345678);

        // BEGIN
        for (var method : Address.class.getDeclaredMethods()) {
            var types = method.getReturnType().toString().split("\\.");

            if (method.isAnnotationPresent(Inspect.class)) {
                System.out.println(method.getName());
                System.out.printf(
                        "Method %s returns a value of type %s\n",
                        method.getName(), types[types.length - 1]
                );
            }
        }
        // END
    }
}
