package com.lachlanlindsay.cs.Eula;

import org.junit.Assert;
import org.junit.Test;

public class Problem1Test {

    @Test
    public void multiples() {
        Assert.assertEquals(23, Problem1.sumOfMultiplesOf3and5(10));
    }
}