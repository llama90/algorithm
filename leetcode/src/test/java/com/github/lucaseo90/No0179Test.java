package com.github.lucaseo90;

import org.junit.Assert;
import org.junit.Test;

public class No0179Test {

    @Test
    public void example01() {
        Assert.assertEquals("210", No0179.largestNumber(new int[]{10, 2}));
    }

    @Test
    public void example02() {
        Assert.assertEquals("9534330", No0179.largestNumber(new int[]{3, 30, 34, 5, 9}));
    }

    @Test
    public void example03() {
        Assert.assertEquals("1", No0179.largestNumber(new int[]{1}));
    }

    @Test
    public void example04() {
        Assert.assertEquals("10", No0179.largestNumber(new int[]{10}));
    }
}
