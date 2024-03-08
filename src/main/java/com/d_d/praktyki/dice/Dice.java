package com.d_d.praktyki.dice;

import java.util.Random;

public class Dice {
    private int sides;
    private Random rand = new Random();
    public Dice() { sides = 6; }
    public Dice(int sides) { this.sides = sides; }

    /**
     * Roll single die.
     * @return random value from range [1, sides+1)
     */
    public int roll() {
        return rand.nextInt(sides)+1;
    }
    /**
     * Roll multiple dice.
     * @param rolls the number of dice to be rolled
     * @return sum of random values each from range [1, sides+1)
     */
    public int roll(int rolls) {
        return rand.ints(1, sides+1)
                .limit(rolls)
                .sum();
    }
}
