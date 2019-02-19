package com.lachlanlindsay.cs;

import com.lachlanlindsay.cs.stack.MinStack;
import org.junit.Test;

public class MinStackTest {
    @Test
    public void test() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println("minStack.getMin() = " + minStack.getMin());
        minStack.pop();
        minStack.top();
        System.out.println("minStack.getMin() = " + minStack.getMin());

    }

}