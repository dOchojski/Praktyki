package com.d_d.praktyki.FirstWeek.Kino;

public class KinoTest {
    public static void main(String[] args){
        SalaKinowa sala = new SalaKinowa(5, 10);
        sala.rezerwujMiejsce(2, 5);
        sala.rezerwujMiejsce(2, 5);
        sala.rezerwujMiejsce(6, 3);
        sala.rezerwujMiejsce(5,9);
    }
}
