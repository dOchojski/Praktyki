package com.d_d.praktyki.animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnimalsApplication {
    public static void main(String[] args) {
        List<Animal> animalsList = new ArrayList<>();
        animalsList.add(new Dog("Pies", "Labrador"));
        animalsList.add(new Dog("Pies", "Owczarek Niemiecki"));
        animalsList.add(new Cat("Kot", "Czarny"));
        animalsList.add(new Cat("Kot", "Biały"));
        animalsList.add(new Dog("Pies", "Chihuahua"));

        Map<String, List<Animal>> animalGroups = animalsList.stream()
                .collect(Collectors.groupingBy(Animal::getSpecies));

        animalGroups.forEach((species, animals) -> {
            System.out.println("Gatunek: " + species);
            animals.forEach(System.out::println);
            System.out.println();
        });
    }
}
