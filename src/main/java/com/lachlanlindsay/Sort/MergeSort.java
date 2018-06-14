package com.lachlanlindsay.Sort;

/**
 * Merge Sort Divides and Concurs
 * <p>
 * Recursive merge sort.
 * <p>
 * Not an in-place algorithm(uses temp arrays)
 * <p>
 * O(nlog)
 * Stable
 */

public class MergeSort {
    public static void sort(int[] array) {
        split(array);
    }

    private static void split(int[] input) {
        split(input, 0, input.length);
    }

    private static void split(int[] input, int start, int end) {

        if (end - start < 2) {
            return;
        }

        int midPoint = (start + end) / 2;

        split(input, start, midPoint); // left node
        split(input, midPoint, end);   // right node

        merge(input, start, midPoint, end);
        int x = 1;
    }

    private static void merge(int[] input, int start, int mid, int end) {
        //check if the arrays are sorted.
        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];

        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}
