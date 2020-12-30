package com.hotel.booking.service;

import org.springframework.stereotype.Service;

import com.hotel.booking.response.Hotel;
import com.hotel.booking.response.Hotels;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


@Service
public class HotelService {
    private Map<Integer, Hotel> hotels;

    public HotelService() {
        this.hotels = new HashMap<Integer, Hotel>();
        this.hotels.put(1, new Hotel(1, "Hotel Lozano", "Tunis", "Tunisie", "avenue Mohamed V", 5));
        this.hotels.put(2, new Hotel(2, "Hotel Non Stop", "Sousse", "Tunisie", "zone touristique", 4));
        this.hotels.put(3, new Hotel(3, "Grand Route", "Monastir", "Tunisie", "zone touristique", 3));
        this.hotels.put(4, new Hotel(4, "Hotel Ivoir", "Yamoussoukro", "Côte d'Ivoire", "avenue FHB route INPHB", 5));
        this.hotels.put(5, new Hotel(5, "Hotel Ibis", "Abidjan", "Côte d'Ivoire", "plateux", 5));
        this.hotels.put(6, new Hotel(6, "Rosa Beach", "Monasitr", "Tunisie", "zone touristique", 3));
        this.hotels.put(7, new Hotel(7, "Riadth Palace", "sousse", "Tunisie", "riadth", 5));
        this.hotels.put(8, new Hotel(8, "Hotel Habib", "Monastir", "Tunisie", "centre ville", 5));
        this.hotels.put(9, new Hotel(9, "Beach Hotel", "Douala", "Cameroun", "avenue Paul Biya", 5));
    }

    public Hotel getById(int hotelId) {
        return hotels.get(hotelId);
    }

    public Hotels getAll() {

        return new Hotels(new ArrayList<Hotel>(hotels.values()), 100, 0, hotels.size());
    }
}

