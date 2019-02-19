package com.lachlanlindsay.cs.ctci;

import java.util.ArrayList;
import java.util.List;

public class Neighbours {
    public List<Integer> cellCompete(int[] states, int days) {
        System.out.println("starting cases");
        if (days == 0) {
            return convertArray(states);
        }
        do {
            int[] nextState = new int[states.length];

            for (int i = 0; i < states.length; i++) {
                nextState[i] = neighborsActive(states, i);
            }
            states = nextState;
            days--;
        } while (days > 0);

        return convertArray(states);
    }

    private int neighborsActive(int[] states, int index) {
        boolean leftNeighborActive;
        boolean rightNeighborActive;

        if (index == states.length - 1) {
            leftNeighborActive = active(states[index - 1]);
            rightNeighborActive = false;
        } else if (index < 1) {
            leftNeighborActive = false;
            rightNeighborActive = active(states[index + 1]);
        } else {
            leftNeighborActive = active(states[index + 1]);
            rightNeighborActive = active(states[index - 1]);
        }

        if (leftNeighborActive && rightNeighborActive) {
            return 0;
        }

        if (!leftNeighborActive && !rightNeighborActive) {
            return 0;
        }

        return 1;
    }

    private List<Integer> convertArray(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i : array) {
            list.add(i);
        }
        return list;
    }

    private boolean active(int x) {
        return x != 0;
    }
}