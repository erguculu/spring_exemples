package com.example.myformationproject.model;

public class Panda {
    private KungFu kungFu;

    public Panda() {

    }

    public KungFu getKungFu() {
        return kungFu;
    }

    public void setKungFu(KungFu kungFu) {
        this.kungFu = kungFu;
    }

    @Override
    public String toString() {
        return "Panda{" +
                "kungFu=" + kungFu +
                '}';
    }
}
