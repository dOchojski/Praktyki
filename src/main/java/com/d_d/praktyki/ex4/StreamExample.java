package com.d_d.praktyki.ex4;

import java.util.Arrays;

public class StreamExample {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Wartości początkowe:");
        Arrays.stream(numbers)
                .forEach(StreamExample::printValue);

        System.out.println("\nPrzekształcone wartości (liczby zmiennoprzecinkowe):");
        Arrays.stream(numbers)
                .filter(StreamExample::isOdd)
                .mapToDouble(value -> (double) value) // Transformation to floating-point numbers
                .forEach(StreamExample::printValue);

        System.out.println("\nSuma przekształconych wartości:");
        double sum = Arrays.stream(numbers)
                .filter(StreamExample::isOdd)
                .mapToDouble(value -> (double) value)
                .sum();
        System.out.println("Suma: " + sum);

        System.out.println("Średnia przekształconych wartości:");
        double average = Arrays.stream(numbers)
                .filter(StreamExample::isOdd)
                .mapToDouble(value -> (double) value)
                .average()
                .orElse(0.0);
        System.out.println("Średnia: " + average);
    }

    private static void printValue(double value) {
        System.out.print(value + " ");
    }

    private static boolean isOdd(int number) {
        return number % 2 != 0;
    }
}