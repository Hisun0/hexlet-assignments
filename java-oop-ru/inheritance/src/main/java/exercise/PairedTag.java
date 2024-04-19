package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {

    private String textContent;
    private List<Tag> tagList;

    public PairedTag(
            String tag, Map<String, String> attributes, String textContent,
            List<Tag> tagList
    ) {
        super(tag, attributes);

        this.tagList = tagList;
        this.textContent = textContent;
    }

    public String toString() {
        String singleTags = tagList.stream()
                .map(Tag::toString)
                .collect(Collectors.joining(""));

        return String.format(
                "<%s%s>%s%s</%s>",
                getTag(), stringifyAttributes(), textContent, singleTags, getTag()
        );
    }
}
// END
