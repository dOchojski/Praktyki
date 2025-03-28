package com.d_d.praktyki.SecondWeekSecondYear.Loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }

        int num=0;
        while(num<25){
            System.out.println(++num);
        }

        Scanner scanner = new Scanner(System.in);
        int wpisanaLiczba;
        do {
            System.out.print("\nPodaj liczbę (wpisz 0, aby zakończyć): ");
            wpisanaLiczba = scanner.nextInt();
        } while (wpisanaLiczba != 0);

    }
}
