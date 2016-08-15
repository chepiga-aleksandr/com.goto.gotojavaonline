package module4.updateTemperature;

public class ConvertTemperature {

    public static double inputValue, resultCelsius, resultFahreheit;

    public static void setInputValue(double inputValue) {
        ConvertTemperature.inputValue = inputValue;
    }

    public static Double convertToCelsius() {

        //Magic numbers
        resultCelsius = (inputValue - 32) / 1.8;

        return resultCelsius;
    }

    public static double convertToFahrenheit() {
//Magic numbers
        resultFahreheit = inputValue * 1.8 + 32;

        return resultFahreheit;
    }
}