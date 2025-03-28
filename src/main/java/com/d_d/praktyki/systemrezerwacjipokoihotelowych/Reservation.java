package com.d_d.praktyki.systemrezerwacjipokoihotelowych;

import java.util.Date;

public class Reservation {// Deklaracja pól klasy
    private int reservationId; // Numer identyfikacyjny rezerwacji
    private int roomId; // Numer identyfikacyjny pokoju
    private String guestName; // Imię i nazwisko gościa
    private Date checkInDate; // Data zameldowania
    private Date checkOutDate; // Data wymeldowania

    // Konstruktor klasy Reservation
    public Reservation(int reservationId, int roomId, String guestName, Date checkInDate, Date checkOutDate) {
        this.reservationId = reservationId;
        this.roomId = roomId;
        this.guestName = guestName;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    // Metoda zwracająca numer identyfikacyjny rezerwacji
    public int getReservationId() {
        return reservationId;
    }

    // Metoda zwracająca numer identyfikacyjny pokoju
    public int getRoomId() {
        return roomId;
    }

    // Metoda zwracająca imię i nazwisko gościa
    public String getGuestName() {
        return guestName;
    }

    // Metoda zwracająca datę zameldowania
    public Date getCheckInDate() {
        return checkInDate;
    }

    // Metoda zwracająca datę wymeldowania
    public Date getCheckOutDate() {
        return checkOutDate;
    }

    // Przesłonięta metoda toString z klasy Object
    @Override
    public String toString() {
        // Zwraca informacje o rezerwacji jako ciąg znaków
        return "Reservation ID: " + reservationId + ", Room ID: " + roomId + ", Guest: " + guestName + ", Check-in Date: " + checkInDate + ", Check-out Date: " + checkOutDate;
    }
}