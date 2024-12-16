package com.example.makeupapp;
public class Item {
    private String name;       // Nom de l'article
    private double price;      // Prix de l'article
    private int imageResource; // Référence à l'image de l'article dans les ressources (drawable)

    // Constructeur
    public Item(String name, double price, int imageResource) {
        this.name = name;
        this.price = price;
        this.imageResource = imageResource;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getImageResource() {
        return imageResource;
    }
}
