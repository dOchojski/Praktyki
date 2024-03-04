package com.d_d.praktyki.ThirdWeek.Numery;

import java.util.Scanner;
public class Numery {
    Scanner scanner = new Scanner(System.in);

    public int input(){
        int numer = scanner.nextInt();
        return numer;
    }

    public void check(int suma){
        if(suma % 2 ==0){
            parzysta(suma);
        }else {
            nieparzysta(suma);
        }
    }
    public void parzysta(int suma){
        System.out.println("Liczba " + suma + " jest parzysta");
    }
    public void nieparzysta(int suma){
        System.out.println("Liczba " + suma + " jest nieparzysta");
    }
}
