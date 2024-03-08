package com.d_d.praktyki.streams.numbers;

import java.util.Arrays;

public class StreamTest {
    public static void main(String[] args) {
        int[] numbers = {1, -2, 5, 7, 90};

        double[] even = Arrays.stream(numbers)
                .filter(number -> number % 2 == 0)
                .mapToDouble(i -> i)
                .toArray();

        Arrays.stream(even).forEach(number -> {
            System.out.println(number);
        });

        double sum = Arrays.stream(even).sum();
        double avg = Arrays.stream(even).average().getAsDouble();

        System.out.println(String.format("Suma: %f", sum));
        System.out.println(String.format("Średnia: %f", avg));
    }
}
