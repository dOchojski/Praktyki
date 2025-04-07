package com.d_d.praktyki.SecondWeek.Samochód;

public class SamochodTest {
    public static void main(String[] args){
        Samochod samochod1 = new Samochod("Fiat", "Sciento", 2000);
        Samochod samochod2 = new Samochod("Shelby", "Cobra", 1890);

        samochod2.setRokProdukcji(1968);
        System.out.println("Model: " + samochod2.getModel()+ "Marka: " + samochod2.getMarka() + "Rok Produkcji: " + samochod2.getRokProdukcji());
    }
}
