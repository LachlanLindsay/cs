package com.lachlanlindsay.sort;

import org.junit.Assert;
import org.junit.Test;

import static com.lachlanlindsay.Sort.SelectionSort.sort;

public class SelectionSortTest {

    @Test
    public void testSort() {
        final int[] sortedArray = {0, 3, 4, 9};
        int[] unsortedArray = {3, 4, 9, 0};

        sort(unsortedArray);
        Assert.assertArrayEquals(sortedArray, unsortedArray);

    }
}