package com.d_d.praktyki.conditionalstatements;

import java.util.Random;

public class ValueCheck {
    private int value = rand.nextInt(9999 + 1);
    static private Random rand = new Random();

    public ValueCheck() {
        if (value < 5000) {
            System.out.println(value+" jest mniejsza od 5000");
        } else if (value > 5000) {
            System.out.println(value+" jest większa od 5000");
        } else {
            System.out.println(value+" jest równa 5000");
        }

        System.out.println(String.format("%d jest %s",
                value,
                (value % 2 == 0) ? "parzysta" : "nieparzysta"
        ));
    }

    public int getFormattedValue() {
        int digits = (int) Math.floor(Math.log10(value) + 1);

        if (digits == 4 || value == 0) return value;
        else return value * (int)Math.pow(10, 4 - digits);
    }
}
