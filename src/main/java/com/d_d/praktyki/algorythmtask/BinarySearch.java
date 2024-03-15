package com.d_d.praktyki.algorythmtask;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Podaj elementy posortowanej tablicy (oddzielone spacjami): ");
            String input = scanner.nextLine();
            int[] sortedArray = Arrays.stream(input.split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .sorted()
                    .toArray();

            System.out.println("Posortowana tablica: " + Arrays.toString(sortedArray));

            System.out.print("Podaj liczbę do wyszukania: ");
            int target = scanner.nextInt();

            int result = binarySearch(sortedArray, target);

            if (result != -1) {
                System.out.println("Liczba " + target + " znajduje się w tablicy na indeksie: " + result);
            } else {
                System.out.println("Liczba " + target + " nie znajduje się w tablicy.");
            }
        }
    }
    private static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            }

            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
