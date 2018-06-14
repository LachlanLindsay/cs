package com.lachlanlindsay.sort;

import com.lachlanlindsay.Sort.MergeSort;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MergeSortTest {

    @Test
    public void sort() {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        int[] sortedArray = {-22, -15, 1, 7, 20, 35, 55};

        MergeSort.sort(array);

        assertArrayEquals(array, sortedArray);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}