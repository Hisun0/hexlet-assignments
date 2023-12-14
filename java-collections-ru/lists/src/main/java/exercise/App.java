package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static boolean scrabble(String letters, String word) {
        String lowerLetters = letters.toLowerCase();
        String lowerWord = word.toLowerCase();

        for (char letter : lowerWord.toCharArray()) {
            int index = lowerLetters.indexOf(letter);

            if (index == -1) {
                return false;
            }

            lowerLetters = lowerLetters.replaceFirst(Character.toString(letter), "");
        }

        return true;
    }
}
//END
