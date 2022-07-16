package com.knoldus.duplicateelement;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/**
 * class to find duplicate elements.
 */
public class DuplicateElements {
    /**
     * find duplicates using hashmap.
     * @param inputArray the input array
     */
    private static void findDuplicatesUsingHashMap(final int[] inputArray) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int element : inputArray) {
            if (map.get(element) == null) {
                map.put(element, 1);
            }
            else {
                map.put(element, map.get(element) + 1);
            }
        }

        Set<Entry<Integer, Integer>> entrySet = map.entrySet();

        for (Entry<Integer, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate Element : " + entry.getKey()
                        + " - found " + entry.getValue() + " times.");
            }
        }
    }

    /**
     * @param args the args
     */
    public static void main(final String[] args) {
        int[] inputArray = new int[]{1, 3, 3, 6, 8, 1, 1};

        System.out.println("======Duplicates Elements======");

        findDuplicatesUsingHashMap(inputArray);
    }
}
