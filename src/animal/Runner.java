package animal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Runner {

    public static void main(String[] args) {
        PetShop shop = new PetShop();
        shop.setDogs(100);
        shop.setCats(100);

        System.out.println(shop);

        Map<String, Integer> order = new HashMap<>();
        order.put("dog", 20);
        order.put("cat", 20);

        List<Animal> dogsToRemove = prepareOrder(shop, order);
        System.out.println("removed dogs: " + dogsToRemove.size());

        System.out.println(shop);

    }

    private static List<Animal> prepareOrder(PetShop shop, Map<String, Integer> order) {
        int numberOfDogsToRemove = order.get("dog");
        int numberOfCatsToRemove = order.get("cat");

        //if (shop.getDogs() < numberOfDogsToRemove) throw new IllegalStateException("Столько собак нет в магазине");
        //if (shop.getCats() < numberOfCatsToRemove) throw new IllegalStateException("Столько кошек нет в магазине");

        if (shop.getDogs() < numberOfDogsToRemove) throw new IllegalStateException ("Столько собак нет в магазине");
        if (shop.getCats() < numberOfCatsToRemove) throw new IllegalStateException ("Столько кошек нет в магазине");

        shop.setDogs(shop.getDogs() - numberOfDogsToRemove);
        shop.setCats(shop.getCats() - numberOfCatsToRemove);

        List<Animal> result = new ArrayList<>();
        for (int i = 0; i < numberOfDogsToRemove; i++) {
            result.add(new Dog());
        }
        for (int i = 0; i < numberOfCatsToRemove; i++) {
            result.add(new Cat());
        }
        return result;
    }


}
