package com.d_d.praktyki.dice;

import java.util.Random;
public class Dice {
    int sides;
    Random rand = new Random();
    public Dice(){
        sides = 6;
    }
    public Dice(int sides){
        this.sides = sides;
    }
    public int roll(){
        return rand.nextInt(sides)+1;
    }
    public void roll(int rolls) {
         rand.ints(1, sides+1)
                .limit(rolls)
                .forEach(element ->
                {
                    System.out.println("Liczba wyrzuconych oczek to: " +element);
                }
         );
    }
}
