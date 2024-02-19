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

        brand = "BWM";
        model = "M3";
        age = 2020;
        price = 199599.99;

        System.out.println("Marka: " + brand + " Model: " + model + " Rocznik: " + age + " Cena: " + price);
    }
}
