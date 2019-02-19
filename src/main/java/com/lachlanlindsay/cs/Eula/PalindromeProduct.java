package com.lachlanlindsay.cs.Eula;


import java.util.ArrayList;
import java.util.List;

// 91 * 99 = 9009
public class PalindromeProduct {

    public static int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] result = new int[A.length];

        for (int i = 0; i < queries.length; i++) {
            int modifier = queries[i][0];
            int index = queries[i][1];


            A[index] = A[index] + modifier;

            //sum all even numbers and then insert it at the next position...
            int sum = 0;
            for (int x = 0; x < A.length; x++) {
                if (A[x] % 2 == 0) {
                    sum += A[x];
                }
            }
            result[i] = sum;
        }
        return result;
    }

    public static int findProductsOfLargestPalindrome(int maxRange, int minRange) {
        //todo optimise, find a common multiple, 11

        List<Integer> list = new ArrayList<>();

        for (int i = maxRange; i > minRange; i--) {
            for (int y = maxRange; y > minRange; y--) {
                if (isPalindrome(y * i))
                    list.add(y * i);
            }
        }
        //todo insertion sort and simply return the last number
        if (list.isEmpty()) {
            return -1;
        } else {
            int max = 0;
            for (Integer integer : list) {
                if (integer > max) {
                    max = integer;
                }
            }
            return max;
        }
    }

    public static boolean isPalindrome(int x) {
        x = Math.abs(x);
        return new StringBuilder(String.valueOf(x)).toString().equals(
                new StringBuilder(String.valueOf(x)).reverse().toString());
    }
}
