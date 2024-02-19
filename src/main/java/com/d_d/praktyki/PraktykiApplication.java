package com.d_d.praktyki;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

@SpringBootApplication
public class PraktykiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PraktykiApplication.class, args);

        Osoba adam = new Osoba("Adam", "Kowalski");
        Osoba andrzej = new Osoba("Andrzej", "Nowak");

        KontoBankowe a = new KontoBankowe(adam);
        KontoBankowe b = new KontoBankowe(andrzej);
        try {
            a.wplacPieniadze(5);
            b.wplacPieniadze(2);
            a.wyplacPieniadze(3);
            b.wyplacPieniadze(6);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        a.wyswietlSaldo();
        b.wyswietlSaldo();
    }

}
