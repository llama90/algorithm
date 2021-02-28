package com.github.lucaseo90;

import org.junit.Assert;
import org.junit.Test;

public class No0507Test {

    @Test
    public void example01() {
        Assert.assertTrue(No0507.checkPerfectNumber(28));
    }

    @Test
    public void example02() {
        Assert.assertTrue(No0507.checkPerfectNumber(6));
    }

    @Test
    public void example03() {
        Assert.assertTrue(No0507.checkPerfectNumber(496));
    }

    @Test
    public void example04() {
        Assert.assertTrue(No0507.checkPerfectNumber(8128));
    }

    @Test
    public void example05() {
        Assert.assertFalse(No0507.checkPerfectNumber(2));
    }
}
