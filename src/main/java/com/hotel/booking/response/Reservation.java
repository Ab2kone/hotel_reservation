package com.hotel.booking.response;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Reservation {
    private int id;
    private int prix;
    private int userId;
    private String chambreType;


    public int getId() {
        return id;
    }
    
    public String getChambreType() {
        return chambreType;
    }

    public int getPrix() {
        return prix;
    }

    @JsonProperty("user_id")
    public int getUserId() {
        return userId;
    }
}
