package com.d_d.praktyki;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PraktykiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PraktykiApplication.class, args);

        Samochod fiat = new Samochod();
        fiat.marka="Fiat";
        fiat.model="900e";
        fiat.rokProdukcji=2023;
        System.out.println("Marka: "+fiat.marka);
        System.out.println("Model: "+fiat.model);
        System.out.println("Rocznik: "+fiat.rokProdukcji);
    }

}
class Samochod {
    String marka;
    String model;
    int rokProdukcji;
}