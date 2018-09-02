package com.lachlanlindsay.cs.Sort;

import com.lachlanlindsay.cs.ArrayUtility;

/**
 * Degrades quickly
 * Stable sort algorithm
 *
 * O(n^2) quadratic performance
 *   100         steps to sort 10 items
 *   10 000      steps to sort 100 items
 *   1 000 000   steps to sort 1000 items
 *
 * */
public class BubbleSort {

    public static void sort(int[] array) {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            boolean sorted = true;
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (array[i] > array[i + 1]) {
                    sorted = false;
                    ArrayUtility.swap(array, i, i + 1);
                }
            }
            if (sorted) {
                break;
            }
        }
    }
}
