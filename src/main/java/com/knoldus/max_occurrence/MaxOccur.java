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
        print_N_mostFrequentNumber(arr, n, k);
    }

    /**
     * @param arr the arr
     * @param n the n
     * @param k the k
     */
    private static void print_N_mostFrequentNumber(int[] arr, final int n, final int k) {
        Map<Integer, ValueCount> mpValueCount =
                new HashMap<Integer, ValueCount>();

        for (int i = 0; i < n; i++) {
            mpValueCount.put(arr[i], mpValueCount.getOrDefault(arr[i],
                    new ValueCount(arr[i],0)).incrementCount());
        }

        List<ValueCount> values =  new ArrayList<ValueCount>(mpValueCount.values());
        Collections.sort(values);
        for(int m = 0; m<k;m++) {
            System.out.println(values.get(m));
        }
    }
}

