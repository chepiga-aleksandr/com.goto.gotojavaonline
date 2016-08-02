package module8;

import java.util.*;

public class Runner {

    private static int NUMBER_OF_ROSES_IN_ORDER = 8;

    static Rosebush rosebush = new Rosebush();

    public static void main(String[] args) {

        TreeSet<Aster> asters = new TreeSet<>();
        asters.add(new Aster("Anna", "yellow", 10));
        asters.add(new Aster("Anna", "white", 10));
        asters.add(new Aster("Anna", "yellow", 70));
        asters.add(new Aster("Anna", "pink", 20));
        asters.add(new Aster("Lena", "black", 5));

        System.out.println(asters);

        LinkedList<Flower> newBouquet = new LinkedList<Flower>();

        newBouquet.add(new Aster("Luna", "black", 3));
        newBouquet.add(new Rose("Road", "white",5 ));
        newBouquet.add(new Tulip("Elena", "pink",7));
        System.out.println(newBouquet);

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
