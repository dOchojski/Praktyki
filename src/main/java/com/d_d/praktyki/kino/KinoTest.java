package com.d_d.praktyki.kino;

public class KinoTest {
    public static void main(String[] args) {
        SalaKinowa kino = new SalaKinowa(10, 50);
        kino.rezerwujMiejsce(2, 3);
        kino.rezerwujMiejsce(0, 5);
        kino.rezerwujMiejsce(9, 49);
        kino.rezerwujMiejsce(0, 5);
    }
}
