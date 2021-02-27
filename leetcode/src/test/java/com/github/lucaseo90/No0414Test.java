package com.github.lucaseo90;

import org.junit.Assert;
import org.junit.Test;

public class No0414Test {

    @Test
    public void example01() {
        Assert.assertEquals(1, No0414.thirdMax(new int[]{3, 2, 1}));
    }

    @Test
    public void example02() {
        Assert.assertEquals(2, No0414.thirdMax(new int[]{1, 2}));
    }

    @Test
    public void example03() {
        Assert.assertEquals(1, No0414.thirdMax(new int[]{2, 2, 3, 1}));
    }

    @Test
    public void customExample01() {
        Assert.assertEquals(1, No0414.thirdMax(new int[]{1}));
    }

    @Test
    public void customExample02() {
        Assert.assertEquals(1, No0414.thirdMax(new int[]{2, 3, 2, 1}));
    }

    @Test
    public void customExample03() {
        Assert.assertEquals(1, No0414.thirdMax(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
    }
}
