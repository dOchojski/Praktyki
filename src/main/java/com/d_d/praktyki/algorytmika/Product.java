package com.d_d.praktyki.algorytmika;

import java.util.Scanner;

public class Product {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Determine sign of product of 5 next numbers.
        int index = 0;
        int multi = 1;
        int next = 0;

        for (; index < 5; index++) {
            next = scanner.nextInt();
            multi = multi * next;
        }

        if (multi < 0) System.out.println("ujemna");
        else System.out.println("nieujemna");
    }
}
