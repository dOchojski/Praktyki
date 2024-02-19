package com.d_d.praktyki;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PraktykiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PraktykiApplication.class, args);

        Samochod dodge = new Samochod();
        dodge.marka = "Dodge";
        dodge.model = "Charger SRT";
        dodge.rokProdukcji = 2022;
        System.out.println("Twój samochód to: " + dodge.marka + " " + dodge.model + " " + dodge.rokProdukcji);
    }
}
class Samochod{
    String marka;
    String model;
    int rokProdukcji;
}
