package com.d_d.praktyki.FirstWeek.Zwierzęta;


import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

public class ZwierzetaTest {
    public static void main(String[] args) {

        List<Zwierzeta> zwierzeta = new ArrayList<>();
        zwierzeta.add(new Pies("ssak", "Labrador"));
        zwierzeta.add(new Pies("ssak", "Owczarek niemiecki"));
        zwierzeta.add(new Kot("ssak", "Perski"));
        zwierzeta.add(new Kot("ssak", "Syjamski"));

        Map<String, List<Zwierzeta>> grupyZwierzat = zwierzeta.stream()
                .collect(Collectors.groupingBy(Zwierzeta::getGatunek));

        grupyZwierzat.forEach((gatunek, lista) -> {
            System.out.println("Grupa: " + gatunek);
            lista.forEach(Zwierzeta::informacje);

        });
    }
}
