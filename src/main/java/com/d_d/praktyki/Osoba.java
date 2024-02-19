package com.d_d.praktyki;

class Osoba {
    Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String fullname() {
        return imie + " " + nazwisko;
    }

    private String imie;
    private String nazwisko;
}
