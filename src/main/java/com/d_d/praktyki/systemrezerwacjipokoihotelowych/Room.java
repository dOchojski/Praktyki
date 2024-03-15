package com.d_d.praktyki.systemrezerwacjipokoihotelowych;

import java.util.Set;

public class Room {
    // Deklaracja pól klasy
    private int roomId; // Numer identyfikacyjny pokoju
    private int beds; // Liczba łóżek w pokoju
    private double price; // Cena za nocleg w pokoju
    private boolean reserved; // Flaga określająca, czy pokój jest zarezerwowany
    private Set<String> amenities; // Zbiór udogodnień dostępnych w pokoju

    // Konstruktor klasy Room
    public Room(int roomId, int beds, double price, Set<String> amenities) {
        this.roomId = roomId;
        this.beds = beds;
        this.price = price;
        this.amenities = amenities;
    }

    // Metoda zwracająca numer identyfikacyjny pokoju
    public int getRoomId() {
        return roomId;
    }

    // Metoda zwracająca liczbę łóżek w pokoju
    public int getBeds() {
        return beds;
    }

    // Metoda ustawiająca liczbę łóżek w pokoju
    public void setBeds(int beds) {
        this.beds = beds;
    }

    // Metoda zwracająca cenę za nocleg w pokoju
    public double getPrice() {
        return price;
    }

    // Metoda ustawiająca cenę za nocleg w pokoju
    public void setPrice(double price) {
        this.price = price;
    }

    // Metoda sprawdzająca, czy pokój jest zarezerwowany
    public boolean isReserved() {
        return reserved;
    }

    // Metoda ustawiająca flagę rezerwacji dla pokoju
    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    // Metoda zwracająca zbiór udogodnień dostępnych w pokoju
    public Set<String> getAmenities() {
        return amenities;
    }

    // Metoda ustawiająca zbiór udogodnień dostępnych w pokoju
    public void setAmenities(Set<String> amenities) {
        this.amenities = amenities;
    }

    // Przesłonięta metoda toString z klasy Object
    @Override
    public String toString() {
        // Zwraca informacje o pokoju jako ciąg znaków
        return "Room ID: " + roomId + ", Beds: " + beds + ", Price: " + price + ", Amenities: " + amenities;
    }
}