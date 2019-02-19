package com.lachlanlindsay.cs.ctci;

import org.junit.Test;

import java.util.List;

public class NeighboursTest {

    @Test
    public void cellCompete() {
        List<Integer> integers = new Neighbours().cellCompete(new int[]{1, 1, 1, 1, 1, 1, 0}, 2);
        System.out.println("integers = " + integers);
    }
}