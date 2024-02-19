package com.d_d.praktyki;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

class Samochod {
    public void printInfo() {
        System.out.println("== Informacje o samochodzie ===");
        System.out.println("- Marka: " + marka);
        System.out.println("- Model: " + model);
        System.out.println("- Rok produkcji: " + rokProdukcji.toString());
        System.out.println("- Uruchomiony? " + silnikUruchomiony);
    }

    void uruchomSilnik() {
        silnikUruchomiony = true;
        System.out.println("Silnik uruchomiony");
    }
    void zatrzymajSilnik() {
        silnikUruchomiony = false;
        System.out.println("Silnik zatrzymany");
    }

    String marka;
    String model;
    Integer rokProdukcji;
    boolean silnikUruchomiony;
}

@SpringBootApplication
public class PraktykiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PraktykiApplication.class, args);

        Samochod fiat = new Samochod();
        fiat.marka = "Fiat";
        fiat.model = "Seicento";
        fiat.rokProdukcji = 2005;

        fiat.uruchomSilnik();
        fiat.zatrzymajSilnik();

        fiat.printInfo();
    }

}
