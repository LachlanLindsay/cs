package com.lachlanlindsay.cs.sort;

import com.lachlanlindsay.cs.Sort.CountingSort;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class CountingSortTest {
    private int[] smallNumbers = {5, 4, 0, 1, 2};
    private int[] zeros = {0, 0, 0, 0, 0};
    private int[] longArray = {0, 5, 5, 3, 4, 5, 2, 1, 1, 1, 1};
    private int[] similarNumbers = {5, 5, 5, 5, 1};

    @Test
    public void sort() {
        CountingSort.sort(smallNumbers);
        assertArrayEquals(new int[]{0, 1, 2, 4, 5}, smallNumbers);

        CountingSort.sort(longArray);
        assertArrayEquals(new int[]{0, 1, 1, 1, 1, 2, 3, 4, 5, 5, 5}, longArray);

        CountingSort.sort(zeros);
        assertArrayEquals(new int[]{0, 0, 0, 0, 0}, zeros);

        CountingSort.sort(similarNumbers);
        assertArrayEquals(new int[]{1, 5, 5, 5, 5}, similarNumbers);
    }

    @Test
    public void getCount() {
        int[] ints = new int[CountingSort.getCountArraySize()];
        CountingSort.countOccurrences(smallNumbers, ints);

        assertEquals(1, ints[0]);
        assertEquals(1, ints[1]);
        assertEquals(1, ints[2]);
        assertEquals(0, ints[3]);
        assertEquals(1, ints[4]);
        assertEquals(1, ints[5]);
    }
}