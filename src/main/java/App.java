

import java.util.Scanner;

import static caesar.Decoding.decoding;
import static caesar.EncodingC.encoding;

public class App {
    public static void main(String[] args) {
        Scanner in;
        in = new Scanner(System.in);
        System.out.println("Enter the text you want to encrypt:");
        String userText = in.nextLine();
        System.out.println("Enter encryption key between 1 and 25");
        int Key = in.nextInt();
//to get input text from the encoding method
        String inputText = encoding(userText, Key);
        System.out.println("Your encrypted text is :" + inputText);
        System.out.println("Place same key to decrypt");
        Key = in.nextInt();
        //to decode the input text and display it
        System.out.println("Your decrypted text is :" + userText);
    }
}