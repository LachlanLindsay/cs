package com.lachlanlindsay.cs.ctci;

public class Strings {

    /***
     *
     * Cracking the coding interview question 1.5
     * pale     pale -> true
     * pales    pale -> true
     * pale     bale -> true
     * pale     bake -> false
     * @param s1
     * @param s2
     * @return
     */
    public static boolean oneAway(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }

        if (Math.abs(s1.length() - s2.length()) > 1) {
            return false;
        }

        int len = Math.min(s1.length(), s2.length());
        int dif = 0;
        for (int i = 0; i < len; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                dif++;
            }
        }

        if (dif < 2) return true;

        dif = 0;
        for (int i = 0; i < len; i++) {
            if (s1.charAt(s1.length() - 1 - i) != s2.charAt(s2.length() - 1 - i)) {
                dif++;
            }
        }
        return dif < 2;

    }
}
