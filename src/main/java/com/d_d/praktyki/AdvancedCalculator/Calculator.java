package com.d_d.praktyki.AdvancedCalculator;

import java.util.Scanner;

public class Calculator {
    private final Scanner input = new Scanner(System.in);
    public double input(){
        double number;
        number = input.nextDouble();
        return number;
    }
    public double operation(double a, double b){
        double equal;
        System.out.println("Podaj symbol matematyczny(+,-,*,/):");
        char symbol= input.next().charAt(0);
        equal = checkOperation(symbol, a, b);
        return equal;
    }
    public double checkOperation(char symbol, double a, double b){
        if(symbol=='+'){
            return add(a , b);
        } else if (symbol=='-'){
            return substract(a, b);
        } else if (symbol=='*'){
            return  multiply(a, b);
        } else if (symbol=='/'){
            return divide(a, b);
        }else{
            System.out.println("ERROR- Nie rozpoznano znaku");
            return 0;
        }
    }
    public double add(double a, double b){
        return a+b;
    }
    public  double substract(double a, double b){
        return a-b;
    }
    public double multiply(double a, double b){
        return a*b;
    }
    public double divide(double a, double b){
        if(b!=0) {
            return a / b;
        }else{
            System.out.println("Error");
            return 0;
        }
    }
}
