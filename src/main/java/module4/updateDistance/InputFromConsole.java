package module4.updateDistance;

import java.util.Scanner;

public class InputFromConsole {

    public static Scanner sc = new Scanner(System.in);

    public static void readOfData() {

        CalculationOfCoordinate.setX1(Double.parseDouble(sc.next()));
        CalculationOfCoordinate.setX2(Double.parseDouble(sc.next()));
        CalculationOfCoordinate.setY1(Double.parseDouble(sc.next()));
        CalculationOfCoordinate.setY2(Double.parseDouble(sc.next()));
    }
}




