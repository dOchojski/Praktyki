package com.d_d.praktyki.streams.animals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        Dog fafik = new Dog();
        Cat malkolm = new Cat();
        Whale antos = new Whale();
        Fish nemo = new Fish();

        List<Animal> animals = Arrays.asList(fafik, malkolm, antos, nemo);
        
        String str = animals.stream()
                .collect(Collectors.groupingBy(animal -> animal.group))
                .toString();
        System.out.println(str);
    }
}
