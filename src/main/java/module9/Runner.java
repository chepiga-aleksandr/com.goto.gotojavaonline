package module9;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    private static final List<Character> ALPHABET = new ArrayList<>();

    static {
        for (char c = 'a'; c <= 'z'; c++) {
            ALPHABET.add(c);
        }
    }

    public static String encrypt(String inputText, int key) {
        int n = ALPHABET.size();
        key = key % n;

        StringBuilder ciphertext = new StringBuilder();

        for (int i = 0; i < inputText.length(); i++) {
            char c = inputText.charAt(i);
            int index = ALPHABET.indexOf(c);
            index = (index + key) % n;
            ciphertext.append(ALPHABET.get(index));
        }
        return ciphertext.toString();
    }

    public static String decrypt(String inputText, int key) {
        int n = ALPHABET.size();
        key = key % n;

        StringBuilder decryptedText = new StringBuilder();

        for (int i = 0; i < inputText.length(); i++) {
            char c = inputText.charAt(i);
            int index = ALPHABET.indexOf(c);
            index = ((index - key) % n + n) % n;
            decryptedText.append(ALPHABET.get(index));
        }
        return decryptedText.toString();
    }
}

