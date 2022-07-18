package com.knoldus.person;

public class Person {

    int addressId;
    String name;
    String city;
    String Flat;
    String State;


    public Person(int addressId, String name, String city, String flat, String state) {
        this.addressId = addressId;
        this.name = name;
        this.city = city;
        Flat = flat;
        State = state;

    }

    @Override
    public String toString() {
        return "Person{" +
                "city='" + city + '\'' +
                '}';
    }

    public String getCity() {
        return city;
    }
}
