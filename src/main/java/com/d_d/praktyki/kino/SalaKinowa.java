package com.d_d.praktyki.kino;

public class SalaKinowa extends Miejsce {
    private Miejsce[][] miejsca;

    public SalaKinowa(int rzedy, int miejscaWRzedzie) {
        super();
        miejsca = new Miejsce[rzedy][miejscaWRzedzie];

        for (int y = 0; y < rzedy; y++) {
            for (int x = 0; x < miejscaWRzedzie; x++) {
                miejsca[y][x] = new Miejsce(y, x);
            }
        }
    }

    public void rezerwujMiejsce(int rzad, int numerMiejsca) {
        Miejsce miejsce = miejsca[rzad][numerMiejsca];

        if (miejsce.czyZajete()) {
            System.out.println(String.format("Miejsce %d w rzędzie %d zostało już zajęte.",
                    numerMiejsca, rzad));
            return;
        }

        miejsce.zajmijMiejsce();
        System.out.println(String.format("Zajęto miejsce %d w rzędzie %d.",
                numerMiejsca, rzad));
    }
}
