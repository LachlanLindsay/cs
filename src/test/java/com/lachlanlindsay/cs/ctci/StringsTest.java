package com.lachlanlindsay.cs.ctci;

import org.junit.Assert;
import org.junit.Test;

public class StringsTest {

    @Test
    public void offByOneOrLess() {
        Assert.assertTrue(Strings.oneAway("apple", "apple"));
        Assert.assertTrue(Strings.oneAway("apple", "appl"));
        Assert.assertTrue(Strings.oneAway("apple", "pple"));
        Assert.assertTrue(Strings.oneAway("ff", "f"));

        Assert.assertTrue(Strings.oneAway("aple", "apple"));

        Assert.assertTrue(Strings.oneAway("a", "b"));
        Assert.assertFalse(Strings.oneAway("able", "lead"));
        Assert.assertFalse(Strings.oneAway("abc", "bca"));


    }
}