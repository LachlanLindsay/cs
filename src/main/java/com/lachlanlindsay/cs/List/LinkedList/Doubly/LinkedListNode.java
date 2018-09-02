package com.lachlanlindsay.cs.List.LinkedList.Doubly;

public class LinkedListNode<T> {

    private T object;
    private LinkedListNode next;
    private LinkedListNode previous;

    public LinkedListNode(T object) {
        this.object = object;
    }

    public LinkedListNode getNext() {
        return next;
    }

    public void setNext(LinkedListNode head) {
        this.next = head;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public LinkedListNode getPrevious() {
        return previous;
    }

    public void setPrevious(LinkedListNode previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        if (object != null)
            return object.toString();
        else
            return "null";
    }
}
