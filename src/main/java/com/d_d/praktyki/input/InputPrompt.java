package com.d_d.praktyki.input;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputPrompt {
    private final Scanner scanner;

    public InputPrompt(Scanner scanner) {
        this.scanner = scanner;
    }

    public String prompt(String message) {
        System.out.println(message);
        return scanner.next();
    }

    public Double promptDouble(String message, boolean loopOnInvalid) {
        double value = Double.NaN;
        while (loopOnInvalid) {
            try {
                System.out.println(message);
                value = scanner.nextDouble();
            } catch (InputMismatchException e) {
                // clear scanner buffer
                scanner.nextLine();
                continue;
            }
            break;
        }
        return value;
    }
}
