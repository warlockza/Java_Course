

import java.util.*;

public class Cart {

    private Map<ShopItem, Integer> items = new HashMap<ShopItem, Integer>();

    public void addItem(ShopItem item) {
        if (items.containsKey(item)) {
            int number = items.get(item);
            number++;
            items.put(item, number);
        } else {
            items.put(item, 1);
        }
    }

    public void clear() {
        items.clear();
    }

    /**
     * Two for the price of one!!
     * @return the total price of the items in the cart
     */
    public double getPrice() {
        double price = 0.0;

        for (ShopItem item : items.keySet()) {
            int number = items.get(item);
            price += ((number + 1) / 2) * item.getPrice();
        }

        return price;
    }

    public void removeItem(ShopItem item) {
        if (items.containsKey(item)) {
            int number = items.get(item);
            number--;
            items.remove(item);
            if (number > 0) {
                items.put(item, number);
            }
        }
    }
}
