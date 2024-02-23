package com.d_d.praktyki.kino;

public class Miejsce {
    private int rzad;
    private int numerMiejsca;
    private boolean zajete = false;

    protected Miejsce() {}

    public Miejsce(int rzad, int numerMiejsca) {
        this.rzad = rzad;
        this.numerMiejsca = numerMiejsca;
    }

    public boolean czyZajete() { return zajete; }

    public void zajmijMiejsce() { zajete = true; }

}
