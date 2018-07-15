package com.lachlanlindsay.sort;

import com.lachlanlindsay.Sort.RadixSort;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadixSortTest {
    private int[] unsorted = {4725, 4586, 1330, 8792, 1594, 5729};

    @Test
    public void sort() {
        RadixSort.sort(unsorted);
        Assert.assertArrayEquals(new int[]{1330, 1594, 4586, 4725, 5729, 8792}, unsorted);
    }

    @Test
    public void get() {
        assertEquals(1, RadixSort.getWidth(1));
        assertEquals(1, RadixSort.getWidth(0));
        assertEquals(1, RadixSort.getWidth(5));
        assertEquals(2, RadixSort.getWidth(10));
        assertEquals(2, RadixSort.getWidth(50));
        assertEquals(3, RadixSort.getWidth(100));
        assertEquals(2, RadixSort.getWidth(75));
        assertEquals(2, RadixSort.getWidth(-75));
    }

    @Test
    public void testGetDigit() {
        assertEquals(6, RadixSort.getDigit(0, 123456, 10));
        assertEquals(5, RadixSort.getDigit(1, 123456, 10));
        assertEquals(4, RadixSort.getDigit(2, 123456, 10));
        assertEquals(3, RadixSort.getDigit(3, 123456, 10));
        assertEquals(2, RadixSort.getDigit(4, 123456, 10));
        assertEquals(1, RadixSort.getDigit(5, 123456, 10));
    }
}