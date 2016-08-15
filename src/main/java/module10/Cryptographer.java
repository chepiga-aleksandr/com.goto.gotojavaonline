package module10;

import java.util.ArrayList;
import java.util.List;

public class Cryptographer {
    private static final List<Character> ALPHABET = new ArrayList();

    public Cryptographer() {
    }

    public static String encrypt(String inputMessage) {
        int n = ALPHABET.size();
        byte KEY = 5;
        int var7 = KEY % n;
        StringBuilder ciphertext = new StringBuilder();

        for(int i = 0; i < inputMessage.length(); ++i) {
            char c = inputMessage.charAt(i);
            int index = ALPHABET.indexOf(Character.valueOf(c));
            index = (index + var7) % n;
            ciphertext.append(ALPHABET.get(index));
        }

        return ciphertext.toString();
    }

    public static String decrypt(String inputText) {
        int n = ALPHABET.size();
        byte KEY = 5;
        int var7 = KEY % n;
        StringBuilder decryptedText = new StringBuilder();

        for(int i = 0; i < inputText.length(); ++i) {
            char c = inputText.charAt(i);
            int index = ALPHABET.indexOf(Character.valueOf(c));
            index = ((index - var7) % n + n) % n;
            decryptedText.append(ALPHABET.get(index));
        }

        return decryptedText.toString();
    }

    static {
        for(char c = 97; c <= 122; ++c) {
            ALPHABET.add(Character.valueOf(c));
        }

    }
}
