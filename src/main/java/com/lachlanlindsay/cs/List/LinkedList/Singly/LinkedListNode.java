package com.lachlanlindsay.cs.List.LinkedList.Singly;

public class LinkedListNode<T> {

    private T object;
    private LinkedListNode next;

    public LinkedListNode(T object) {
        this.object = object;
    }

    public LinkedListNode getNext() {
        return next;
    }

    public void setNext(LinkedListNode head) {
        this.next = head;
    }

    @Override
    public String toString() {
        if (object != null)
            return object.toString();
        else
            return "null";
    }
}
