package com.homework.library;

public class SubscriberAddress {

    // Could also be written as:
    // private String streetName, streetNumber, city, country, zipCode;
    private String streetName;
    private int streetNumber;
    private String city;
    private String country;
    private int zipCode;

    public SubscriberAddress(String streetName, int streetNumber, String city, String country, int zipCode) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.city = city;
        this.country = country;
        this.zipCode = zipCode;
    }
}
