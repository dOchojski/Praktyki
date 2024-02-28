package com.d_d.praktyki.SecondWeek.Samochód;

public class Samochod {
    private String marka;
    private String model;
    private int rokProdukcji;


    public Samochod(String marka, String model, int rokProdukcji){
        this.marka = marka;
        this.model = model;
        if (rokProdukcji<1900){
            System.out.println("Błąd. Rok produkcji zostanie automatyczni ustawiony na 1900 rok.");
            this.rokProdukcji=1900;
        }else{
            this.rokProdukcji = rokProdukcji;
        }
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
        if(rokProdukcji<1900){
            System.out.println("Błąd.");
        }else {
            this.rokProdukcji = rokProdukcji;
        }
    }
}
