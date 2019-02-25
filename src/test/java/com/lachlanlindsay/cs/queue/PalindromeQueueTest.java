package com.lachlanlindsay.cs.queue;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeQueueTest {

    @Test
    public void testTrue() {
        Assert.assertTrue(Palindrome.isPalindrome("racecar"));
    }

    @Test
    public void testPunctuation() {
        Assert.assertTrue(Palindrome.isPalindrome("I did, did I?"));
    }

    @Test
    public void testLetterCasing() {
        Assert.assertTrue(Palindrome.isPalindrome("Racecar"));
    }

    @Test
    public void testFalseCase() {
        Assert.assertFalse(Palindrome.isPalindrome("hello"));
    }
}