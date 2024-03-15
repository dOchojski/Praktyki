package com.d_d.praktyki.sumowanie;

import java.util.Scanner;

public class SumCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number;

        do {
            System.out.print("Podaj liczbę całkowitą (lub liczbę większą od 100, aby zakończyć): ");
            number = scanner.nextInt();

            if (number <= 100) {
                sum += number;
            }

        } while (number <= 100);

        System.out.println("Suma wprowadzonych liczb: " + sum);

        if (sum % 2 == 0) {
            System.out.println("Suma jest liczbą parzystą.");
        } else {
            System.out.println("Suma nieparzysta.");
        }
    }
}
