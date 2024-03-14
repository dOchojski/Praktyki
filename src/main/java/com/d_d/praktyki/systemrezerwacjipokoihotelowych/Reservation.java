package com.d_d.praktyki.systemrezerwacjipokoihotelowych;

import java.util.Date;

public class Reservation {
    public int reservationId;
    public int roomId;
    public String guestName;
    public Date checkInDate;
    public Date checkOutDate;

    public Reservation(int reservationId, int roomId, String guestName, Date checkInDate, Date checkOutDate) {
        this.reservationId = reservationId;
        this.roomId = roomId;
        this.guestName = guestName;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }


    public int getReservationId() {
        return reservationId;
    }

    public int getRoomId() {
        return roomId;
    }

    public String getGuestName() {
        return guestName;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    @Override
    public String toString() {
        return "Reservation ID: " + reservationId + ", Room ID: " + roomId + ", Guest: " + guestName + ", Check-in Date: " + checkInDate + ", Check-out Date: " + checkOutDate;
    }
}
