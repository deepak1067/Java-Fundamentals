package com.knoldus.person;

import java.util.ArrayList;
import java.util.List;

/**
 * person Address.
 */
public class Address {

    /**
     * list of persons.
     * @param args the args
     */
    public static void main(final String[] args) {

        List<Person> personList = new ArrayList<Person>();

        personList.add(new Person(111,"Deepak", "Dhampur", "ABC1", "UP"));
        personList.add(new Person(122, "Shashi","Ranchi", "ABC2", "Bihar"));
        personList.add(new Person(133, "Krishna","Bijnor", "ABC3", "UP"));
        personList.add(new Person(144, "Ankit","Meerut", "ABC4", "UK"));
        personList.add(new Person(155, "Ravi","Moradabad", "ABC5", "UP"));
        personList.add(new Person(166, "Mohit","Jaipur", "ABC6", "RJ"));



        System.out.println("List of all Cities:-");

        personList.stream()
                .map(Person::getCity)
                .distinct()
                .forEach(System.out::println);
    }

}
