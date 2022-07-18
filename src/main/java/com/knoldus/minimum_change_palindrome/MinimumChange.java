package com.knoldus.minimum_change_palindrome;

/**
 * Minimum change in string to make palindrome
 */
public class MinimumChange {

    /**
     * @param string the string
     */
    static void change(String string)
    {
        // Finding the length of the string
        int n = string.length();
        // To store the number of replacement operations
        int cc = 0;
        for(int i = 0; i < n/2; i++)
        {
            // If the characters at location i and n-i-1 are same then no change is required
            if(string.charAt(i) == string.charAt(n - i - 1))
                continue;
            // Counting one change operation
            cc += 1;
            // Changing the character with higher ascii value with lower ascii value
            if(string.charAt(i) < string.charAt(n - i - 1))
                string = string.replace(string.charAt(n - i - 1),string.charAt(i));
            else
                string = string.replace(string.charAt(n-1),string.charAt(n - i - 1));
        }
        System.out.println("Minimum characters to be replaced = "+(cc)) ;
        System.out.println(string);
    }

    /**
     * @param args the args
     */
    public static void main(String args[])
    {
        String s = "jatan";
        change((s));

    }
}



