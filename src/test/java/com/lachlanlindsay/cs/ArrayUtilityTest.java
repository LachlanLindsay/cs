package com.lachlanlindsay.cs;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArrayUtilityTest {

    @Test
    public void testSwap() {
        final int[] swappedArray = {3, 1};
        int[] array = {1, 3};

        ArrayUtility.swap(array, 0, array.length - 1);
        assertArrayEquals(swappedArray, array);
    }

}