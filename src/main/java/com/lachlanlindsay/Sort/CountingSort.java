package com.lachlanlindsay.Sort;

/**
 * Values must be between 0 - 5 inclusive
 * unstable
 * O(n) - :)
 * Not an in-place algorithm because of the
 */
public class CountingSort {
    public final static int MAXIMUM_VALUE = 5;

    public static void sort(int[] array) {
        int[] countArray = new int[getCountArraySize()];
        countOccurrences(array, countArray);

        int total = 0;
        for (int i = 0; i < countArray.length; i++) {
            for (int j = 0; j < countArray[i]; j++) {
                array[total + j] = i;
            }
            total += countArray[i];
        }
    }

    public static void countOccurrences(int[] array, int[] countArray) {
        for (int i = 0; i < array.length; i++) {
            countArray[array[i]] = ++countArray[array[i]];
        }
    }

    public static int getCountArraySize() {
        return MAXIMUM_VALUE + 1;
    }
}

