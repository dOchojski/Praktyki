package com.d_d.praktyki.zadaniekontobankowe;

public class KontoBankowe {
    private double saldo;

    public KontoBankowe(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo nie może być ujemne. Ustawiam saldo na 0.");
            this.saldo = 0;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void wplac(double kwota) {
        if (kwota > 0) {
            saldo += kwota;
            System.out.println("Wpłata wykonana. Aktualne saldo: " + saldo);
        } else {
            System.out.println("Kwota wpłaty musi być dodatnia.");
        }
    }

    public void wyplac(double kwota) {
        if (kwota > 0) {
            if (saldo >= kwota) {
                saldo -= kwota;
                System.out.println("Wypłata wykonana. Aktualne saldo: " + saldo);
            } else {
                System.out.println("Brak wystarczających środków na koncie.");
            }
        } else {
            System.out.println("Kwota wypłaty musi być dodatnia.");
        }
    }
}

