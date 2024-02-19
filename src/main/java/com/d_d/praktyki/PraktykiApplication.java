package com.d_d.praktyki;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

class Osoba {
    Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String fullname() {
        return imie+" "+nazwisko;
    }

    private String imie;
    private String nazwisko;
}

class KontoBankowe {
    KontoBankowe(Osoba daneOsobowe) {
        Random rand = new Random();
        wlasciciel = daneOsobowe;
        numerKonta = String.valueOf(rand.nextInt(10000));
        stanKonta = 0;
    }

    void wplacPieniadze(double kwota) throws Exception {
        if (kwota <= 0)
            throw new Exception("Kwota wpłaty musi być wartością dodatnią");
        stanKonta += kwota;
    }

    void wyplacPieniadze(double kwota) throws Exception {
        if (kwota <= 0)
            throw new Exception("Kwota wypłaty musi być wartością dodatnią");
        stanKonta -= kwota;
    }

    void wyswietlSaldo() {
        System.out.println(String.format("Saldo konta %s (%s): %f", numerKonta, wlasciciel.fullname(), stanKonta));
    }

    private double stanKonta;
    private String numerKonta;
    private Osoba wlasciciel;
}

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
