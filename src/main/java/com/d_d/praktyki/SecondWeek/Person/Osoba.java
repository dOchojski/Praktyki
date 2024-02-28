package com.d_d.praktyki.SecondWeek.Person;

public class Osoba {
    private String imie;
    private String nazwisko;
    private int wiek;


    public void checkWiek(int wiek){
        if(wiek<0){
            System.out.println("Wiek nie może być na minusie. Wiek automatycznie zostanie ustawiony na zero.");
            this.wiek=0;
        }else{}
    }
    public Osoba(String imie, String nazwisko, int wiek){
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.wiek=wiek;
        checkWiek(wiek);
    }
    public void setImie(String imieimie) {
        this.imie = imie;
    }

    public String getImie() {
        return imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public int getWiek() {
        return wiek;
    }
}
