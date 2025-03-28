package com.d_d.praktyki.sumnumbers;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę liczb do wprowadzenia: ");
        int numbersCount = scanner.nextInt();

        int sum = 0;

        for (int i = 0; i < numbersCount; i++) {
            System.out.print("Podaj liczbę #" + (i + 1) + ": ");
            int number = scanner.nextInt();
            sum += number;
        }

        System.out.println("Suma wprowadzonych liczb: " + sum);
    }
}
