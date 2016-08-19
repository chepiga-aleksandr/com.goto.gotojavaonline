package module10;

import java.util.ArrayList;
import java.util.List;

public class Cryptographer {

    private static final List<Character> ALPHABET = new ArrayList<>();

    static {
        for (char c = 'a'; c <= 'z'; c++) {
            ALPHABET.add(c);
        }
    }

    private static int n = ALPHABET.size();

    private static int KEY = 5;

    public static String encrypt(String inputMessage) {
        StringBuilder ciphertext = new StringBuilder();

        for (int i = 0; i < inputMessage.length(); i++) {
            char c = inputMessage.charAt(i);
            int index = ALPHABET.indexOf(c);

            index = (index + KEY) % n;

            ciphertext.append(ALPHABET.get(index));
        }

        return ciphertext.toString();
    }

    public static String decrypt(String inputText) {
        StringBuilder decryptedText = new StringBuilder();

        for (int i = 0; i < inputText.length(); ++i) {
            char c = inputText.charAt(i);
            int index = ALPHABET.indexOf(c);

            index = ((index - KEY) % n + n) % n;

            decryptedText.append(ALPHABET.get(index));
        }

        return decryptedText.toString();
    }
}