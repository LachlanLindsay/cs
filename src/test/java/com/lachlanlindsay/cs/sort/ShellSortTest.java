package com.lachlanlindsay.cs.sort;

import org.junit.Test;

import static com.lachlanlindsay.cs.Sort.ShellSort.sort;
import static org.junit.Assert.assertArrayEquals;

public class ShellSortTest {

    @Test
    public void testSort() {
        int[] unsortedArray = {4, -5, 22, 55, 33, 44, 5};
        final int[] sortedArray = {-5, 4, 5, 22, 33, 44, 55};

        sort(unsortedArray);
        assertArrayEquals(sortedArray, unsortedArray);
    }
}