package com.d_d.praktyki.algorytmika;

import java.util.Scanner;

public class ReadNumbers {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int sum = 0;
        int current = 0;

        while (current < 100) {
            current = scanner.nextInt();
            sum += current;
        }

        if (sum % 2 == 0) {
            System.out.println("parzyste");
        }
        else {
            System.out.println("nieparzyste");
        }
    }
}
