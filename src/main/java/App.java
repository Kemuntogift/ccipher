import caesar.Decoding;
import caesar.EncodingC;

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

        String inputText = encoding(userText, Key);
        System.out.println("Your text is :" + inputText);
    }
}