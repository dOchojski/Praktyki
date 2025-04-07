package com.d_d.praktyki.FirstWeek.Kino;

public class Miejsce {
    private int rzad;
    private int numerMiejsca;
    private boolean zajete;

    public Miejsce(int rzad, int numerMiejsca) {
        this.rzad = rzad;
        this.numerMiejsca = numerMiejsca;
        this.zajete = false;
    }
    public void zajmijMiejsce() {
        if (!zajete) {
            zajete = true;
            System.out.println("Miejsce " + rzad + "-" + numerMiejsca + " zostało zajęte.");
        } else {
            System.out.println("Miejsce " + rzad + "-" + numerMiejsca + " jest już zajęte.");
        }
    }

    public boolean Avaiable(){
        return false;
    }

}
