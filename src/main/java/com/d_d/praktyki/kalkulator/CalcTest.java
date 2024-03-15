package com.d_d.praktyki.kalkulator;

public class CalcTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(15.5f,2.87f,3.08f));
        System.out.println(calculator.add(15.5f,2.87f));
        System.out.println(calculator.subtract(15.5f,2.87f,3.08f));
        System.out.println(calculator.subtract(15.5f,2.87f));

    }
}
