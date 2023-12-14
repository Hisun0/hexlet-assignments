package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {
    public static Map<String, Integer> getWordCount(String text) {
        Map<String, Integer> result = new HashMap<>();

        if (text.isEmpty()) {
            return result;
        }

        String[] textArr = text.split(" ");

        for (String word : textArr) {
            int count = result.getOrDefault(word, 0);
            result.put(word, count + 1);
        }

        return result;
    }

    public static String toString(Map<String, Integer> wordsCount) {
        if (wordsCount.isEmpty()) {
            return "{}";
        }

        String[] result = new String[wordsCount.size()];
        int index = 0;

        String space = "  ";

        for (var entry : wordsCount.entrySet()) {
            String resultString = space + entry.getKey() + ": " + entry.getValue();
            result[index] = resultString;
            index++;
        }

        return "{\n" + String.join("\n", result) + "\n}";
    }
}
//END
