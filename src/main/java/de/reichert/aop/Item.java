package de.reichert.aop;

public class Item {
    private String name;
    private long price;

    public long getPrice() {
        return price;
    }

    public Item(String name, long price) {
        this.name = name;
        this.price = price;
    }
}
