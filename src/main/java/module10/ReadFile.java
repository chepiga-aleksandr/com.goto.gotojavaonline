package module10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public ReadFile() {
    }

    public static String read(String fileName) throws FileNotFoundException {
        StringBuilder readFile = new StringBuilder();
        exists(fileName);

        try {
            BufferedReader e = new BufferedReader(new FileReader(fileName));

            try {
                String e1;
                try {
                    while((e1 = e.readLine()) != null) {
                        readFile.append(e1);
                    }
                } catch (IOException var8) {
                    var8.printStackTrace();
                }
            } finally {
                e.close();
            }
        } catch (IOException var10) {
            throw new RuntimeException(var10);
        }

        return readFile.toString();
    }

    private static void exists(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if(!file.exists()) {
            throw new FileNotFoundException(file.getName());
        }
    }
}