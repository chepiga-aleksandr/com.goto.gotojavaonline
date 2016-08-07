package module10;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Runner {

    public static Path normalizePath(String input) {

        Path inputPath = Paths.get(input);

        Path result = inputPath.normalize();

        return result;
    }

    public static void main(String[] args) {

        Path normalizedPath = normalizePath("/home/../var/./lib//file.txt");

        System.out.println(normalizedPath);
    }
}