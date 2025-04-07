package com.d_d.praktyki.Calculator;

public class CalcTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Dodanie trzech: " + calculator.add(15.0f, 8.3f, 78.2f));
        System.out.println("Dodanie dwóch: " + calculator.add(15.0f, 8.3f));
        System.out.println("Odjęcie trzech: " + calculator.substract(15.4f, 34.3f, 2.2f));
        System.out.println("Odjęcie dwóch: " + calculator.substract(15.23f, 3.3f));

    }
}
