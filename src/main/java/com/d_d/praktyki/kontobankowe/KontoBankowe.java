package com.d_d.praktyki.kontobankowe;

import com.d_d.praktyki.kontobankowe.Uzytkownik;

public class KontoBankowe {
    public KontoBankowe(Uzytkownik uzytkownik) {
        wlasciciel = uzytkownik;
    }

    public float stanKonta;
    public String numerKonta;
    Uzytkownik wlasciciel;

    public void wplacPieniadze(double kwota) {
        stanKonta += kwota;
        System.out.println("Wpłacono: " + kwota);
    }

    public void wyplacPieniadze(double kwota) {
        stanKonta -= kwota;
        System.out.println("Wypłacono: " + kwota);
    }
}
