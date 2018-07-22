package com.lachlanlindsay.cs.sort;

import com.lachlanlindsay.cs.Sort.SelectionSort;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SelectionSortTest {

    @Test
    public void testSort() {
        final int[] sortedArray = {0, 3, 4, 9};
        int[] unsortedArray = {3, 4, 9, 0};

        SelectionSort.sort(unsortedArray);
        assertArrayEquals(sortedArray, unsortedArray);
    }
}