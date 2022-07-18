package com.knoldus.program10;
import java.util.HashMap;

public class HashMapUse {
    /**
     * HashMap
     * @param args the args
     */
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<>();

        capitalCities.put("UP", "Lucknow");
        capitalCities.put("UK", "Dehradun");
        capitalCities.put("RJ", "Jaipur");
        System.out.println(capitalCities);
    }
}
