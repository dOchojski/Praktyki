package com.d_d.praktyki;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PraktykiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PraktykiApplication.class, args);

        String brand;
        String model;
        int age;
        double price;

        brand="Fiat";
        model = "600e";
        age=2023;
        price=170000.00;

        System.out.println("Marka: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Rocznik: "+age);
        System.out.println("Cena: "+price);

    }

}
