package com.d_d.praktyki.ThirdWeek.Hurtownia;

public class Test {
    public static void main(String[] args) {
        Tire tire1 = new Tire("T001", "Michelin", "Sport", "PSA", 18, 225);
        ExhaustPart exhaustPart1 = new ExhaustPart("E001", "Bosal", "Sport", "BS", true);

        System.out.println(tire1);
        System.out.println(exhaustPart1);
    }
}
