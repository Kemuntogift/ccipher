package caesar;

public class CaesarCipher {
    private String theText;
    private int key;

    public CaesarCipher(String theText, int key) {
        this.theText = theText;
        this.key = key;
    }

    public String getTheText(){
        return this.theText;
    }

    public int getKey(){
        return this.key;
    }
}
