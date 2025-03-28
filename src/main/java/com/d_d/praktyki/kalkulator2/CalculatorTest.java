package com.d_d.praktyki.kalkulator2;

import java.util.Scanner;


public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wprowadź pierwszą liczbę: ");
        double num1 = scanner.nextDouble();

        System.out.print("Wprowadź operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Wprowadź drugą liczbę: ");
        double num2 = scanner.nextDouble();

        double result = Calculator.calculate(num1, operator, num2);
        System.out.println("Wynik: " + result);
    }
}
