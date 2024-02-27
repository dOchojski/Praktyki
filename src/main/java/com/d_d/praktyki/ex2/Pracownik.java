package com.d_d.praktyki.ex2;

public class Pracownik {
    private String imie;
    private double wynagrodzenie;

    public Pracownik(String imie, double wynagrodzenie) {
        this.imie = imie;
        this.wynagrodzenie = wynagrodzenie;
    }

    public String getImie() {
        return imie;
    }

    public double getWynagrodzenie() {
        return wynagrodzenie;
    }
}
