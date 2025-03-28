package com.d_d.praktyki.SecondWeekSecondYear.VariableDemo;

public class VariablesDemo {

    public static void main(String[] args) {
        int myInt = 42;
        double myDouble = 3.14;
        boolean myBoolean = true;
        char myChar = 'A';

        System.out.println("Wartość int: " + myInt);
        System.out.println("Wartość double: " + myDouble);
        System.out.println("Wartość boolean: " + myBoolean);
        System.out.println("Wartość char: " + myChar);

        int maxInt = Integer.MAX_VALUE;
        System.out.println("\nMaksymalna wartość int: " + maxInt);
        int overflowInt = maxInt + 2;
        System.out.println("Wartość po przekroczeniu zakresu (overflow): " + overflowInt);

        double num1 = 12.5;
        double num2 = 4.3;

        double add = num1 + num2;
        double subtract = num1 - num2;
        double multiply = num1 * num2;
        double divide = num1 / num2;

        System.out.println("\nOperacje na zmiennych typu double:");
        System.out.println("Double nr. 1: " + num1 +"|Double nr. 2: " + num2);
        System.out.println("Suma: " + add);
        System.out.println("Różnica: " + subtract);
        System.out.println("Iloczyn: " + multiply);
        System.out.println("Iloraz: " + divide);
    }
}
