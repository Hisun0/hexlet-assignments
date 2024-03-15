package exercise;

// BEGIN
public class ReversedSequence implements CharSequence {
    private String reversedText;

    public ReversedSequence(String text) {
        this.reversedText = new StringBuilder(text).reverse().toString();
    }

    @Override
    public int length() {
        return reversedText.length();
    }

    @Override
    public char charAt(int index) {
        return reversedText.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return reversedText.subSequence(start, end);
    }

    public String toString() {
        return reversedText;
    }
}
// END
