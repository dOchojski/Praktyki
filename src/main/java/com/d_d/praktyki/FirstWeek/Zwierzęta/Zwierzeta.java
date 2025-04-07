package com.d_d.praktyki.FirstWeek.Zwierzęta;

public abstract class Zwierzeta {
    protected String gatunek;

    public Zwierzeta(String gatunek) {
        this.gatunek = gatunek;
    }

    public String getGatunek() {
        return gatunek;
    }

    public abstract void informacje();
}
