package com.lachlanlindsay.cs.stack;

import java.util.ArrayDeque;
import java.util.Deque;

class Palindrome {

    static boolean isPalindrome(String s) {

        if (s == null || s.length() < 2) {
            return true;
        }

        s = s.toLowerCase();
        s = s.replaceAll("[^a-z]", "");

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length() / 2; i++) {
            stack.add(s.charAt(i));
        }

        int pointer = s.length() - 1;
        while (!stack.isEmpty()) {
            Character pop = stack.pop();
            if (pop != s.charAt(pointer)) {
                return false;
            }
            --pointer;
        }

        return true;
    }

}
