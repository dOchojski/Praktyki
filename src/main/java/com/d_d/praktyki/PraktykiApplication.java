package com.d_d.praktyki;

import com.d_d.praktyki.Bank.KontoBankowe;
import com.d_d.praktyki.Bank.Uzytkownik;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class PraktykiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PraktykiApplication.class, args);

        Uzytkownik adam = new Uzytkownik();
        adam.imie = "Adam";
        adam.nazwisko = "Janosz";
        adam.adresZamieszkania = "ul. Rodzinna 10";
        adam.adresZameldowania = "ul. Rodzinna 10";

        Uzytkownik ewa = new Uzytkownik();
        adam.imie = "Ewa";
        adam.nazwisko = "Kowal";
        adam.adresZamieszkania = "ul. Tuwima 28";
        adam.adresZameldowania = "al. Bielska 47";

        KontoBankowe k1 = new KontoBankowe(adam);
        k1.stanKonta = 2432;
        k1.numerKonta="PL49 5236 2256 2276 3231 0000 0000";

        KontoBankowe k2 = new KontoBankowe(ewa);
        k2.stanKonta= 242;
        k2.numerKonta="PL32 2136 3192 378i 1871 0000 0000";


        k1.wplacPieniadze(10.23);
        k2.wyplacPieniadze(32.32);
        k2.wyplacPieniadze(134.2);
        k1.wyplacPieniadze(999.98);
        k2.wplacPieniadze(2353.12);

        System.out.println("Stan konta pierwszego: " + k1.stanKonta);
        System.out.println("Stan konta drugiego: " + k2.stanKonta);

    }

}
