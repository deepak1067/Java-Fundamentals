package com.knoldus.nth_fibonacci_number;

import java.util.Scanner;

/**
 * class find nth number of fibonacci.
 */
public class FindFibonacci {
    static int fib(final int index) {
        if (index <= 1) {
            return index;
        }
        return fib(index - 1) + fib(index - 2);
    }

    /**
     * main method.
     * @param args the args
     */
    public static void main( final String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value to check its value in Fibonacci Series");
        int index = in.nextInt();
        System.out.println(fib(index));
    }
}

