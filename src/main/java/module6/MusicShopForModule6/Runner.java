package module6.MusicShopForModule6;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.jar.Manifest;

public class Runner {

        public static void main(String[] args) {
            MusicShop shop = new MusicShop();
//создание мапы магазина
            Map<String, Integer> musicShop = new HashMap<>();
//наполнили магазин
            musicShop.put("guitar", 16);
            musicShop.put("piano", 23);
            musicShop.put("trumpet", 17);
            System.out.println("В наличии в магазине:" + musicShop);

            System.out.println(shop);
//          return shop;
//          return shop;
//          prepareInstruments();
        }
        public List<MusicalInstrument> prepareInstruments(Map<String, Integer> order) {

          order = new HashMap<>();
          order.put("guitar", 6);
          order.put("piano", 2);
          order.put("trumpet", 7);

            int numberOfGuitarsToRemove = order.get("guitar");
            int numberOfPianosToRemove = order.get("piano");
            int numberOfTrumpetsToRemove = order.get("trumpet");

            shop.setGuitars(shop.getGuitars() - numberOfGuitarsToRemove);
            shop.setPianos(shop.getPiano() - numberOfPianosToRemove);
            shop.setTrumpets(shop.getTrumpets() - numberOfTrumpetsToRemove);

            System.out.println("Заказано:" + order);

        }
    }
