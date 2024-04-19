package exercise;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
public abstract class Tag {
    private String tag;
    private Map<String, String> attributes;
    private String textContent = null;
    private List<Tag> tagList = null;

    public Tag(
            String tag, Map<String, String> attributes, String textContent,
            List<Tag> tagList
    ) {
        this.tag = tag;
        this.attributes = attributes;
        this.tagList = tagList;
        this.textContent = textContent;
    }

    public Tag(String tag, Map<String, String> attributes) {
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
