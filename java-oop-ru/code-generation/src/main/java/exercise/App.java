package exercise;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

// BEGIN
public class App {
    public static void save(Path path, Car car) {
        String json = car.serialize();

        try {
            Files.writeString(path, json);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Car extract(Path path) {
        Car car;

        try {
            String json = Files.readString(path);
            car = Car.unserialize(json);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return car;
    }
}
// END
