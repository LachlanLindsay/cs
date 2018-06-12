package com.lachlanlindsay;

/**
 * unstable sort algorithm
 * degrades quickly
 * O(n^2) quadratic performance
 * 100         steps to sort 10 items
 * 10 000      steps to sort 100 items
 * 1 000 000   steps to sort 1000 items
 */
public class SelectionSorter implements Sorter {

    public static void sort(int[] array) {

        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largestIndex = 0;

            //starting at 1 as 0 is already the largest
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (array[largestIndex] < array[i]) {
                    largestIndex = i;
                }
            }

            ArrayUtility.swap(array, largestIndex, lastUnsortedIndex);
        }

    }
}