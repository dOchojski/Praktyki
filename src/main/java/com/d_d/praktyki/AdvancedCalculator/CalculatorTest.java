package com.d_d.praktyki.AdvancedCalculator;

public class CalculatorTest {
    public static void main(String[] args){
        double a,b,c;
        Calculator calc = new Calculator();
        System.out.println("Podaj pierwszą liczbę: ");
        a = calc.input();
        System.out.println("Podaj drugą liczbę: ");
        b = calc.input();

        c = calc.operation(a, b);
        System.out.println("Wwynik: " + c);
    }
}
