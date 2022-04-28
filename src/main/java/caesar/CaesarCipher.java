package caesar;

public class CaesarCipher {

    private final String theText;
    private final int key;

    public CaesarCipher(String theText, int key) {

        this.theText = theText;
        this.key = key;
    }

    public String getTheText() {
        return this.theText;
    }

    public int getKey() {
        return this.key;
    }

    public boolean isValid() {
        return key > 0 && key < 26;
    }


}