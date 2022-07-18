package com.knoldus.program11;

import java.util.Arrays;

public class ArrayExample {
    /**
     * use of array.
     * @param args the args
     */
    public static void main(final String[] args) {
        int[] array = new int[10];
        for(int index = 0; index < 10; index++) {
            array[index] = index;
        }
        System.out.println("Array : " + Arrays.toString(array));
    }

}
