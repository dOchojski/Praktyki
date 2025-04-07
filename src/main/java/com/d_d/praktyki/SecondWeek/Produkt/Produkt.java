package com.d_d.praktyki.SecondWeek.Produkt;

public class Produkt {
    private String nazwa;
    private double cena;
    private int iloscNaStanie;

    public Produkt(String nazwa, double cena, int iloscNaStanie){
        this.nazwa=nazwa;
        this.cena=cena;
        this.iloscNaStanie=iloscNaStanie;
    }

    public void addIlosc(int number){
        iloscNaStanie+=number;
        System.out.println("Produkt: "+ nazwa);
        System.out.println("Ilość na stanie po dodaniu: " + iloscNaStanie);
    }
    public void substractIlosc(int number){
        System.out.println("Produkt: "+ nazwa);
        if(iloscNaStanie==0) {
            System.out.println("Brak produktu na stanie.");
        }else {
            if(iloscNaStanie-number<0) {
                System.out.println("Ilość na Stanie po odjęciu będzie mniejsza niż zero. Ilość na stanie zostanie ustawiona na zero.");
                iloscNaStanie=0;
            }else{
                iloscNaStanie-=number;
                System.out.println("Ilość na stanie po odjęciu: " + iloscNaStanie);
            }
        }
    }
}
