package com.lachlanlindsay.cs.Eula;

public class EvenFibonacci {

    public static void evenFibonacci(int x) {
        long total = 0L;
        long previous = 0;
        long next = 1;
        long counter = 0;
        do {
            total = previous + next;
            previous = next;
            next = total;
            if (total % 2 == 0) {
                counter += total;
            }
        } while (total < 4000000);
        System.out.println("total = " + total);
        System.out.println("counter = " + counter);
    }
}
