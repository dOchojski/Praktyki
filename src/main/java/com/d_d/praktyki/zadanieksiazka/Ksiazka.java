package com.d_d.praktyki.zadanieksiazka;

public class Ksiazka {
    private String tytul;
    private String autor;
    private int liczbaStron;

    public Ksiazka(String tytul, String autor, int liczbaStron) {
        this.tytul = tytul;
        this.autor = autor;
        setLiczbaStron(liczbaStron);
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getLiczbaStron() {
        return liczbaStron;
    }

    public void setLiczbaStron(int liczbaStron) {
        if (liczbaStron >= 0) {
            this.liczbaStron = liczbaStron;
        } else {
            System.out.println("Liczba stron nie może być ujemna. Ustawiam liczbę stron na 0.");
            this.liczbaStron = 0;
        }
    }
}