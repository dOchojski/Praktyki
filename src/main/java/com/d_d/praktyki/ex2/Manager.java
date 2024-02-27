package com.d_d.praktyki.ex2;

import java.util.List;

public class Manager extends Pracownik{
    private String dzial;

    public Manager(String imie, double wynagrodzenie, String dzial) {
        super(imie, wynagrodzenie);
        this.dzial = dzial;
    }

    public String getDzial() {
        return dzial;
    }

//    public static void main(String[] args) {
//        List<Pracownik> listaPracownikow = new ArrayList<>();
//        listaPracownikow.add(new Pracownik("Jan Kowalski", 5000));
//        listaPracownikow.add(new Pracownik("Anna Nowak", 6000));
//        listaPracownikow.add(new Manager("Adam Wiśniewski", 8000, "IT"));
//        listaPracownikow.add(new Manager("Ewa Kaczmarek", 7500, "Finanse"));
//
//        double minimalneWynagrodzenie = 7000;
//
//        listaPracownikow.stream()
//                .filter(p -> p.getWynagrodzenie() > minimalneWynagrodzenie)
//                .forEach(Main::wyswietlInformacje);
//
//        // Tworzymy listę wynagrodzeń pracowników
//        List<Double> listaWynagrodzen = listaPracownikow.stream()
//                .map(Pracownik::getWynagrodzenie)
//                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
//
//        System.out.println("Lista wynagrodzeń: " + listaWynagrodzen);
//    }
//
//    private static void wyswietlInformacje(Pracownik pracownik) {
//        if (pracownik instanceof Manager) {
//            Manager manager = (Manager) pracownik;
//            System.out.println("Manager: " + manager.getImie() + ", Dział: " + manager.getDzial() + ", Wynagrodzenie: " + manager.getWynagrodzenie());
//        } else {
//            System.out.println("Pracownik: " + pracownik.getImie() + ", Wynagrodzenie: " + pracownik.getWynagrodzenie());
//        }
//    }
}
