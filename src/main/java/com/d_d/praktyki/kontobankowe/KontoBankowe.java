package com.d_d.praktyki.kontobankowe;

import java.util.Random;

public class KontoBankowe {
    private double stanKonta;
    private String numerKonta;
    private Osoba wlasciciel;

    public KontoBankowe(Osoba daneOsobowe) {
        Random rand = new Random();
        wlasciciel = daneOsobowe;
        numerKonta = String.valueOf(rand.nextInt(10000));
        stanKonta = 0;
    }

    public void wplacPieniadze(double kwota) throws Exception {
        if (kwota <= 0)
            throw new Exception("Kwota wpłaty musi być wartością dodatnią");
        stanKonta += kwota;
    }

    public void wyplacPieniadze(double kwota) throws Exception {
        if (kwota <= 0)
            throw new Exception("Kwota wypłaty musi być wartością dodatnią");
        stanKonta -= kwota;
    }

    public void wyswietlSaldo() {
        System.out.println(String.format("Saldo konta %s (%s): %f", numerKonta, wlasciciel.fullname(), stanKonta));
    }
}
