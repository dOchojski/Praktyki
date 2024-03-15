package com.d_d.praktyki.SecondWeek.Kalkulator;

import java.util.Scanner;

public class Kalkulator {
    private final Scanner input = new Scanner(System.in);
    public double Input(){
        double number;
        number = input.nextDouble();
        return number;
    }
    public double Operation(double a, double b){
        double equal;
        System.out.println("Podaj symbol matematyczny(+,-,*,/):");
        char symbol= input.next().charAt(0);
        equal = checkOperation(symbol, a, b);
        return equal;
    }
    public double checkOperation(char symbol, double a, double b){
        switch(symbol) {
            case '+':
                return add(a , b);
            case '-':
                return substract(a, b);
            case '*':
                return  multiply(a, b);
            case '/':
                return divide(a, b);
            default:
                System.out.println("ERROR- Nie rozpoznano znaku");
                return 0;
        }
    }
    public double add(double a, double b){
        System.out.println("Wynik dodawania: ");
        return a+b;
    }
    public  double substract(double a, double b){
        System.out.println("Wynik odejmowania: ");
        return a-b;
    }
    public double multiply(double a, double b){
        System.out.println("Wynik mnożenia: ");
        return a*b;
    }
    public double divide(double a, double b){
        System.out.println("Wynik dzielenia: ");
        return a/b;
    }
}