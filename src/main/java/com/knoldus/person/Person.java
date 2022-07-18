package com.knoldus.person;

public class Person {

    /**
     * the addressId.
     */
    private int addressId;
    /**
     * the name.
     */
    private String name;
    /**
     * the city.
     */
    private String city;
    /**
     * the flat.
     */
    private String flat;
    /**
     * the state.
     */
    private String state;


    /**
     * @param addressId the addressId
     * @param name the name
     * @param city the city
     * @param flat the flat
     * @param state the state
     */
    public Person(final int addressId, final String name, final String city, final String flat, final String state) {
        this.addressId = addressId;
        this.name = name;
        this.city = city;
        this.flat = flat;
        this.state = state;

    }

    @Override
    public String toString() {
        return "Person{" +
                "city='" + city + '\'' +
                '}';
    }

    /**
     * get city.
     * @return list of cities
     */
    public String getCity() {
        return city;
    }
}
