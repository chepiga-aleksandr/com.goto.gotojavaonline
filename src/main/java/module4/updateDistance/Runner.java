package module4.updateDistance;

public class Runner {

    public static void main(String[] args) {
        System.out.println("Введите значения координат точек - ");

        InputFromConsole.readOfData();

        System.out.println("Расстояние между точками: " + CalculationOfCoordinate.resultOgCalc());
    }
}
