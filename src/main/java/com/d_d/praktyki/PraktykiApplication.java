package com.d_d.praktyki;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PraktykiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PraktykiApplication.class, args);

        KontoBankowe konto1 = new KontoBankowe();
        konto1.stanKonta = 56000;
        konto1.numerKonta = "PL49 1020 2892 2276 3005 0000 0000";
        konto1.wplacPieniadze(2.50);
        konto1.wyplacPieniadze(2750.50);
        konto1.wplacPieniadze(500);
        konto1.wyplacPieniadze(199.99);

        KontoBankowe konto2 = new KontoBankowe();
        konto2.stanKonta = 13000;
        konto2.numerKonta = "PL49 1020 3898 2276 3006 0000 0000";
        konto2.wplacPieniadze(5000);
        konto2.wyplacPieniadze(50);
        konto2.wplacPieniadze(275.42);
        konto2.wyplacPieniadze(5.99);

        System.out.println("Stan konta pierwszego: " + konto1.stanKonta + " Stan konta drugiego: " + konto2.stanKonta);
    }
}
class KontoBankowe{
    float stanKonta;
    String numerKonta;
    public void wplacPieniadze(double kwota)
    {
        stanKonta += kwota;
        System.out.println("Wpłacono: " + kwota);
    }
    public void wyplacPieniadze(double kwota)
    {
        stanKonta -= kwota;
        System.out.println("Wypłacono: " + kwota);
    }
}
