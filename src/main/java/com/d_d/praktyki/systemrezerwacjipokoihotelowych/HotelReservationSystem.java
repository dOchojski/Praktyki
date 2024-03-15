package com.d_d.praktyki.systemrezerwacjipokoihotelowych;

import java.util.*;

public class HotelReservationSystem {
    // Pole przechowujące mapę pokoi
    private Map<Integer, Room> rooms;
    // Pole przechowujące mapę rezerwacji
    private Map<Integer, Reservation> reservations;
    // Pole przechowujące kolejny numer identyfikacyjny rezerwacji
    private int nextReservationId;

    // Konstruktor klasy HotelReservationSystem
    public HotelReservationSystem() {
        // Inicjalizacja pól
        this.rooms = new HashMap<>();
        this.reservations = new HashMap<>();
        this.nextReservationId = 1;
    }

    // Metoda dodająca pokój do systemu
    public void addRoom(int roomId, int beds, double price, Set<String> amenities) {
        rooms.put(roomId, new Room(roomId, beds, price, amenities));
    }

    // Metoda usuwająca pokój z systemu
    public void removeRoom(int roomId) {
        rooms.remove(roomId);
    }

    // Metoda edytująca informacje o pokoju
    public void editRoom(int roomId, int beds, double price, Set<String> amenities) {
        Room room = rooms.get(roomId);
        if (room != null) {
            room.setBeds(beds);
            room.setPrice(price);
            room.setAmenities(amenities);
        }
    }

    // Metoda dokonująca rezerwacji pokoju
    public void makeReservation(int roomId, String guestName, Date checkInDate, Date checkOutDate) {
        Room room = rooms.get(roomId);
        if (room != null && !room.isReserved()) {
            int reservationId = nextReservationId++;
            reservations.put(reservationId, new Reservation(reservationId, roomId, guestName, checkInDate, checkOutDate));
            room.setReserved(true);
            System.out.println("Reservation successful. Reservation ID: " + reservationId);
        } else {
            System.out.println("Room is not available for reservation.");
        }
    }

    // Metoda anulująca rezerwację
    public void cancelReservation(int reservationId) {
        Reservation reservation = reservations.get(reservationId);
        if (reservation != null) {
            Room room = rooms.get(reservation.getRoomId());
            if (room != null) {
                room.setReserved(false);
                reservations.remove(reservationId);
                System.out.println("Reservation canceled successfully.");
            }
        } else {
            System.out.println("Reservation not found.");
        }
    }

    // Metoda wyświetlająca aktywne rezerwacje
    public void displayReservations() {
        System.out.println("Active Reservations:");
        for (Reservation reservation : reservations.values()) {
            System.out.println(reservation);
        }
    }

    // Metoda zwracająca kolekcję pokoi
    public Collection<Room> getRooms() {
        return rooms.values();
    }
}





