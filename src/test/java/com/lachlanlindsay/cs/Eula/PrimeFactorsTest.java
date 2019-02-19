package com.lachlanlindsay.cs.Eula;

import org.junit.Test;

import java.util.ArrayList;

public class PrimeFactorsTest {

    @Test
    public void largestPrimeNumber() {
        System.out.println("PrimeFactors.largestFactor(13195) = " + PrimeFactors.largestFactor(13195));
        ArrayList<Long> factors = new ArrayList<>();
        System.out.println("PrimeFactors.) = " + PrimeFactors.factors(23432l, 2, factors));
        System.out.println("factors = " + factors);
    }
}