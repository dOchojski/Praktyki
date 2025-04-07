package com.d_d.praktyki.SecondWeek.SumaLiczb;

import java.util.Scanner;

public class SumaLiczb {
    Scanner scanner = new Scanner(System.in);

    public int setIloscLiczb() {
        System.out.print("Podaj ilość liczb do zsumowania: ");
        int iloscLiczb = scanner.nextInt();
        return iloscLiczb;
    }

    public int Suma(int ilosc){
        int suma=0,number;
        for(int i=0;i<ilosc;i++){
            System.out.print("Podaj liczbę " + (i + 1) + ": ");
            number = scanner.nextInt();
            suma+= number;
        }
        return suma;
    }
}
