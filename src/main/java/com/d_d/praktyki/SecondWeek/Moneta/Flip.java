package com.d_d.praktyki.SecondWeek.Moneta;

import java.util.Random;
class Flip {
    public static boolean rzutMoneta(int wybor) {
        Random rand = new Random();

        int rzut = rand.nextInt(2);
        return rzut == wybor;
    }

    
    public static void Check(int wybor, boolean traf){
        System.out.println("Wynik rzutu monetą:");
        if (traf) {
            if (wybor == 0) {
                System.out.println("Wypadł orzeł. Gratulacje! Trafiony!");
            } else {
                System.out.println("Wypadła reszka. Gratulacje! Trafiony!");
            }
        } else {
            if (wybor == 0) {
                System.out.println("Wypadła reszka. Niestety, nie trafiłeś.");
            } else {
                System.out.println("Wypadł orzeł. Niestety, nie trafiłeś.");
            }
        }
    }
}
