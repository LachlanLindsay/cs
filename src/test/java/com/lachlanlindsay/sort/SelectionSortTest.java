package com.lachlanlindsay.sort;

import org.junit.Test;

import static com.lachlanlindsay.Sort.SelectionSort.sort;
import static org.junit.Assert.assertArrayEquals;

public class SelectionSortTest {

    @Test
    public void testSort() {
        final int[] sortedArray = {0, 3, 4, 9};
        int[] unsortedArray = {3, 4, 9, 0};

        sort(unsortedArray);
        assertArrayEquals(sortedArray, unsortedArray);
    }
}