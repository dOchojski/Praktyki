package com.d_d.praktyki.debug;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAdder {
    public static void main(String[] args) {
        int[] array = createEvenArray(5);
        reverseArray(array);
        System.out.println(Arrays.toString(array));
    }

    private static int[] createEvenArray(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] result = new int[size];
        int count = 0;

        while (count < size) {
            System.out.println("Podaj kolejną liczbę:");

            int next = scanner.nextInt();
            if (isEven(next)) {
                result[count] = next;
                count++;
            } else {
                System.out.println("Podana liczba nie jest parzysta. Podaj liczbę parzystą.");
            }
        }
        return result;
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static void reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        System.arraycopy(reversed, 0, array, 0, array.length);
    }
}
