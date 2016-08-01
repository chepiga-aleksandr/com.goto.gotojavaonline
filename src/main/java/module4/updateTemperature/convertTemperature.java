package module4.updateTemperature;

import java.util.Scanner;

public class convertTemperature {

    public static double inputCelsius, inputFahrenheit, resultCelsius, resultFahreheit;

    public static Double convertToCelsius() {
        inputFahrenheit = inputFromConsole.inputScanner().nextDouble();
//Magic numbers
        resultCelsius = (inputFahrenheit - 32)/1.8;
        System.out.println(resultCelsius);
        return resultCelsius;
    }
    public static double convertToFahrenheit() {
        inputCelsius = inputFromConsole.inputScanner().nextDouble();
//Magic numbers
        resultFahreheit = inputCelsius * 1.8 + 32;
        System.out.println(resultFahreheit);
        return resultFahreheit;
    }
}