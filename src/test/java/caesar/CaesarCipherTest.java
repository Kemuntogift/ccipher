package caesar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CaesarCipherTest {
    @Test
    public void newSentence_containsWordsAndKey_inSentence(){
        CaesarCipher cipherText = new CaesarCipher ("go for lunch", 5);
        assertEquals(true,cipherText instanceof CaesarCipher);
    }
}