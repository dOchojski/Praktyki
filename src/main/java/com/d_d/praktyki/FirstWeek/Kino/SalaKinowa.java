package com.d_d.praktyki.FirstWeek.Kino;


public class SalaKinowa {
    private Miejsce[][] seats;

    public SalaKinowa(int rows, int columns) {

        seats = new Miejsce[rows][columns];
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                seats[i][j] = new Miejsce(i + 1, j + 1);

            }
        }
    }

    public void rezerwujMiejsce(int rzad, int numerMiejsca) {
        if (rzad > 0 && rzad <= seats.length){
            if(numerMiejsca > 0 && numerMiejsca <= seats[0].length){

                Miejsce miejsce = seats[rzad - 1][numerMiejsca - 1];

                if (!miejsce.Avaiable()) {

                    miejsce.zajmijMiejsce();

                } else {

                    System.out.println("Miejsce " + rzad + "-" + numerMiejsca + " jest już zajęte.");
                }

            } else {
                System.out.println("Podane miejsce nie istnieje.");
            }
        } else {
            System.out.println("Podane miejsce nie istnieje.");
        }
    }
}



