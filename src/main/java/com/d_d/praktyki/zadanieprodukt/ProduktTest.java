package com.d_d.praktyki.zadanieprodukt;

public class ProduktTest {
    public static void main(String[] args) {
        Produkt produkt = new Produkt("Czekolada",5.90,20);
        produkt.zmniejszIloscNaStanie(5);
        produkt.zmniejszIloscNaStanie(2);

        produkt.zwiekszIloscNaStanie(50);
        produkt.zmniejszIloscNaStanie(100);
    }
}
