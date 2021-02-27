package com.github.lucaseo90;

import org.junit.Assert;
import org.junit.Test;

public class No0009Test {

    @Test
    public void example01() {
        Assert.assertTrue(No0009.isPalindrome(121));
    }

    @Test
    public void example02() {
        Assert.assertFalse(No0009.isPalindrome(-121));
    }

    @Test
    public void example03() {
        Assert.assertFalse(No0009.isPalindrome(10));
    }

    @Test
    public void example04() {
        Assert.assertFalse(No0009.isPalindrome(-101));
    }
}
