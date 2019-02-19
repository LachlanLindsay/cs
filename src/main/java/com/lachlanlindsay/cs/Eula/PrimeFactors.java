package com.lachlanlindsay.cs.Eula;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    /// start by dividing by 2, if there is no remainder - go again.
    /// keep doing that until either we a get to a prime number add it to a list
    // if there is a remainder and then increase to 3

    // x = 600851475143   factor = 2
    public static List factors(Long x, long factor, ArrayList<Long> factors) {
        if (factor > x)
            return factors;

        if (x % factor == 0) {
            factors.add(factor);
            factors(x / factor, factor, factors);
        } else {
            factors(x, ++factor, factors);
        }
        return factors;
    }


    public static int largestFactor(int x) {
        for (int i = x / 2; i > 1; i--) {
            if (x % i == 0) {
                return i;
            }
        }
        return -1;
    }
}
