package com.d_d.praktyki.NumberCheck;

public class CheckNumbersTest {
    public static void main(String[] args){

        CheckNumber check = new CheckNumber();

        check.NumberCheck();
        System.out.println("Liczba uzupełniona do  cyfr: " + check.FourDigits());
    }
}
