package com.lachlanlindsay;

import org.junit.Assert;
import org.junit.Test;

public class SelectionSorterTest {

    @Test
    public void sort() {
        final int[] sortedArray = {0, 3, 4, 9};
        int[] unsortedArray = {3, 4, 9, 0};

        SelectionSorter.sort(unsortedArray);
        Assert.assertArrayEquals(sortedArray, unsortedArray);

    }
}