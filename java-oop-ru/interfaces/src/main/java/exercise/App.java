package exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> apartments, int n) {
        if (apartments.isEmpty()) {
            return new ArrayList<>();
        }

        List<String> result = apartments.stream()
                .sorted(Comparator.comparingDouble(Home::getArea))
                .map(apartment -> apartment.toString())
                .collect(Collectors.toList());

        return result.subList(0, n);
    }
}
// END
