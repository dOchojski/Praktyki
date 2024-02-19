package com.d_d.praktyki;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PraktykiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PraktykiApplication.class, args);
        String marka = "Fiat";
        String model = "Seicento";
        int rocznik = 2005;
        double cena = 2500; // zł

        System.out.println(marka);
        System.out.println(model);
        System.out.println(rocznik);
        System.out.println(cena);
    }

}
