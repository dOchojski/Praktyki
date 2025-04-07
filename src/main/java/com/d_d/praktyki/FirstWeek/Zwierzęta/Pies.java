package com.d_d.praktyki.FirstWeek.Zwierzęta;

public class Pies extends Zwierzeta {
    private String rasa;

    public Pies(String gatunek, String rasa) {
        super(gatunek);
        this.rasa = rasa;
    }

    @Override
    public void informacje() {
        System.out.println("Pies: Gatunek - " + gatunek + ", Rasa - " + rasa);
    }
}
