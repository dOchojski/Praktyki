package com.d_d.praktyki;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PraktykiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PraktykiApplication.class, args);


        KontoBankowe k1 = new KontoBankowe();
        k1.stanKonta = 2432;
        k1.numerKonta="PL49 5236 2256 2276 3231 0000 0000";

        KontoBankowe k2 = new KontoBankowe();
        k2.stanKonta= 242;
        k2.numerKonta="PL32 2136 3192 378i 1871 0000 0000";

        k1.wplacPieniadze(10.23);

        k2.wyplacPieniadze(32.32);
        k2.wyplacPieniadze(134.2);

        k1.wyplacPieniadze(999.98);

        k2.wplacPieniadze(2353.12);
    }

}
class KontoBankowe {
    float stanKonta;
    String numerKonta;

    public void wplacPieniadze(double kwota){
        stanKonta += kwota;
        System.out.println("Stan Konta: "+stanKonta);
    }
    public void wyplacPieniadze(double kwota){
        stanKonta -= kwota;
        System.out.println("Stan Konta: "+stanKonta);

    }
}