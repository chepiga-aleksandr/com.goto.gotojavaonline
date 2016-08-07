package module6.MusicShopForModule6;

import java.util.List;
import java.util.Map;

public class Runner {

    public static void main(String[] args) throws NonexistentProduct {

        MusicShop shop = new MusicShop();

        shop.storeContent();
        System.out.println("В наличии в магазине:" + shop.storeContent());

        Map<String, Integer> order = shop.order();
        System.out.println("Заказ №1: " + shop.order());
        try {
            List<MusicalInstrument> instrumentsToRemove = shop.prepareInstruments(order);
            System.out.println("Удалено инструментов: " + instrumentsToRemove.size() + ", а именно: " + order.toString());

        } catch (IllegalStateException | NonexistentProduct | IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("В наличии в магазине:" + shop.musicShop.toString());
    }
}