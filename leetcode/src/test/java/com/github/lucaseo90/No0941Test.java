package com.github.lucaseo90;

import org.junit.Assert;
import org.junit.Test;

public class No0941Test {

    @Test
    public void example01() {
        Assert.assertFalse(No0941.validMountainArray(new int[]{2, 1}));
    }

    @Test
    public void example02() {
        Assert.assertFalse(No0941.validMountainArray(new int[]{3, 5, 5}));
    }

    @Test
    public void example03() {
        Assert.assertTrue(No0941.validMountainArray(new int[]{0, 3, 2, 1}));
    }

    @Test
    public void example04() {
        Assert.assertTrue(No0941.validMountainArray(new int[]{0, 2, 3, 4, 5, 2, 1, 0}));
    }

    @Test
    public void example05() {
        Assert.assertFalse(No0941.validMountainArray(new int[]{0, 2, 3, 3, 5, 2, 1, 0}));
    }

    @Test
    public void customExample01() {
        Assert.assertFalse(No0941.validMountainArray(new int[]{0, 1, 2, 3}));
    }

    @Test
    public void customExample02() {
        Assert.assertFalse(No0941.validMountainArray(new int[]{3, 2, 1, 0}));
    }

    @Test
    public void wrongAnswerExample01() {
        Assert.assertFalse(No0941.validMountainArray(new int[]{1, 1, 1, 1, 1, 1, 1, 2, 1}));
    }

}
