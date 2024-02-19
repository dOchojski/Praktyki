package com.d_d.praktyki;

import java.util.Random;

class KontoBankowe {
    private double stanKonta;
    private String numerKonta;
    private Osoba wlasciciel;

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
}
