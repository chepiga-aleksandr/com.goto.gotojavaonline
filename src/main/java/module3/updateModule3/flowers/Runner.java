package module3.updateModule3.flowers;

public class Runner {

    private static int NUMBER_OF_ROSES_IN_ORDER = 8;

    static Rosebush rosebush = new Rosebush();

    public static void main(String[] args) {
        // задаем количество роз на кусте
        rosebush.setRoses(20);

        System.out.println(rosebush);
        System.out.println("Количество роз в заказе = " + NUMBER_OF_ROSES_IN_ORDER);
        System.out.println("В магазине (в кусте) осталось " + cutRose() + " роз");
    }

    private static int cutRose() {
        int balance = rosebush.getRoses() - NUMBER_OF_ROSES_IN_ORDER;
        return balance;
    }
}
