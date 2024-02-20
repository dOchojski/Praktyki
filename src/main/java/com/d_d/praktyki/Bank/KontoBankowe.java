package com.d_d.praktyki.Bank;

import com.d_d.praktyki.Bank.Uzytkownik;

public class KontoBankowe{
    
    public KontoBankowe(Uzytkownik uzytkownik){
        wlasciciel = uzytkownik;
    }
    Uzytkownik wlasciciel;
    public double stanKonta;
    public String numerKonta;

    public void wplacPieniadze(double kwota){
        stanKonta += kwota;
        System.out.println("Stan Konta: "+stanKonta);
    }

    public void wyplacPieniadze(double kwota){
        stanKonta -= kwota;
        System.out.println("Stan Konta: "+stanKonta);
    }
}