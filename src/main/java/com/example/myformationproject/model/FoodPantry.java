package com.example.myformationproject.model;

import java.io.Serializable;

public class FoodPantry  implements Serializable {
    private String nom;
    private float price;
    private int nbStock;

    public FoodPantry(String nom, float price, int nbStock) {
        this.nom = nom;
        this.price = price;
        this.nbStock = nbStock;
    }

    @Override
    public String toString() {
        return "FoodPantry{" +
                "nom='" + nom + '\'' +
                ", price=" + price +
                ", nbStock=" + nbStock +
                '}';
    }
}
