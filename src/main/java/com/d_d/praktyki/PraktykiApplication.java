package com.d_d.praktyki;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

class Samochod {
    public void printInfo() {
        System.out.println("== Informacje o samochodzie ===");
        System.out.println("- Marka: " + marka);
        System.out.println("- Model: " + model);
        System.out.println("- Rok produkcji: " + rokProdukcji.toString());
    }
    String marka;
    String model;
    Integer rokProdukcji;
}

@SpringBootApplication
public class PraktykiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PraktykiApplication.class, args);

        Samochod fiat = new Samochod();
        fiat.marka = "Fiat";
        fiat.model = "Seicento";
        fiat.rokProdukcji = 2005;

        fiat.printInfo();
    }

}
