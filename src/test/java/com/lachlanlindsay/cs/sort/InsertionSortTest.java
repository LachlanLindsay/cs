package com.lachlanlindsay.cs.sort;

import com.lachlanlindsay.cs.Sort.InsertionSort;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class InsertionSortTest {

    @Test
    public void testSort() {
        int[] unsortedArray = {4, -5, 22, 55, 33, 44, 5};

        final int[] sortedArray = {-5, 4, 5, 22, 33, 44, 55};
        InsertionSort.sort(unsortedArray);
        assertArrayEquals(sortedArray, unsortedArray);
    }
}