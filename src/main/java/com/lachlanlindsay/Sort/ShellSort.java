package com.lachlanlindsay.Sort;

/**
 * Shell short can be implemented as a bubble sort / insertion sort
 * <p>
 * in-place
 * comparison sort.
 */
public class ShellSort {

    public static void sort(int[] array) {
        for (int gap = array.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < array.length; i++) {
                int newElement = array[i];

                int j = i;

                while (j >= gap && array[j - gap] > newElement) {
                    array[j] = array[j - gap];
                    j -= gap;
                }

                array[j] = newElement;
            }
        }
    }
}
