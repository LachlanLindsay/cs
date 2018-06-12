package com.lachlanlindsay;

import org.junit.Assert;
import org.junit.Test;

import static com.lachlanlindsay.BubbleSorter.sort;

public class BubbleSorterTest {

    @Test
    public void testSort() {
        int[] unsortedArray = {4, -5, 22};
        final int[] sortedArray = {-5, 4, 22};
        sort(unsortedArray);
        Assert.assertArrayEquals(sortedArray, unsortedArray);
    }
}