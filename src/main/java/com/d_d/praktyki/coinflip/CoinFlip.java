package com.d_d.praktyki.coinflip;

import java.util.Random;
import java.util.Scanner;

public class CoinFlip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wybierz: 0 (reszka) lub 1 (orzeł): ");
        int userChoice = scanner.nextInt();

        Random random = new Random();
        int flipResult = random.nextInt(2);

        System.out.println("Wynik rzutu monetą: " + flipResult);

        if (userChoice == flipResult) {
            if (flipResult == 1) {
                System.out.println("Gratulacje! Trafiony orzeł!");
            } else {
                System.out.println("Gratulacje! Trafiona reszka!");
            }
        } else {
            System.out.println("Niestety, nie tym razem. Spróbuj jeszcze raz.");
        }
    }
}