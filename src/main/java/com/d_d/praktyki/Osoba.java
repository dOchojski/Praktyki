package com.d_d.praktyki;

class Osoba {
    private String imie;
    private String nazwisko;

    Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String fullname() {
        return imie + " " + nazwisko;
    }
}
