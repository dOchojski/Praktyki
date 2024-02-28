package com.d_d.praktyki.input.calculator;

import java.util.Locale;
import java.util.Scanner;

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
        OperationInterface operation = getOperation(operator);

        System.out.println("Wprowadź liczbę B: ");
        final double numberB = input.nextDouble();

        Double result = operation.apply(numberA, numberB);
        System.out.println("Wynik: "+result);
    }

    private static OperationInterface getOperation(String operator) {
        return switch (operator) {
            case "+" -> ((a,b) -> a+b);
            case "-" -> ((a,b) -> a-b);
            case "*" -> ((a,b) -> a*b);
            case "/" -> ((a,b) -> a/b);
            default -> throw new IllegalArgumentException("Unexpected operator: " + operator);
        };
    }
}
