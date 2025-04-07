package com.d_d.praktyki.Dice;


import java.util.Random;

public class Dice {
    int sides;
    Random rolled= new Random();
    public Dice(int sides){//Metoda do kostki z personalizowaną liczbą ścianek
        this.sides=sides;
    }
    public Dice(){//Metoda do sześciennej kostki
        sides=6;
    }
    public int roll(){//Pojedyńcze rzucenie kostką
        return rolled.nextInt(sides)+1;
    }
    public void rolls(int rolls){//Wielo krotne rzucenie kostką
        rolled.ints(1,sides+1)
            .limit(rolls)
            .forEach(element -> System.out.println("Liczba oczek wylosowanych:"+element)
        );

    }

}
