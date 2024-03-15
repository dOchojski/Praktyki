package com.d_d.praktyki.cinema;

public class Miejsce {
    int rzad;
    int numerMiejsca;
    boolean zajete;
    public Miejsce(int rzad, int numerMiejsca) {
        this.rzad = rzad;
        this.numerMiejsca = numerMiejsca;
        this.zajete = false;
    }

    public void zajmijMiejsce() {
        this.zajete = true;
    }
}
