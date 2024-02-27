package com.d_d.praktyki.animals;

public class Dog extends Animal {
    private String breed;

    public Dog(String species, String breed) {
        super(species);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return "Pies{" +
                "gatunek='" + getSpecies() + '\'' +
                ", rasa='" + breed + '\'' +
                '}';
    }
}
