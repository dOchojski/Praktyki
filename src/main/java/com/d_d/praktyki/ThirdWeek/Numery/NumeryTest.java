package com.d_d.praktyki.ThirdWeek.Numery;

public class NumeryTest {
    public static void main(String[] args){
        Numery numery = new Numery();
        int suma=0, numer=0;

        while(true){
            System.out.println("Podaj liczbę");
            numer = numery.input();
            if(numer>100){
                break;
            }else {
                suma+=numer;
            }
        }

        numery.check(suma);
    }
}
