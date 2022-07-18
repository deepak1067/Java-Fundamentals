package com.knoldus.person;

import java.util.ArrayList;
import java.util.List;

public class Address {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<Person>();

        personList.add(new Person(111,"Deepak", "Dhampur", "df", "UP"));
        personList.add(new Person(122, "Shashi","Ranchi", "fg", "Bihar"));
        personList.add(new Person(133, "Krishna","Bijnor", "dfg", "UP"));
        personList.add(new Person(144, "Ankit","Meerut", "dfdg", "UK"));
        personList.add(new Person(155, "Ravi","Moradabad", "hj", "UP"));
        personList.add(new Person(166, "Mohit","Jaipur", "er", "RJ"));



        System.out.println("List of all Cities:-");

        personList.stream()
                .map(Person::getCity)
                .distinct()
                .forEach(System.out::println);
    }

}
