package com.d_d.praktyki.ThirdWeek.Multi;

import java.util.Scanner;

public class Multi {
    Scanner scanner = new Scanner(System.in);
    public int input(){
        int number = scanner.nextInt();
        return number;
    }
    public void check(int multi){
        if(multi >=0){
            dodatnia(multi);
        }else {
            ujemna(multi);
        }
    }
    public void dodatnia(int suma){
        System.out.println("Liczba " + suma + " nie jest ujemna");
    }
    public void ujemna(int suma){
        System.out.println("Liczba " + suma + " jest ujemna");
    }
}
