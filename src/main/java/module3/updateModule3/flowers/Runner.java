package module3.updateModule3.flowers;

import module3.updateModule3.flowers.Rosebush;

public class Runner {

    //создаем новый обьект куста роз
    static Rosebush rosebush = new Rosebush();

    // задаем количество роз в заказе КОНСТАНТОЙ, к примеру...
    static int numberOfRosesInOrder = 8;

    public static void main(String[] args) {
        // задаем количество роз на кусте
        rosebush.setRoses(20);

        System.out.println(rosebush);
        System.out.println("Количество роз в заказе = " + numberOfRosesInOrder);
        System.out.println("В магазине (в кусте) осталось " + cutRose() + " роз");
    }
    // создаем метод по изьятию роз из куста
    private static int cutRose() {
        int balance = rosebush.getRoses() - numberOfRosesInOrder;
        return balance;
    }
}
