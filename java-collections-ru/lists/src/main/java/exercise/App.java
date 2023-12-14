package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static boolean scrabble(String letters, String word) {
        String[] symbols = letters.split("");
        List coll = new ArrayList(Arrays.asList(symbols));

        for (int i = 0; i < word.length(); i++) {
            String currentLetter = word.substring(i, i + 1).toLowerCase();

            if (!coll.contains(currentLetter)) {
                return false;
            }

            coll.remove(currentLetter);
        }

        return true;
    }
}
//END
