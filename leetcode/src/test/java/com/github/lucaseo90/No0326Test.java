package com.github.lucaseo90;

import org.junit.Assert;
import org.junit.Test;

public class No0326Test {

    @Test
    public void example01() {
        Assert.assertTrue(No0326.isPowerOfThree(27));
    }

    @Test
    public void example02() {
        Assert.assertFalse(No0326.isPowerOfThree(0));
    }

    @Test
    public void example03() {
        Assert.assertTrue(No0326.isPowerOfThree(9));
    }

    @Test
    public void example04() {
        Assert.assertFalse(No0326.isPowerOfThree(45));
    }

    @Test
    public void wrongAnswerExample01() {
        Assert.assertTrue(No0326.isPowerOfThree(1));
    }

    @Test
    public void customExample01() {
        Assert.assertFalse(No0326.isPowerOfThree(2));
    }

}
