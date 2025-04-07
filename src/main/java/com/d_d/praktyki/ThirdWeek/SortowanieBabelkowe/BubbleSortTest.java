package com.d_d.praktyki.ThirdWeek.SortowanieBabelkowe;

import java.util.Scanner;

public class BubbleSortTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę elementów tablicy: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Podaj elementy tablicy:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Przed sortowaniem:");
        BubbleSort.printArray(array);

        BubbleSort.bubbleSort(array);

        System.out.println("\nPo sortowaniu:");
        BubbleSort.printArray(array);

        scanner.close();
    }
}
