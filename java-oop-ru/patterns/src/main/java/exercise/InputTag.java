package exercise;

// BEGIN
public class InputTag implements TagInterface {
    private final String type;
    private final String value;

    public InputTag(String type, String value) {
        this.type = type;
        this.value = value;
    }

    public String render() {
        return String.format(
                "<input type=\"%1$s\" value=\"%2$s\">",
                type, value
        );
    }
}
// END
