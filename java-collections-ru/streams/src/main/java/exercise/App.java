package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
class App {
    public static long getCountOfFreeEmails(List<String> emailList) {
        final List<String> freeDomains = Arrays.asList("gmail.com", "yandex.ru", "hotmail.com");

        return emailList.stream()
            .map(email -> email.split("@")[1])
            .filter(domain -> freeDomains.contains(domain))
            .count();
    }
}
// END
