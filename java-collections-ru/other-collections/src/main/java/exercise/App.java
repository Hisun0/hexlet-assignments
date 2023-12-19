package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// BEGIN
public class App {
    public static LinkedHashMap<String, String> genDiff(Map<String, Object> data1, Map<String, Object> data2) {
        Set<String> keys1 = data1.keySet();
        Set<String> keys2 = data2.keySet();

        TreeSet<String> keys = new TreeSet<>(keys1);
        keys.addAll(keys2);

        LinkedHashMap<String, String> result = new LinkedHashMap<>();

        keys.forEach(key -> {
            if (!data2.containsKey(key)) {
                result.put(key, "deleted");
            } else if (!data1.containsKey(key)) {
                result.put(key, "added");
            } else if (!data1.get(key).equals(data2.get(key))) {
                result.put(key, "changed");
            } else {
                result.put(key, "unchanged");
            }
        });

        return result;
    }
}
//END
