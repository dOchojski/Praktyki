package com.d_d.praktyki.SecondWeekSecondYear.Arrays;

public class Arrays {
    public static void main(String[] args) {

        int[] arr = {16, 28, 32, 40, 51};
        System.out.println("Elementy tablicy jednowymiarowej:");
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();

        int[][] tablica2D = {
                {8, 2, 9},
                {6, 4, 12},
                {1, 25, 0}
        };
        System.out.println("\nElementy tablicy dwuwymiarowej:");
        for (int i = 0; i < tablica2D.length; i++) {
            for (int j = 0; j < tablica2D[i].length; j++) {
                System.out.print(tablica2D[i][j] + " ");
            }
            System.out.println();
        }

        double srednia = obliczSrednia(arr);
        System.out.println("\nŚrednia arytmetyczna elementów tablicy: " + srednia);
    }

    public static double obliczSrednia(int[] arr) {
        int sum = 0;
        for (int i=0;i<arr.length;i++) {
            sum += arr[i];
        }
        return (double)sum / arr.length;
    }
}
