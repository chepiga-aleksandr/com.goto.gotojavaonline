package module10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import module10.Cryptographer;
import module10.ReadFile;

public class Runner {
    public Runner() {
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Введите Ваше сообщение для шифрования длинной не более 20 символов");
        Scanner scanner = new Scanner(System.in);
        String inputMessage = Cryptographer.encrypt(scanner.nextLine());

        try {
            FileOutputStream outputMessage = new FileOutputStream("D://module10//text.txt");
            Throwable var4 = null;

            try {
                byte[] buffer = inputMessage.getBytes();
                outputMessage.write(buffer, 0, buffer.length);
            } catch (Throwable var14) {
                var4 = var14;
                throw var14;
            } finally {
                if(outputMessage != null) {
                    if(var4 != null) {
                        try {
                            outputMessage.close();
                        } catch (Throwable var13) {
                            var4.addSuppressed(var13);
                        }
                    } else {
                        outputMessage.close();
                    }
                }

            }
        } catch (IOException var16) {
            System.out.println(var16.getMessage());
        }

        String outputMessage1 = Cryptographer.decrypt(ReadFile.read("D://module10//text.txt"));
        System.out.println("Зашифрованный - " + inputMessage);
        System.out.println("Расшифрованный -  " + outputMessage1);
    }
}