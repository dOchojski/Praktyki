package com.d_d.praktyki.SecondWeek.Moneta;

import java.util.Scanner;
public class FlipTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybierz numer: 0 (orzeł) lub 1 (reszka):");
        int wybor = scanner.nextInt();

        if (wybor != 0 && wybor != 1) {
            System.out.println("Błędny wybór. Wybierz numer 0 lub 1.");
            return;
        }


        boolean trafiony = Flip.rzutMoneta(wybor);
        Flip.Check(wybor,trafiony);
    }
}
