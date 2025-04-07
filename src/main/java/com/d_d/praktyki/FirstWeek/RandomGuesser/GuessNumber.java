package com.d_d.praktyki.RandomGuesser;

import java.util.Random;
import java.util.Scanner;
public class GuessNumber {
    private int RandomNumber = rand.nextInt(100)+1;
    private static Random rand = new Random();
    private Scanner input = new Scanner(System.in);

    public boolean Guessing(){
        System.out.println("Zgadnij liczbę między 1 - 100: ");
        int guess = input.nextInt();

        return Check(guess);
    }

    public boolean Check(int number){
        if (number==RandomNumber){
            System.out.println("To jest poprawna liczba.");
            return true;
        }else if (number>RandomNumber){
            System.out.println("Liczba jest za duża.");
            return false;
        }else {
            System.out.println("Liczba jest za mała.");
            return false;
        }
    }
}
