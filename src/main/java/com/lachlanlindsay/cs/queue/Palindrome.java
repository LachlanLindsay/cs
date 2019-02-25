package com.lachlanlindsay.cs.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {

    public static boolean isPalindrome(String s) {
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) > 'a' && s.charAt(i) < 'z') {
                queue.add(s.charAt(i));
                stack.add(s.charAt(i));
            }
        }

        while (!queue.isEmpty()) {
            if (!queue.poll().equals(stack.pop())) {
                return false;
            }
        }
        return true;
    }

}
