package com.knoldus.program10;

import java.util.concurrent.*;

class ConcurrentMapUse {

    /**
     * concurrent Hashmap.
     * @param args the args
     */
    public static void main(final String[] args) {
        ConcurrentHashMap<Integer, String> concurrentHashMap
                = new ConcurrentHashMap<>();
        concurrentHashMap.put(100, "Deepak");
        concurrentHashMap.put(101, "Shashi");
        concurrentHashMap.put(102, "Amit");
        concurrentHashMap.putIfAbsent(101, "xyz");
        concurrentHashMap.remove(101, "xyz");
        concurrentHashMap.putIfAbsent(103, "xyz");
        concurrentHashMap.replace(101, "xyz", "For");
        System.out.println(concurrentHashMap);
    }
}