package updateTemperature;

public class Runner {

//    public String scanner;

    public static void main(String[] args) {

        System.out.println("Выберите вариант пробразования: C - Преобразовать Цельсий в Фаренгейт, " +
                "F - Преобразовать Фаренгейт в Цельсий");

        String selection = InputFromConsole.readChoice();

        switch (selection) {
            case "C":
                System.out.println("Введите значение температуры в градусах Цельсия:");

                double celsius = InputFromConsole.readValue();
                ConvertTemperature.setInputValue(celsius);

                double resultFahrenheit = ConvertTemperature.convertToFahrenheit();
                System.out.println(resultFahrenheit);


                break;
            case "F":
                System.out.println("введите значение температуры в градусах Фаренгейта:");

                double fahrenheit = InputFromConsole.readValue();
                ConvertTemperature.setInputValue(fahrenheit);

                double resultCelsius = ConvertTemperature.convertToCelsius();
                System.out.println(resultCelsius);



                break;
        }
    }
}

