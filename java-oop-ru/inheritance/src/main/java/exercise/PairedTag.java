package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {
    private String tag;
    private Map<String, String> attributes;
    private String textContent;
    private List<Tag> tagList;

    public PairedTag(
            String tag, Map<String, String> attributes, String textContent,
            List<Tag> tagList
    ) {
        super(tag, attributes, textContent, tagList);

        this.tag = tag;
        this.tagList = tagList;
        this.textContent = textContent;
        this.attributes = attributes;
    }

    public String toString() {
        String singleTags = tagList.stream()
                .map(Tag::toString)
                .collect(Collectors.joining(""));

        return super.toString() + textContent + singleTags + "</" + tag + ">";
    }
}
// END
