package com.lachlanlindsay.cs.List.LinkedList.Doubly;

public class LinkedList<T> {

    private LinkedListNode head;
    private LinkedListNode tail;

    private int size = 0;

    public void addToFront(T item) {
        LinkedListNode node = new LinkedListNode<>(item);
        if (isEmpty()) {
            tail = node;
        } else {
            node.setNext(head);
            head.setPrevious(node);
        }

        head = node;
        size++;
    }

    public void addToEnd(T item) {
        LinkedListNode node = new LinkedListNode(item);
        if (isEmpty()) {
            head = node;
        } else {
            tail.setNext(node);
            node.setPrevious(tail);
        }
        size++;
    }

    public LinkedListNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }
        LinkedListNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        removedNode.setPrevious(null);

        return removedNode;


    }

    public LinkedListNode removeFromEnd() {
        if (isEmpty()) {
            return null;
        }

        LinkedListNode removedNode = tail;
        tail = tail.getPrevious();
        size--;
        removedNode.setPrevious(null);
        return removedNode;
    }

    public int getSize() {
        return size;
    }

    public Boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        LinkedListNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" <-> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
