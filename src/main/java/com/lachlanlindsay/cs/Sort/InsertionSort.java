package com.lachlanlindsay.cs.Sort;

/**
 * quadratic sorting algorithm
 * More efficient in practice than most other simple quadratic (i.e., O(n2)) algorithms such as selection sort or bubble sort
 * Adaptive, i.e. efficient for data sets that are already substantially sorted: the time complexity is O(nk) when each
 * element in the input is no more than k places away from its sorted position
 * Stable; i.e. does not change the relative order of elements with equal keys
 * In-place; i.e. only requires a constant amount O(1) of additional memory space
 * <p>
 * https://en.wikipedia.org/wiki/Insertion_sort
 */
public class InsertionSort {
    public static void sort(int[] array) {
        insertionSort(array, array.length);
    }

    private static void insertionSort(int[] input, int numItems) {
        if (numItems < 2) {
            return;
        }

        insertionSort(input, numItems - 1);

        int newElement = input[numItems - 1];

        int i;
        //if not at beginning of array && the previous element contains a larger value
        for (i = numItems - 1; i > 0 && input[i - 1] > newElement; i--) {
            //working within the sorted partition from right to left
            input[i] = input[i - 1];
        }
        input[i] = newElement;
    }
}
