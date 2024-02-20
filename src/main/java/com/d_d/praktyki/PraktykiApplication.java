package com.d_d.praktyki;

import com.d_d.praktyki.KontoBankowe.KontoBankowe;
import com.d_d.praktyki.KontoBankowe.Osoba;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PraktykiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PraktykiApplication.class, args);

        Osoba adam = new Osoba("Adam", "Kowalski");
        Osoba andrzej = new Osoba("Andrzej", "Nowak");

        KontoBankowe a = new KontoBankowe(adam);
        KontoBankowe b = new KontoBankowe(andrzej);

        // wpłacana/wypłacana kwota nie może być ujemna
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
