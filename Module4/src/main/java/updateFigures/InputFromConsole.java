package updateFigures;

import java.util.Scanner;

public class InputFromConsole {

    private static Scanner sc = new Scanner(System.in);

    public static double readValue() {

        return Double.parseDouble(sc.next());
    }

    public static int readChoice() {
        return sc.nextInt();
    }
}
