package com.lachlanlindsay.Sort;

/**
 * quadratic sorting algorithm
 * More efficient in practice than most other simple quadratic (i.e., O(n2)) algorithms such as selection sort or bubble sort
 * Adaptive, i.e. efficient for data sets that are already substantially sorted: the time complexity is O(nk) when each element in the input is no more than k places away from its sorted position
 * Stable; i.e. does not change the relative order of elements with equal keys
 * In-place; i.e. only requires a constant amount O(1) of additional memory spac
 * <p>
 * https://en.wikipedia.org/wiki/Insertion_sort
 */
public class InsertionSort {

    /*
     * outer loop is growing partition by one.
     * inner loop is looking for correct place to insert value and moves the array by one.
     */
    public static void sort(int[] array) {

        //index zero is already considered sorted
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
            int temp = array[firstUnsortedIndex];

            int i;
            //if not at beginning of array && the previous element contains a larger value
            for (i = firstUnsortedIndex; i > 0 && array[i - 1] > temp; i--) {
                //working within the sorted partition from right to left
                array[i] = array[i - 1];
            }
            array[i] = temp;
        }
    }
}
