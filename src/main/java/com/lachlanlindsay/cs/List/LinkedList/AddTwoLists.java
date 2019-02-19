package com.lachlanlindsay.cs.List.LinkedList;

import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class AddTwoLists {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Long result = listToRealNumber(l1) + listToRealNumber(l2);
        String raw = result.toString();

        int[] nextState = new int[5];
        // 123
        // 3 -> 2 -> 1 -> null
        ListNode previous = null;
        ListNode temp = null;
        for (int i = 0; i < raw.length(); i++) {
            if (previous == null) {
                previous = new ListNode(Integer.valueOf(raw.substring(0 + i, 1 + i)));
            } else {
                temp = new ListNode(Integer.valueOf(raw.substring(0 + i, 1 + i)));
                temp.next = previous;
                previous = temp;
            }
        }

        List<Integer> ar = new ArrayList<>();


        return previous;
    }


    private Long listToRealNumber(ListNode l) {
        StringBuilder number = new StringBuilder();
        if (l == null) {
            return 0L;
        }
        int[] x = {};
        do {
            number.append(l.val);
            l = l.next;
        } while (l != null);

        return Long.valueOf(number.reverse().toString());
    }
}
