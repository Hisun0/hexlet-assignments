package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class Validator {
    public static List<String> validate(Object object) {
        List<String> result = new ArrayList<>();

        Class<?> classInfo = object.getClass();
        Field[] fields = classInfo.getDeclaredFields();

        try {
            for (Field field : fields) {
                field.setAccessible(true);

                if (field.isAnnotationPresent(NotNull.class) && field.get(object) == null) {
                    result.add(field.getName());
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return result;
    }
}
// END
