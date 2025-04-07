package com.d_d.praktyki.FirstWeek.Zwierzęta;

public class Kot extends Zwierzeta {
    private String rasa;

    public Kot(String gatunek, String rasa) {
        super(gatunek);
        this.rasa = rasa;
    }

    @Override
    public void informacje() {
        System.out.println("Kot: Gatunek - " + gatunek + ", Rasa - " + rasa);
    }
}
