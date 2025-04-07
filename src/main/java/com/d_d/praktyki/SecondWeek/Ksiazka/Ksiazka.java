package com.d_d.praktyki.SecondWeek.Ksiazka;

public class Ksiazka {
    private String tytul;
    private String autor;
    private int liczbaStron;

    public Ksiazka(String tytul, String autor, int rokProdukcji){
        this.tytul = tytul;
        this.autor = autor;
        if (rokProdukcji<0){
            System.out.println("Liczba stron nie może być ujemna. Liczba Stron zostanie automatycznie ustawiona na 1.");
            this.liczbaStron=1;
        }else{
            this.liczbaStron = rokProdukcji;
        }
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTytul() {
        return tytul;
    }
    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public int getLiczbaStron() {
        return liczbaStron;
    }
    public void setLiczbaStron(int liczbaStron) {
        if (liczbaStron < 0) {
            System.out.println("Błąd.");
        } else {
            this.liczbaStron = liczbaStron;
        }
    }
}
