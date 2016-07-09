package module6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {

        MusicShop shop = new MusicShop();
        shop.setGuitars(16);
        shop.setPianos(2);
        shop.setTrumplets(7);
        System.out.println(shop);

        Map<String, Integer> order = new HashMap<>();
        order.put("guitar", 7);
        order.put("piano", 1);
        order.put("trumplet", 2);

        List<MusicInstrument> instrumentsToRemove = prepareOrder(shop, order);
        System.out.println("Removed instruments: " + instrumentsToRemove.size());
        System.out.println(shop);
    }
    private static List<MusicInstrument> prepareOrder(MusicShop shop, Map<String, Integer> order) {
        int numberOfGuitarsToRemove = order.get("guitar");
        int numberOfPianosToRemove = order.get("piano");
        int numberOfTrampletsToRemove = order.get("trumplet");

        if (shop.getGuitars() < numberOfGuitarsToRemove) throw new IllegalStateException();
        if (shop.getPianos() < numberOfPianosToRemove) throw new IllegalStateException();
        if (shop.getTrumplets() < numberOfTrampletsToRemove) throw new IllegalStateException();

        shop.setGuitars(shop.getGuitars() - numberOfGuitarsToRemove);
        shop.setPianos(shop.getPianos() - numberOfPianosToRemove);
        shop.setTrumplets(shop.getTrumplets() - numberOfTrampletsToRemove);

        List<MusicInstrument> result = new ArrayList<>();

        for (int i = 0; i < numberOfGuitarsToRemove; i++) {
            result.add(new Guitar());
        }
        for (int i = 0; i < numberOfPianosToRemove; i++) {
            result.add(new Piano());
        }
        for (int i = 0; i < numberOfTrampletsToRemove; i++) {
            result.add(new Trumplet());
        }
        return result;
    }
}