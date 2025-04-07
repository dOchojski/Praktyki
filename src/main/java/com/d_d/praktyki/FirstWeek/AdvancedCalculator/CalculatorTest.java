package com.d_d.praktyki.AdvancedCalculator;

public class CalculatorTest {
    public static void main(String[] args){
        double a,b,c;
        Calculator calc = new Calculator();
        System.out.println("Podaj pierwszą liczbę: ");
        a = calc.Input();
        System.out.println("Podaj drugą liczbę: ");
        b = calc.Input();

        c = calc.Operation(a, b);
        System.out.println(c);
    }
}
