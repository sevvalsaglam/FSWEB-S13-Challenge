package org.example;

public enum Plan {
    BASIC();
    private String name;
    private int price;

    Plan(String name, int price){
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }
}
