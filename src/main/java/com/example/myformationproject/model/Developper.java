package com.example.myformationproject.model;

import java.io.Serializable;

public class Developper implements Serializable {
    private String nom;
    private int xpYear;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getXpYear() {
        return xpYear;
    }

    public void setXpYear(int xpYear) {
        this.xpYear = xpYear;
    }

    @Override
    public String toString() {
        return "Developper{" +
                "nom='" + nom + '\'' +
                ", xpYear=" + xpYear +
                '}';
    }
}

