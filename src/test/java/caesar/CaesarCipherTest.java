package caesar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CaesarCipherTest {
    @Test
    public void newCaesarCipher_containsWordsAndKey_inSentence(){
        CaesarCipher cipherText = new CaesarCipher ("go for lunch", 5);
        assertEquals(true,cipherText instanceof CaesarCipher);
    }
//get string
    @Test
    public void newCaesarCipher_getsTheText_goForLunch() {
        CaesarCipher cipherText = new CaesarCipher ("go for lunch", 5);
        assertEquals("go for lunch", testCaesarCipher.getTheText());
    }
}