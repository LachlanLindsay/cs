package com.lachlanlindsay.cs.sort;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadixSortIntsTest {
    private int[] unsorted = {4725, 4586, 1330, 8792, 1594, 5729};
    private String[] unsortedAlphaBlocks = {"def", "pqr", "ghi", "abc", "jkl", "mno", "stu"};
    private String[] unsortedRandom = {"jkl", "ghi", "mno"};


    @Test
    public void sortInts() {
        RadixSortInts.sort(unsorted);
        Assert.assertArrayEquals(new int[]{1330, 1594, 4586, 4725, 5729, 8792}, unsorted);
    }

    @Test
    public void sortString() {
        RadixSortStrings.sort(unsortedAlphaBlocks);
        Assert.assertArrayEquals(new String[]{"abc", "def", "ghi", "jkl", "mno", "pqr", "stu"}, unsortedAlphaBlocks);

        RadixSortStrings.sort(unsortedRandom);
        Assert.assertArrayEquals(new String[]{"ghi", "jkl", "mno"}, unsortedRandom);
    }

    @Test
    public void testWidth() {
        assertEquals(1, RadixSortInts.getWidth(1));
        assertEquals(1, RadixSortInts.getWidth(0));
        assertEquals(1, RadixSortInts.getWidth(5));
        assertEquals(2, RadixSortInts.getWidth(10));
        assertEquals(2, RadixSortInts.getWidth(50));
        assertEquals(3, RadixSortInts.getWidth(100));
        assertEquals(2, RadixSortInts.getWidth(75));
        assertEquals(2, RadixSortInts.getWidth(-75));
    }

    @Test
    public void testGetDigit() {
        Assert.assertEquals(6, RadixUtil.getCountArrayIndexPosition(0, 123456, 10));
        assertEquals(5, RadixUtil.getCountArrayIndexPosition(1, 123456, 10));
        assertEquals(4, RadixUtil.getCountArrayIndexPosition(2, 123456, 10));
        assertEquals(3, RadixUtil.getCountArrayIndexPosition(3, 123456, 10));
        assertEquals(2, RadixUtil.getCountArrayIndexPosition(4, 123456, 10));
        assertEquals(1, RadixUtil.getCountArrayIndexPosition(5, 123456, 10));

        assertEquals(0, RadixUtil.getCountArrayIndexPosition(0, "abcd", 26));
        assertEquals(1, RadixUtil.getCountArrayIndexPosition(1, "abcd", 26));
        assertEquals(2, RadixUtil.getCountArrayIndexPosition(2, "abcd", 26));
        assertEquals(3, RadixUtil.getCountArrayIndexPosition(3, "abcd", 26));

        assertEquals(4, RadixUtil.getCountArrayIndexPosition(0, "efg", 26));
        assertEquals(20, RadixUtil.getCountArrayIndexPosition(1, "rux", 26));

    }
}