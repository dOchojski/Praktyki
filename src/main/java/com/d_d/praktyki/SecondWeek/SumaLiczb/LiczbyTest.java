package com.d_d.praktyki.SecondWeek.SumaLiczb;

public class LiczbyTest {
    public static void main(String[] args){
        SumaLiczb suma1= new SumaLiczb();

        int ilosc = suma1.setIloscLiczb();
        int suma = suma1.Suma(ilosc);
        System.out.println("Ilość liczb: " + ilosc + "\nSuma:" + suma);
    }
}
