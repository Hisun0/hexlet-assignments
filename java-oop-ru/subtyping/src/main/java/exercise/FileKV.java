package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class FileKV implements KeyValueStorage {
    private String filepath;
    private Map<String, String> map;

    public FileKV(String filepath, Map<String, String> map) {
        this.filepath = filepath;
        this.map = new HashMap<>(map);
    }

    private void writeSerializedMap() {
        String serializedMap = Utils.serialize(this.map);
        Utils.writeFile(this.filepath, serializedMap);
    }

    public void set(String key, String value) {
        this.map.put(key, value);
        writeSerializedMap();
    }

    public void unset(String key) {
        this.map.remove(key);
        writeSerializedMap();
    }

    public String get(String key, String defaultValue) {
        return this.map.get(key) == null ? defaultValue : this.map.get(key);
    }

    public Map<String, String> toMap() {
        return new HashMap<>(this.map);
    }
}
// END
