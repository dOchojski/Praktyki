package com.d_d.praktyki.SecondWeekSecondYear.Operators;

public class OperatorsDemo {
    public static void main(String[] args) {
        int num1=84,num2=8,num3=12;
        System.out.println("Liczby które są użyte: "+ num1 + ", " + num2);
        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Różnica: " + (num1-num2));
        System.out.println("Iloczyn: " + (num1*num2));
        System.out.println("Iloraz: " + (num1/num2));
        System.out.println("Reszta z dzielenia: " + (num1%num2));

        if(num3%2==0){
            System.out.println("Liczba " + num3 + "jest parzysta");
        }else{
            System.out.println("Liczba " + num3 + " jest nieparzysta");
        }
        if(num3>0){
            System.out.println("Liczba " + num3 + " jest dodatnia");
        }

        System.out.println("\nOperator ++ i --:");
        System.out.println("Pre- ++ i --");
        System.out.println("num3 = " + num3);
        System.out.println("num3++ = " + num3++);
        System.out.println("Po num3++: num3 = " + num3);
        System.out.println("num3-- = " + num3--);
        System.out.println("Po num3--: num3 = " + num3);
        System.out.println("\nPost- ++ i --");
        System.out.println("++num3 = " + ++num3);
        System.out.println("--num3 = " + --num3);
    }
}
