package com.d_d.praktyki.SecondWeek.Ksiazka;

public class KsiazkaTest {
    public static void main(String[] args){
        Ksiazka ksiazka1 = new Ksiazka("Harry Potter i Kamień Filozoficzny", "J.K.Rowling", 300);
        Ksiazka ksiazka2 = new Ksiazka("Władca pieścieni","Tolkien", -100);

        ksiazka2.setLiczbaStron(360);

        System.out.println("Tytuł: " + ksiazka2.getTytul()+ "Autor: " + ksiazka2.getAutor() + "Liczba Stron: " + ksiazka2.getLiczbaStron());

    }
}
