package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class HotelReservation {
    private List<Hotel> hotels = new ArrayList<>();

    public HotelReservation() {
    }

    public HotelReservation(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    public void addHotels(Hotel hotel) {
        this.hotels.add(hotel);
    }

    public List<Hotel> returnList() {
        return hotels;
    }
}

