package com.d_d.praktyki;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

class KontoBankowe {
    KontoBankowe(String numer) {
        numerKonta = numer;
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
        System.out.println(String.format("Saldo konta %s: %f", numerKonta, stanKonta));
    }

    private double stanKonta;
    private String numerKonta;
}

@SpringBootApplication
public class PraktykiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PraktykiApplication.class, args);

        KontoBankowe a = new KontoBankowe("111");
        KontoBankowe b = new KontoBankowe("222");
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
