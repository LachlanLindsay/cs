package com.lachlanlindsay.cs.List.LinkedList.Singly;

import org.junit.Test;

import java.util.Arrays;

public class scopeTest {

    @Test
    public void scopeTest() {
        largerScope(new int[]{1, 3, 3, 4, 6, 1, 1, 1, 1, 1}, 4);
        localizedScope(new int[]{1, 3, 3, 4, 6, 1, 1, 1, 1, 1}, 4);
    }

    public void largerScope(int[] states, int loops) {
        int[] nextState = new int[states.length];
        do {
            for (int i = 0; i < states.length; i++) {
                nextState[i] = states[i] + 1;
            }
            states = nextState;
            loops--;
            System.out.println("nextState larger scope = " + Arrays.toString(states));
        } while (loops > 0);
    }

    public void localizedScope(int[] states, int loops) {
        do {
            int[] nextState = new int[states.length];
            for (int i = 0; i < states.length; i++) {
                nextState[i] = states[i] + 1;
            }
            states = nextState;
            loops--;
            System.out.println("nextState local scope = " + Arrays.toString(states));
        } while (loops > 0);
    }

    private void printArray(int[] x) {
        for (int i : x) {
            System.out.print(x);
        }
    }

}