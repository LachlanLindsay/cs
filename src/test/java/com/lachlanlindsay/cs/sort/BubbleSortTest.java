package com.lachlanlindsay.cs.sort;

import org.junit.Test;

import static com.lachlanlindsay.cs.sort.BubbleSort.sort;
import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {
    private int[] smallNumbers = {5, 4, 0, 1, 2};
    private int[] zeros = {0, 0, 0, 0, 0};
    private int[] longArray = {0, 5, 5, 3, 4, 5, 2, 1, 1, 1, 1};
    private int[] similarNumbers = {5, 5, 5, 5, 1};

    @Test
    public void testSort() {
        int[] unsortedArray = {4, -5, 22};
        final int[] sortedArray = {-5, 4, 22};
        sort(unsortedArray);
        assertArrayEquals(sortedArray, unsortedArray);

        sort(smallNumbers);
        assertArrayEquals(new int[]{0, 1, 2, 4, 5}, smallNumbers);

        sort(longArray);
        assertArrayEquals(new int[]{0, 1, 1, 1, 1, 2, 3, 4, 5, 5, 5}, longArray);

        sort(zeros);
        assertArrayEquals(new int[]{0, 0, 0, 0, 0}, zeros);

        sort(similarNumbers);
        assertArrayEquals(new int[]{1, 5, 5, 5, 5}, similarNumbers);
    }
}