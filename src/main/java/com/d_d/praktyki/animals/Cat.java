package com.d_d.praktyki.animals;

public class Cat extends Animal{
    private String color;

    public Cat(String species, String color) {
        super(species);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Kot{" +
                "gatunek='" + getSpecies() + '\'' +
                ", kolor='" + color + '\'' +
                '}';
    }
}
