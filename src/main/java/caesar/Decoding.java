package caesar;

public class Decoding {
    static String alphabet = "abcdefghijklmnopqrstuvwxyz";
    public static String decoding(String cText, int key) {
        cText =cText.toLowerCase();
        //to generate cipher text that was encoded to plain text
        String theText = "";
        //loop through index of alphabet to find our characters' indices
        for (int i = 0; i < theText.length(); i++) {
            int charIndex = alphabet.indexOf(cText.charAt(i));
            int newIndex = (charIndex - key) % 26;
            //add if statement in case we get a negative value from subtraction
            if (newIndex < 0){
                newIndex = alphabet.length() + newIndex;
            }
            //to generate new characters
            char newChar = alphabet.charAt(newIndex);
            //appending characters to the empty theText string
            theText = theText + newChar;

            }


        return theText;
    }

}
