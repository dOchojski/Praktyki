package com.d_d.praktyki.systemrezerwacjipokoihotelowych;

import java.util.Set;

public class Room {
    private int roomId;
    private int beds;
    private double price;
    private boolean reserved;
    private Set<String> amenities;

    public Room(int roomId, int beds, double price, Set<String> amenities) {
        this.roomId = roomId;
        this.beds = beds;
        this.price = price;
        this.amenities = amenities;
    }

    public int getRoomId() {
        return roomId;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public Set<String> getAmenities() {
        return amenities;
    }

    public void setAmenities(Set<String> amenities) {
        this.amenities = amenities;
    }

    @Override
    public String toString() {
        return "Room ID: " + roomId + ", Beds: " + beds + ", Price: " + price + ", Amenities: " + amenities;
    }
}
