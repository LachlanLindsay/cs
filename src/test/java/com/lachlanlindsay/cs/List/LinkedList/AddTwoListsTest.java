package com.lachlanlindsay.cs.List.LinkedList;

import org.junit.Test;

public class AddTwoListsTest {

    @Test
    public void addTwoNumbers() {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        ListNode listNode6 = new ListNode(6);
        listNode4.next = listNode5;
        listNode5.next = listNode6;


        ListNode listNode = new AddTwoLists().addTwoNumbers(listNode1, listNode4);
        System.out.println("listNode = " + listNode);
    }
}