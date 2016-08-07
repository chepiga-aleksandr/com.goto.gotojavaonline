package module6.MusicShopForModule6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MusicShop {

    Map<String, Integer> musicShop = new HashMap<>();

    public Map storeContent() {

        musicShop.put("guitar", 16);
        musicShop.put("piano", 2);
        musicShop.put("trumpet", 7);
        return musicShop;
    }

    public Map<String, Integer> order() {
        Map<String, Integer> order = new HashMap<>();
        order.put("guitar", 10);
        order.put("piano", 0);
        order.put("trumpet", 2);
        return order;
    }

    public List<MusicalInstrument> prepareInstruments(Map<String, Integer> order) throws NonexistentProduct {

        List<MusicalInstrument> toRemove = new ArrayList<>();
        String typeInOrder = null;
        int amountInOrder = 0;

        for (Map.Entry<String, Integer> entry : order.entrySet()) {
            typeInOrder = entry.getKey();
            amountInOrder = entry.getValue();

            if (!musicShop.containsKey(typeInOrder))
                throw new NonexistentProduct("Такого товара не существует" + typeInOrder);
            if (musicShop.get(typeInOrder) < amountInOrder)
                throw new IllegalStateException("Нет такого количества товара");
            if (amountInOrder < 0)
                throw new IllegalArgumentException("Количество инструментов не может " + "быть отрицательным!");
            if (amountInOrder == 0) System.out.println("Вы ввели нулевое количество заказа - " + typeInOrder);
            for (int i = 0; i < amountInOrder; i++) {
                toRemove.add(new MusicalInstrument(typeInOrder));
            }

            int inShop = musicShop.get(typeInOrder);

            musicShop.put(typeInOrder, inShop - amountInOrder);
        }
        return toRemove;
    }
}

