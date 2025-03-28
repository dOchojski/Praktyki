package com.d_d.praktyki.zadanieprodukt;

public class Produkt {
    private String nazwa;
    private double cena;
    private int iloscNaStanie;

    public Produkt(String nazwa, double cena, int iloscNaStanie) {
        this.nazwa = nazwa;
        this.cena = cena;
        setIloscNaStanie(iloscNaStanie);
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getIloscNaStanie() {
        return iloscNaStanie;
    }

    public void setIloscNaStanie(int iloscNaStanie) {
        if (iloscNaStanie >= 0) {
            this.iloscNaStanie = iloscNaStanie;
        } else {
            System.out.println("Ilość na stanie nie może być ujemna. Ustawiam ilość na 0.");
            this.iloscNaStanie = 0;
        }
    }

    public void zwiekszIloscNaStanie(int dodatkowaIlosc) {
        if (dodatkowaIlosc >= 0) {
            iloscNaStanie += dodatkowaIlosc;
            System.out.println("Ilość na stanie zwiększona o " + dodatkowaIlosc + ". Aktualna ilość na stanie: " + iloscNaStanie);
        } else {
            System.out.println("Dodatkowa ilość nie może być ujemna.");
        }
    }

    public void zmniejszIloscNaStanie(int odejmowanaIlosc) {
        if (odejmowanaIlosc >= 0) {
            if (iloscNaStanie >= odejmowanaIlosc) {
                iloscNaStanie -= odejmowanaIlosc;
                System.out.println("Ilość na stanie zmniejszona o " + odejmowanaIlosc + ". Aktualna ilość na stanie: " + iloscNaStanie);
            } else {
                System.out.println("Nie można odejmować większej ilości, niż jest dostępna na stanie.");
            }
        } else {
            System.out.println("Odejmowana ilość nie może być ujemna.");
        }
    }
}
