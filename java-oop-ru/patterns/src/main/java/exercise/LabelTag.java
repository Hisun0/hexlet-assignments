package exercise;

// BEGIN
public class LabelTag implements TagInterface {
    private final String textContent;
    private final TagInterface tag;

    public LabelTag(String textContent, TagInterface tag) {
        this.textContent = textContent;
        this.tag = tag;
    }

    public String render() {
        return String.format(
                "<label>%s%s</label>",
                textContent, tag.render()
        );
    }
}
// END
