package com.d_d.praktyki.kontobankowe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PraktykiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PraktykiApplication.class, args);

        Uzytkownik adam = new Uzytkownik();
        adam.imie = "Adam";
        adam.nazwisko = "Kowalski";
        adam.adresZamieszkania = "ul. Piłsudzkiego 10";
        adam.adresZameldowania = "ul. Piłsudzkiego 10";

        Uzytkownik ewa = new Uzytkownik();
        adam.imie = "Ewa";
        adam.nazwisko = "Nowak";
        adam.adresZamieszkania = "al. Legionów Polskich 28";
        adam.adresZameldowania = "ul. Mariackiej 47";

        KontoBankowe konto1 = new KontoBankowe(adam);
        konto1.stanKonta = 56000;
        konto1.numerKonta = "PL49 1020 2892 2276 3005 0000 0000";
        konto1.wplacPieniadze(2.50);
        konto1.wyplacPieniadze(2750.50);
        konto1.wplacPieniadze(500);
        konto1.wyplacPieniadze(199.99);

        KontoBankowe konto2 = new KontoBankowe(ewa);
        konto2.stanKonta = 13000;
        konto2.numerKonta = "PL49 1020 3898 2276 3006 0000 0000";
        konto2.wplacPieniadze(5000);
        konto2.wyplacPieniadze(50);
        konto2.wplacPieniadze(275.42);
        konto2.wyplacPieniadze(5.99);

        System.out.println("Stan konta pierwszego: " + konto1.stanKonta + " Stan konta drugiego: " + konto2.stanKonta);
    }
}
