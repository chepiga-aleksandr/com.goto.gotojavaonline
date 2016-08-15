package module4.updateTemperature;

import java.util.Scanner;

public class InputFromConsole {

    public static Scanner scanner = new Scanner(System.in);

    public static double readValue() {

        return Double.parseDouble(scanner.next());
    }
    public static String readChoice() {
        return scanner.next();
    }
}
