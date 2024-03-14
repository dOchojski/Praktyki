package com.d_d.praktyki.systemrezerwacjipokoihotelowych;

import java.util.Arrays;
import java.util.HashSet;

public class HotelTest {
    public static void main(String[] args) {
        HotelReservationSystem hotelSystem = new HotelReservationSystem();

        hotelSystem.addRoom(101, 2, 100.0, new HashSet<>(Arrays.asList("TV", "WiFi")));
        hotelSystem.addRoom(102, 3, 150.0, new HashSet<>(Arrays.asList("TV", "WiFi", "Mini Bar")));
        hotelSystem.addRoom(103, 1, 80.0, new HashSet<>(Arrays.asList("WiFi")));

        System.out.println("Rooms:");
        for (Room room : hotelSystem.getRooms()) {
            System.out.println(room);
        }
    }
}
