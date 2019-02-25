package com.lachlanlindsay.cs.sort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MergeSortTest {

    @Test
    public void sort() {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        int[] sortedArray = {-22, -15, 1, 7, 20, 35, 55};

        MergeSort.sort(array);

        assertArrayEquals(array, sortedArray);
    }
}