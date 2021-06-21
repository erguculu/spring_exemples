package com.example.myformationproject.model;

public class Company {
    private String nom;
    private Developper dev1;
    private Developper dev2;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Developper getDev1() {
        return dev1;
    }

    public void setDev1(Developper dev1) {
        this.dev1 = dev1;
    }

    public Developper getDev2() {
        return dev2;
    }

    public void setDev2(Developper dev2) {
        this.dev2 = dev2;
    }

    @Override
    public String toString() {
        return "Company{" +
                "nom='" + nom + '\'' +
                ", dev1=" + dev1 +
                ", dev2=" + dev2 +
                '}';
    }
}
