package com.lachlanlindsay.cs.leet;

import org.junit.Assert;
import org.junit.Test;

public class UniqueEmailsTest {

    @Test
    public void numUniqueEmails() {
        Assert.assertEquals(2, new UniqueEmails().numUniqueEmails(
                new String[]{
                        "test.email+alex@leetcode.com",
                        "test.e.mail+bob.cathy@leetcode.com",
                        "testemail+david@lee.tcode.com"}));
    }
}