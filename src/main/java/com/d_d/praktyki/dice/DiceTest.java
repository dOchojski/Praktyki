package com.d_d.praktyki.dice;

public class DiceTest
{
    public static void main(String[] args) {
        Dice d6 = new Dice();
        System.out.println("Liczba wyrzuconych oczek to: " + d6.roll());
        d6.roll(5);
    }
}
