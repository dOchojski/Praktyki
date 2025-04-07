package com.d_d.praktyki.SecondWeek.Produkt;

public class ProduktTest {
    public static void main(String[] args){
        Produkt produkt1 = new Produkt("Banan",3.99,100);
        Produkt produkt2 = new Produkt("Jabłko", 3.50,20);

        produkt1.addIlosc(10);
        produkt1.substractIlosc(100);
        produkt2.substractIlosc(24);
        produkt2.substractIlosc(10);
        produkt2.addIlosc(10);
    }
}
