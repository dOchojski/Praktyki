package com.d_d.praktyki.KontoBankowe;

public class Osoba {
    private String imie;
    private String nazwisko;

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String fullname() {
        return imie + " " + nazwisko;
    }
}
