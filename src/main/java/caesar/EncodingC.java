package caesar;

public class EncodingC {
    static String alphabet = "abcdefghijklmnopqrstuvwxyz";
    public static String encoding(String theText, int key) {
        theText = theText.toLowerCase();
        // to get cipher text
        String cText = "";
        //loop through index of alphabet
        for (int i = 0; i < theText.length(); i++) {
            int charIndex = alphabet.indexOf(theText.charAt(i));
            int newIndex = (charIndex + key) % 26;

            //generate cipher characters from alphabet at the new index for replacement using the key
            char cipherTextChar = alphabet.charAt(newIndex);

            //appending characters to the empty string cText
            cText = cText + cipherTextChar;
        }
        return cText;
    }
}
