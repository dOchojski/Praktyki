package com.d_d.praktyki.guessnumber;

import java.util.Scanner;

public class GuessTest {
    public static void main(String[] args) {
        int guessingNumber = 70;

        Scanner reader = new Scanner(System.in);
        System.out.println("=== Zgadnij liczbę ===");
        while (true /*number was not guessed*/) {
            System.out.print("Wpisz liczbę (1-100)> ");
            int input = reader.nextInt();
            if (input == guessingNumber) {
                System.out.println("Liczba została odgadnięta!");
                break;
            }
            else if (input < guessingNumber) {
                System.out.println("Za mało!");
            }
            else if (input > guessingNumber) {
                System.out.println("Za dużo!");
            }
        }
    }
}
