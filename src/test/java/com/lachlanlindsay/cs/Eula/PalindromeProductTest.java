package com.lachlanlindsay.cs.Eula;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class PalindromeProductTest {

    @Test
    public void comp() {
        int[] a = new int[]{1, 2, 3, 4};
        int[][] q = new int[][]{{1, 0}, {-3, 1}, {-4, 0}, {2, 3}};
        int[] ints = PalindromeProduct.sumEvenAfterQueries(a, q);
        System.out.println("ints = " + Arrays.toString(ints));
    }

    @Test
    public void largestPalindrome() {
        int palindrome = PalindromeProduct.findProductsOfLargestPalindrome(999, 100);
        System.out.println("palindrome = " + palindrome);

    }


    @Test
    public void isPalindrome() {
        Assert.assertTrue(PalindromeProduct.isPalindrome(101));
        Assert.assertFalse(PalindromeProduct.isPalindrome(1011));
        Assert.assertTrue(PalindromeProduct.isPalindrome(1));
        Assert.assertTrue(PalindromeProduct.isPalindrome(-1));
        Assert.assertTrue(PalindromeProduct.isPalindrome(-101));
    }
}