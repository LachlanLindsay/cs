package com.lachlanlindsay;

import org.junit.Assert;
import org.junit.Test;

import static com.lachlanlindsay.BubbleSorter.sort;
import static com.lachlanlindsay.BubbleSorter.swap;

public class BubbleSorterTest {

    @Test
    public void testSwap() {
        final int[] swappedArray = {3, 1};
        int[] array = {1, 3};

        swap(array, 0, array.length - 1);
        Assert.assertArrayEquals(swappedArray, array);
    }

    @Test
    public void testSort() {
        int[] unsortedArray = {4, -5, 22};
        final int[] sortedArray = {-5, 4, 22};

        sort(unsortedArray);
        Assert.assertArrayEquals(sortedArray, unsortedArray);
    }
}