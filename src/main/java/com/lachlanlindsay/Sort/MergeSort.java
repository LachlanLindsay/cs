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
    }

    private static void merge(int[] input, int start, int mid, int end) {
        //check if the arrays are sorted.
        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int leftIndex = start;
        int rightIndex = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];

        //merge left and right indexes and always take the smallest element
        while (leftIndex < mid && rightIndex < end) {
            if (input[leftIndex] <= input[rightIndex]) {
                temp[tempIndex++] = input[leftIndex++];
            } else temp[tempIndex++] = input[rightIndex++];
        }

        System.arraycopy(input, leftIndex, input, start + tempIndex, mid - leftIndex);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}
