package de.reichert.aop;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ShoppingCart {
    private Map<Item, Long> cart = new HashMap<>();
    private long itemCount = 0;
    private long price = 0;

    @Logged
    public long addItem(Item item) {
        long amountOfItem = 0;
        if (cart.containsKey(item)) amountOfItem = cart.get(item);
        amountOfItem++;
        cart.put(item, amountOfItem);
        return amountOfItem;
    }

    @Logged
    public void removeItem(Item item) {
        if (!cart.containsKey(item)) return;
        long amountOfItem = cart.get(item);
        amountOfItem--;
        if (amountOfItem == 0) {
            cart.remove(item);
        } else {
            cart.put(item, amountOfItem);
        }
    }

    public void deleteItem(Item item) {
        cart.remove(item);
    }

    public void checkout() {
        System.out.println("You have " + itemCount + " items in your Cart.");
        System.out.println("The Price is: " + price);
    }

    public void updateItemCount() {
        this.itemCount = cart.values().stream().mapToLong(Long::longValue).sum();
    }

    public void updatePrice() {
        this.price = cart.entrySet().stream()
                .mapToLong(entry -> entry.getKey().getPrice() * entry.getValue())
                .sum();
    }
}
