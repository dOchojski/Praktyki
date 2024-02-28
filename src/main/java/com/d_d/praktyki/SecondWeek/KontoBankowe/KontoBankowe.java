package com.d_d.praktyki.SecondWeek.KontoBankowe;

public class KontoBankowe {
    private double saldo;

    public KontoBankowe(double saldo){
        this.saldo=saldo;
    }

    public void wplac(double wplata){
        saldo+=wplata;
        System.out.println("Saldo po wpłaceniu pieniędzy: " + saldo);
    }

    public void wyplac(double wplata){
        if(saldo-wplata<0){
            System.out.println("Brak sierodków na koncie.");
        }else {
            saldo -= wplata;
            System.out.println("Saldo po wypłaceniu pieniędzy: " + saldo);
        }
    }
}
