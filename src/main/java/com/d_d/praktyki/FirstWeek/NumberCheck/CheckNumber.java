package com.d_d.praktyki.NumberCheck;

import java.util.Random;

public class CheckNumber {

    private int number = rand.nextInt(9999)+1;
    private static Random rand = new Random();


    public void NumberCheck(){
        System.out.println("Liczba która została wylosowana to " + number);
        if (number>5000){
            System.out.println(number + " jest większa od 5000.");
        } else if (number<5000){
            System.out.println(number + " jest mniejsza od 5000.");
        } else {
            System.out.println(number + " jest równa 5000.");
        }

        if (number % 2 == 0) {
            System.out.println(number + " to liczba parzysta.");
        } else {
            System.out.println(number + " to liczba nieparzysta.");
        }
    }

    public int FourDigits(){
        if (number==0){
            return 0;
        }else if (number<10){
            return number*1000;
        }else if (number<100){
            return number*100;
        }else if (number<1000){
            return number*10;
        }else {
            return number;
        }
    }
}
