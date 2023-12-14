package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> actual1 = App.take(numbers1, 2);
        List<Integer> expected1 = new ArrayList<>(Arrays.asList(1, 2));
        assertThat(actual1).isEqualTo(expected1);

        List<Integer> actual2 = App.take(numbers1, 10);
        assertThat(actual2).isEqualTo(numbers1);

        List<Integer> actual3 = App.take(numbers1, 0);
        List<Integer> expected2 = new ArrayList<>();
        assertThat(actual3).isEqualTo(expected2);

        List<Integer> numbers2 = new ArrayList<>();
        List<Integer> actual4 = App.take(numbers2, 3);
        assertThat(actual4).isEqualTo(numbers2);
        // END
    }
}
