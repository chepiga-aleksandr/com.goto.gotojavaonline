package module4.updateTemperature;

public class Runner {

//    public String scanner;

    public static void main(String[] args) {

        System.out.println("Выберите вариант пробразования: C - Преобразовать Цельсий в Фаренгейт, " +
                "F - Преобразовать Фаренгейт в Цельсий");
        String sc = inputFromConsole.inputScanner().next();

        switch (sc) {
            case "C":
                System.out.println("Введите значение температуры в градусах Цельсия:");
                convertTemperature.convertToCelsius();
                break;
            case "F":
                System.out.println("введите значение температуры в градусах Фаренгейта:");
                convertTemperature.convertToFahrenheit();
                break;
        }
    }
}

