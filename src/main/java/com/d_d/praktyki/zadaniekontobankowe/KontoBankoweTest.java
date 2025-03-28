package com.d_d.praktyki.zadaniekontobankowe;

public class KontoBankoweTest {
    public static void main(String[] args) {
        KontoBankowe kontoBankowe = new KontoBankowe(5000);
        kontoBankowe.wplac(100);
        kontoBankowe.wyplac(10000);
    }
}
