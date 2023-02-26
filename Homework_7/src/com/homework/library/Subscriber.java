package com.homework.library;

public class Subscriber {
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private SubscriberAddress subscriberAddress;

    public Subscriber(String firstName, String lastName,SubscriberAddress subscriberAddress, String email, int age) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.subscriberAddress = subscriberAddress;
        this.email = email;
        this.age = age;
    }

    public Subscriber(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
}
