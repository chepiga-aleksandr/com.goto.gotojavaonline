package module10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Runner {
    public Runner() {
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Введите Ваше сообщение для шифрования длинной не более 20 символов");

        Scanner scanner = new Scanner(System.in);

        String inputMessage = Cryptographer.encrypt(scanner.nextLine());

        try (FileOutputStream outputMessage = new FileOutputStream("D://module10//text.txt")) {

            byte[] buffer = inputMessage.getBytes();
            outputMessage.write(buffer, 0, buffer.length);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        String outputMessage1 = Cryptographer.decrypt(ReadFile.read("D://module10//text.txt"));

        System.out.println("Зашифрованный - " + inputMessage);

        System.out.println("Расшифрованный -  " + outputMessage1);
    }
}