package com.lachlanlindsay;

/*
 * Degrades quickly
 *
 * O(n^2) quadratic performance
 *   100         steps to sort 10 items
 *   10 000      steps to sort 100 items
 *   1 000 000   steps to sort 1000 items
 *
 * */
public class BubbleSorter {

    public static void sort(int[] array) {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }
            }
        }
    }

    static void swap(int[] array, int i, int j) {
        if (i == j)
            return;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
