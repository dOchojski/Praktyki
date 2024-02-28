package com.d_d.praktyki.input.calculator;

import java.util.Locale;
import java.util.Scanner;
import java.util.function.Function;

public class Calculator {
    private static final Scanner input = new Scanner(System.in);

    @FunctionalInterface
    private interface OperationInterface {
        Double apply(Double a, Double b);
    }

    private Calculator() {
        input.useLocale(Locale.US);
    }

    public static void prompt() {
        System.out.println("Wprowadź liczbę A: ");
        final double numberA = input.nextDouble();

        System.out.println("Wprowadź operator [+, -, *, /]: ");
        final String operator = input.next();

        System.out.println("Wprowadź liczbę B: ");
        final double numberB = input.nextDouble();
    }

    private static OperationInterface getOperation() {
        return (a, b) -> a+b;
    }
}
