package com.lachlanlindsay.cs.Eula;

public class Problem1 {

    /*
     *  1, 2, 3, 4, 5, 6, 7, 8, 9, 10
     *
     *  if multiple of - 3 || 5 - add it
     * */
    public static int sumOfMultiplesOf3and5(int n) {
        int total = 0;
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                total += i;
            }
        }

        return total;
    }

}
