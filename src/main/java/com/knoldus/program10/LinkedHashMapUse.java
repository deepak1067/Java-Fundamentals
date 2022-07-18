package com.knoldus.program10;

import java.util.*;
public class LinkedHashMapUse {

    /**
     * Linked Hashmap.
     * @param args the args
     */
    public static void main(final String args[]) {
        LinkedHashMap<String,String> capitalCities = new LinkedHashMap<>();
        capitalCities.put("UP", "Lucknow");
        capitalCities.put("UK", "Dehradun");
        capitalCities.put("RJ", "Jaipur");

        for (Map.Entry entry : capitalCities.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}

