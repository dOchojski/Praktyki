package com.d_d.praktyki.kalkulator2;


class Calculator {
    public static double calculate(double num1, char operator, double num2) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Dzielenie przez zero nie jest dozwolone.");
                    return Double.NaN;
                }
            default:
                System.out.println("Nieznany operator.");
                return Double.NaN;
        }
    }
}
