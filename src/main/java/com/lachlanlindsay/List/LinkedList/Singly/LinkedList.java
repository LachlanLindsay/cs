package com.lachlanlindsay.List.LinkedList.Singly;

public class LinkedList<T> {

    private LinkedListNode head;
    private int size = 0;

    public void addToFront(T item) {
        LinkedListNode<T> node = new LinkedListNode<>(item);
        node.setNext(head);
        head = node;
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
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
