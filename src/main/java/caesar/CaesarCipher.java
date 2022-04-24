package caesar;

public class CaesarCipher {
    static String alphabet = "abcdefghijklmnopqrstuvwxyz";
    private String theText;
    private int key;

    public CaesarCipher(String theText, int key) {
        theText = theText.toLowerCase();
        String cText = "";
        //loop through index of alphabet
        for(int i=0; i<theText.length(); i++) {
            int charIndex = alphabet.indexOf(theText.charAt(i));
            int newIndex = (charIndex + key) % 26;

            //generate cipher characters form alphabet at the new index
            char cipherTextChar = alphabet.charAt(newIndex);
        }
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