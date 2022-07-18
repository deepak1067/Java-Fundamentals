package com.knoldus.program10;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapUse {
    /**
     * tree map.
     * @param args the args
     */
    public static void main(final String args[]) {
        TreeMap<String, String> capitalCities = new TreeMap<String, String>();
        capitalCities.put("UP", "Lucknow");
        capitalCities.put("UK", "Dehradun");
        capitalCities.put("RJ", "Jaipur");

        for (Map.Entry m : capitalCities.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
