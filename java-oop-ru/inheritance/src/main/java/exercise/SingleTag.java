package exercise;

import java.util.Map;

// BEGIN
public class SingleTag extends Tag {
    private String tag;
    private Map<String, String> attributes;

    public SingleTag(String tag, Map<String, String> attributes) {
        super(tag, attributes);

        this.tag = tag;
        this.attributes = attributes;
    }

    public String toString() {
        String startOfTag = "<" + tag + " ";
        StringBuilder builder = new StringBuilder(startOfTag);
        attributes.forEach((key, value) -> {
            String attribute = String.format("%s=\"%s\" ", key, value);
            builder.append(attribute);
        });
        return builder.toString().trim() + ">";
    }
}
// END
