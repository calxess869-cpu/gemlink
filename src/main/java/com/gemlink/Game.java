package com.gemlink;

public class Game {
    private String name;
    private String price;
    private String icon;

    public Game(String name, String price, String icon) {
        this.name = name;
        this.price = price;
        this.icon = icon;
    }

    // Getters
    public String getName() { return name; }
    public String getPrice() { return price; }
    public String getIcon() { return icon; }
}