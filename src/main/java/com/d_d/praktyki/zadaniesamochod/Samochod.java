package com.d_d.praktyki.zadaniesamochod;

public class Samochod {
    private String marka;
    private String model;
    private int rokProdukcji;

    public Samochod(String marka, String model, int rokProdukcji) {
        this.marka = marka;
        this.model = model;
        setRokProdukcji(rokProdukcji);
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        if (rokProdukcji >= 1900) {
            this.rokProdukcji = rokProdukcji;
        } else {
            System.out.println("Rok produkcji nie może być starszy niż 1900. Ustawiam rok produkcji na 1900.");
            this.rokProdukcji = 1900;
        }
    }
}
