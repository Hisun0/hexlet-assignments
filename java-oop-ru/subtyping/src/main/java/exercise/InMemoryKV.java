package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
public class InMemoryKV implements KeyValueStorage {
    private final Map<String, String> map;

    public InMemoryKV(Map<String, String> map) {
        this.map = new HashMap<>(map);
    }

    public void set(String key, String value) {
        this.map.put(key, value);
    }

    public void unset(String key) {
        this.map.remove(key);
    }

    public String get(String key, String defaultValue) {
        return this.map.get(key) == null ? defaultValue : this.map.get(key);
    }

    public Map<String, String> toMap() {
        return new HashMap<>(this.map);
    }
}
// END
