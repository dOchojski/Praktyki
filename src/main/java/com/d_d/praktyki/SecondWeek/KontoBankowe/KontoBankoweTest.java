package com.d_d.praktyki.SecondWeek.KontoBankowe;

public class KontoBankoweTest {
    public static void main(String[] args){
        KontoBankowe konto1 = new KontoBankowe(1871.20);
        KontoBankowe konto2 = new KontoBankowe(280.00);

        System.out.println("Konto nr.1");
        konto1.wplac(100.33);
        konto1.wyplac(1239.32);

        System.out.println("Konto nr.2");
        konto2.wyplac(289.00);
        konto2.wyplac(280.00);
    }
}
