package com.lachlanlindsay.sort;

import org.junit.Assert;
import org.junit.Test;

import static com.lachlanlindsay.Sort.InsertionSort.sort;

public class InsertionSortTest {

    @Test
    public void testSort() {
        int[] unsortedArray = {4, -5, 22, 55, 33, 44, 5};
        final int[] sortedArray = {-5, 4, 5, 22, 33, 44, 55};
        sort(unsortedArray);
        Assert.assertArrayEquals(sortedArray, unsortedArray);
    }
}