package com.d_d.praktyki.guessnumber;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int guessingNumber = rand.nextInt(100)+1;
    private static Random rand = new Random();
    private Scanner reader = new Scanner(System.in);
    public boolean prompt() {
        System.out.print("Wpisz liczbę (1-100)> ");
        int input = reader.nextInt();
        return handle(input);
    }
    private boolean handle(int input) {
        if (input == guessingNumber) {
            System.out.println("Liczba została odgadnięta!");
            return true;
        }
        else if (input < guessingNumber) {
            System.out.println("Za mało!");
            return false;
        }
        else /*(input > guessingNumber)*/ {
            System.out.println("Za dużo!");
            return false;
        }
    }
}
