package com.knoldus.max_occurrence;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * find max occurrence number.
 */
public class MaxOccur {

    /**
     * @param args the args
     */
    public static void main(String[] args) {
        int arr[] = { 3, 1, 4, 4,4,4, 5, 2,2, 6, 1, 1};
        int n = arr.length;
        int k = 3;

        // Function call
        print_N_mostFrequentNumber(arr, n, k);
    }

    private static void print_N_mostFrequentNumber(int[] arr, final int n, final int k) {

        //Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        Map<Integer, ValueCount> mpValueCount =
                new HashMap<Integer, ValueCount>();

        for (int i = 0; i < n; i++) {
            //mp.put(arr[i], mp.getOrDefault(arr[i], 0)+1);
            mpValueCount.put(arr[i], mpValueCount.getOrDefault(arr[i],
                    new ValueCount(arr[i],0)).incrementCount());
        }

        List<ValueCount> values =  new ArrayList<ValueCount>(mpValueCount.values());
        //List<Map.Entry<Integer, Integer>> mpValues = new ArrayList<>(mp.values());
        //Collections.sort(mp.entrySet());
        Collections.sort(values);
        for(int m = 0; m<k;m++) {
            System.out.println(values.get(m));
        }
    }
}

