package com.lachlanlindsay.List.LinkedList.Singly;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


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

        assertFalse(linkedList.isEmpty());
        linkedList.printList();

        linkedList.removeFromFront();
        linkedList.printList();

        linkedList.removeFromFront();
        linkedList.printList();

        linkedList.removeFromFront();
        linkedList.printList();

    }

}