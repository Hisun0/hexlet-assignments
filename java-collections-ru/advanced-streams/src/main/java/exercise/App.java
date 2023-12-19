package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
public class App {
    public static String getForwardedVariables(String config) {
        return Arrays.stream(config.split("\n"))
                .filter(line -> line.startsWith("environment"))
                .map(line -> line.replaceAll("\"|environment=", ""))
                .flatMap(line -> Arrays.stream(line.split(",")))
                .filter(variable -> variable.startsWith("X_FORWARDED_"))
                .map(variable -> {
                    String[] parts = variable.split("=");
                    int prefixLength = "X_FORWARDED_".length();
                    return parts[0].substring(prefixLength) + "=" + parts[1];
                })
                .collect(Collectors.joining(","));
    }
}
//END
