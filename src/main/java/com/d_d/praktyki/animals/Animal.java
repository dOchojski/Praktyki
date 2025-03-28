package com.d_d.praktyki.animals;



public class Animal {
    private String species;

    public Animal(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public String toString() {
        return "Zwierzę{" +
                "gatunek='" + species + '\'' +
                '}';
    }
}
