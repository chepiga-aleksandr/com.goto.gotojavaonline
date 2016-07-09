package module4.updateTemperature;

import java.util.Scanner;

public class TemperatureConverter {

    public static void ConvertToCelsius() {

        Scanner in = new Scanner(System.in);

        Double

        double ValueOfCelsius;
        double ValueOfFahrenheit;
        ValueOfCelsius = (ValueOfFahrenheit - 32) / 1, 8;

        System.out.println("ValueOfCelsius =" + ValueOfCelsius);
    }

    public static void ConvertToFahrenheit() {

        double ValueOfCelsius;
        double ValueOfFahrenheit;
        ValueOfFahrenheit = ValueOfCelsius * 1, 8 + 32;
        System.out.println("ValueOfFahrenheit =" + ValueOfFahrenheit);
    }
}
