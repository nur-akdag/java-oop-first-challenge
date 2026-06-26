package org.example.enums;

public enum Plan {
    BASIC("Basic", 19),
    PREMIUM("Premium", 39),
    GOLD("Gold", 59);

    private final String name;
    private final int price;

    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
