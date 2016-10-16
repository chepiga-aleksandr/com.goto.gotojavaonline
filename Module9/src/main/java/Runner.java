import java.util.ArrayList;
import java.util.List;

public class Runner {

    private static final List<Character> ALPHABET = new ArrayList<>();

    public static StringBuilder ciphertext = new StringBuilder();
    public static StringBuilder decryptedText = new StringBuilder();

    static {
        for (char c = 'a'; c <= 'z'; c++) {
            ALPHABET.add(c);
        }
    }

    public static String encrypt(String inputText, int key) {
        int n = ALPHABET.size();
        key = key % n;

        for (int i = 0; i < inputText.length(); i++) {

            char c = inputText.charAt(i);
            int index = ALPHABET.indexOf(c);

            index = (index + key) % n;

            ciphertext.append(ALPHABET.get(index));
        }
        return ciphertext.toString();
    }

    public static String decrypt(StringBuilder ciphertext) {

        int n = ALPHABET.size();
        int KEY = 5;
        KEY = KEY % n;

        for (int i = 0; i < ciphertext.length(); i++) {

            char c = ciphertext.charAt(i);
            int index = ALPHABET.indexOf(c);

            index = ((index - KEY) % n + n) % n;
            decryptedText.append(ALPHABET.get(index));
        }
        return decryptedText.toString();
    }

    public static void main(String[] args) {

        System.out.println(encrypt("polymorphism", 5));

        System.out.println();

        System.out.println(decrypt(ciphertext));
    }
}

