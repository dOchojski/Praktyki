package com.d_d.praktyki.FirstWeek.Number;

import java.util.Arrays;
import java.util.OptionalDouble;

public class NumbersTest {
    public static void main(String[] args){
        int[] num = {8,7,-2,91,73,21};

        double[] odd = Arrays.stream(num)
                .filter(number -> number % 2 !=0)
                .mapToDouble(i -> i)
                .toArray();

        Arrays.stream(odd).forEach(System.out::println);


        System.out.println("Suma: " + Arrays.stream(odd).sum());
        System.out.println("Średnia: " + Arrays.stream(odd).average().getAsDouble());

    }
}
