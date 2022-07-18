package com.knoldus.sub_string;


class FindAllSubString {
    /**
     * Find all Substring.
     * @param str the str
     * @param n the n
     */
    public static void subString(final String str,
                                 final int n) {
        for (int i = 0; i < n-2; i++) {
            System.out.println(str.substring(i, i + 3));
        }
    }

    /**
     * @param args the args
     */
    public static void main(final String[] args) {
        String str = "abcdbb";
        subString(str, str.length());
    }

}

