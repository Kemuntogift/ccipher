package caesar;

public class CaesarCipher {
    static String alphabet = "abcdefghijklmnopqrstuvwxyz";
    private String theText;
    private int key;

    public CaesarCipher(String theText, int key) {
        theText = theText.toLowerCase();
        String cText = "";
        for(int i=0; i<theText.length(); i++)
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
        if ((key > 0 && key < 26)) {
            return true;
        }
        return false;
    }

    //alphabet string
}