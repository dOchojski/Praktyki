package com.d_d.praktyki.Dice;


public class DiceTest {
    public static void main(String[] args) {
        Dice d6 = new Dice();
        Dice d20 = new Dice(20);
        System.out.println("Liczba oczek ktorą wylosowałeś: "+d6.roll());
        d6.rolls(7);
        d20.rolls(5);
    }
    }
