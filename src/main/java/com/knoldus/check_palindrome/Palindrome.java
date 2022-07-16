package com.knoldus.check_palindrome;

/**
 * check palindrome.
 */
public class Palindrome {
    /**
     * check string is palindrome or not.
     * @param str the str
     * @return true or false
     */
    public static boolean isPalindrome(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        String rev=stringBuilder.toString();
        if(str.equals(rev)){
            return true;
        }else{
            return false;
        }
    }
}