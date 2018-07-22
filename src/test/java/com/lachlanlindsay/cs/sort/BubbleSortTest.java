package com.lachlanlindsay.cs.sort;

import org.junit.Test;

import static com.lachlanlindsay.cs.Sort.BubbleSort.sort;
import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

    @Test
    public void testSort() {
        int[] unsortedArray = {4, -5, 22};
        final int[] sortedArray = {-5, 4, 22};
        sort(unsortedArray);
        assertArrayEquals(sortedArray, unsortedArray);
    }
}