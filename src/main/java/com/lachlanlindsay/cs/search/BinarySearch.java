package com.lachlanlindsay.cs.search;

public class BinarySearch {

    // 1, 2, 3, 4, 5, 6, 7, 8

    /**
     * returns the index that the target element can be found at. If it does not exist return -1
     */
    public static int iterativeBinarySearch(int[] input, int target) {
        int start = 0;
        int end = input.length;
        int midpoint;


        while (start < end) {
            int midPoint = (start + end) / 2;

            if (input[midPoint] == target) {
                return midPoint;
            }

            if (input[midPoint] > target) {
                end = midPoint;
            } else if (input[midPoint] < target) {
                start = midPoint + 1;
            }
        }
        return -1;
    }
}
