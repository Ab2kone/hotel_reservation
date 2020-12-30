package com.hotel.booking.response;

import java.util.List;


public class Hotels {
    private List<Hotel> hotels;
    private int limit;
    private int offset;
    private int total;

    public Hotels(List<Hotel> hotels, int limit, int offset, int total) {
        this.hotels = hotels;
        this.limit = limit;
        this.offset = offset;
        this.total = total;
    }

    public List<Hotel> getHotels() {
        return hotels;
    }

    public int getLimit() {
        return limit;
    }

    public int getOffset() {
        return offset;
    }

    public int getTotal() {
        return total;
    }
}
