package com.lachlanlindsay.List.LinkedList.Singly;

import org.junit.Test;

import static org.junit.Assert.*;


public class ListTest {

    @Test
    public void test() {
        var mazzda = new Car("XYX123", "2");
        var toyota = new Car("FJE38", "Yaris");
        var ford = new Car("XYX123", "Focus");

        var linkedList = new LinkedList<Car>();
        assertTrue(linkedList.isEmpty());

        linkedList.addToFront(mazzda);
        linkedList.addToFront(toyota);
        linkedList.addToFront(ford);

        assertEquals(3, linkedList.getSize());
        assertFalse(linkedList.isEmpty());

        linkedList.removeFromFront();
        assertEquals(2, linkedList.getSize());

        linkedList.removeFromFront();
        assertEquals(1, linkedList.getSize());

        linkedList.removeFromFront();
        assertEquals(0, linkedList.getSize());

    }
}