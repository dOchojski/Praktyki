package com.d_d.praktyki.dice;

public class DiceTest {
    public static void main(String[] args) {
        Dice d6 = new Dice();
        Dice d20 = new Dice(20);
        System.out.println(String.format("d6: " + d6.roll()));
        System.out.println(String.format("5d6: " + d6.roll(5)));
        System.out.println(String.format("d20: " + d20.roll()));
    }
}
