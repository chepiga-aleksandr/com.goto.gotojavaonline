package module10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static String read(String fileName) throws FileNotFoundException {
        StringBuilder readFile = new StringBuilder();

        exists(fileName);

        try (BufferedReader e = new BufferedReader(new FileReader(fileName))) {
            String e1;
            while ((e1 = e.readLine()) != null) {
                readFile.append(e1);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return readFile.toString();
    }

    private static void exists(String fileName) throws FileNotFoundException {
        File file = new File(fileName);

        if (!file.exists()) {
            throw new FileNotFoundException(file.getName());
        }
    }
}