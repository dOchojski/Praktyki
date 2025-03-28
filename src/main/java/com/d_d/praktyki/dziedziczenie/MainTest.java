package com.d_d.praktyki.dziedziczenie;

public class MainTest {
    public static void main(String[] args) {
        Part part1 = new Part(1, "Dodge", "V8 Supercharged HEMI", "Seria 1");
        Tire tire1 = new Tire(2, "Hankook", "Ventus Prime3 X K125A", "Seria 2", 18, 235);
        ExhaustPart exhaustPart1 = new ExhaustPart(3, "AWE Tuning", "Dodge Challenger 15+ SRT Hellcat 6.2L SC Resonated Touring Edition", "Seria 3", false);

        System.out.println(part1);
        System.out.println(tire1);
        System.out.println(exhaustPart1);
    }
}
