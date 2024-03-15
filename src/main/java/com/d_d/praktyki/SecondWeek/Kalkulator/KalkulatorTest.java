package com.d_d.praktyki.SecondWeek.Kalkulator;

public class KalkulatorTest {
    public static void main(String[] args){
        double a,b,c;
        Kalkulator calc = new Kalkulator();
        System.out.println("Podaj pierwszą liczbę(Cześciową liczbę piszemy z przecinkiem.) : ");
        a = calc.Input();
        System.out.println("Podaj drugą liczbę(Cześciową liczbę piszemy z przecinkiem.): ");
        b = calc.Input();

        c = calc.Operation(a, b);
        System.out.println(c);
    }
}
