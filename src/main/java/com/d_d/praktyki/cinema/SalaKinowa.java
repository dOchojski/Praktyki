

package com.d_d.praktyki.cinema;

public class SalaKinowa extends Miejsce{
    private Miejsce[][] miejsca;
    public SalaKinowa(int liczbaRzedow, int miejscaWRzedzie) {
        super(0, 0);

        this.miejsca = new Miejsce[liczbaRzedow][miejscaWRzedzie];

        for (int i = 0; i < liczbaRzedow; i++) {
            for (int j = 0; j < miejscaWRzedzie; j++) {
                miejsca[i][j] = new Miejsce(i + 1, j + 1);
            }
        }
    }

    public void rezerwujMiejsce(int rzad, int numerMiejsca) {
        if (rzad > 0 && rzad <= miejsca.length && numerMiejsca > 0 && numerMiejsca <= miejsca[0].length) {
            Miejsce miejsce = miejsca[rzad - 1][numerMiejsca - 1];
            if (miejsce.zajete == false) {
                miejsce.zajmijMiejsce();
                System.out.println("Miejsce zarezerwowane: Rząd " + rzad + ", Miejsce " + numerMiejsca);
            } else {
                System.out.println("Miejsce już zajęte: Rząd " + rzad + ", Miejsce " + numerMiejsca);
            }
        } else {
            System.out.println("Niepoprawne miejsce: Rząd " + rzad + ", Miejsce " + numerMiejsca);
        }
    }
}

class Main {
    public static void main(String[] args) {
        SalaKinowa sala = new SalaKinowa(5, 10);

        sala.rezerwujMiejsce(2, 5);
        sala.rezerwujMiejsce(3, 7);
        sala.rezerwujMiejsce(2, 5);


    }
}

