package com.lachlanlindsay;

import org.junit.Assert;
import org.junit.Test;

import static com.lachlanlindsay.ArrayUtility.swap;

public class ArrayUtilityTest {

    @Test
    public void testSwap() {
        final int[] swappedArray = {3, 1};
        int[] array = {1, 3};

        swap(array, 0, array.length - 1);
        Assert.assertArrayEquals(swappedArray, array);
    }

}