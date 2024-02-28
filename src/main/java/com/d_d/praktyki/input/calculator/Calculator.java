package com.d_d.praktyki.input.calculator;

import com.d_d.praktyki.input.InputPrompt;

import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    private static final Scanner input = new Scanner(System.in);
    private static final InputPrompt inputPrompt = new InputPrompt(input);

    @FunctionalInterface
    private interface OperationInterface {
        Double apply(Double a, Double b);
    }

    private Calculator() {
        input.useLocale(Locale.US);
    }

    public static void prompt() {
        final double numberA = inputPrompt.promptDouble("Wprowadź liczbę A: ", true);

        final String operator = inputPrompt.prompt("Wprowadź operator [+, -, *, /]: ");
        OperationInterface operation = getOperation(operator);

        final double numberB = inputPrompt.promptDouble("Wprowadź liczbę B: ", true);

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
