package com.lachlanlindsay.cs.search;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {

    @Test
    public void test() {
        int[] indexes = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] complex = {14, 49, 548, 892034};

        assertEquals(-1, BinarySearch.iterativeBinarySearch(indexes, 49));
        assertEquals(0, BinarySearch.iterativeBinarySearch(indexes, 0));
        assertEquals(1, BinarySearch.iterativeBinarySearch(complex, 49));
    }

}