package com.lachlanlindsay.cs.List.LinkedList.Doubly;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void test() {
        var book1 = new Book("J. K. Rowling", "The Philosopher's Stone");
        var book2 = new Book("J. K. Rowling", "The Chamber of Secrets");
        var book3 = new Book("J. K. Rowling", "The Prisoner of Azkaban");
        var book4 = new Book("J. K. Rowling", "The Goblet of Fire");
        var book5 = new Book("J. K. Rowling", "The Order of the Phoenix");
        var book6 = new Book("J. K. Rowling", "The Deathly Hallows");
        var book7 = new Book("J. K. Rowling", "Harry Potter Prequel");

        var linkedList = new LinkedList<Book>();
        assertTrue(linkedList.isEmpty());

        linkedList.addToFront(book1);
        linkedList.addToFront(book2);
        linkedList.addToFront(book3);
        linkedList.addToFront(book4);
        linkedList.addToFront(book5);
        linkedList.addToFront(book6);

        assertEquals(6, linkedList.getSize());
        assertFalse(linkedList.isEmpty());

        linkedList.removeFromFront();
        assertEquals(5, linkedList.getSize());

        linkedList.removeFromFront();
        assertEquals(4, linkedList.getSize());

        linkedList.removeFromFront();
        assertEquals(3, linkedList.getSize());

        linkedList.addToEnd(book7);
        assertEquals(4, linkedList.getSize());

        linkedList.removeFromEnd();
        assertEquals(3, linkedList.getSize());
    }

}