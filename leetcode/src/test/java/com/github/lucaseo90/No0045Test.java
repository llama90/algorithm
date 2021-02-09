package com.github.lucaseo90;

import org.junit.Assert;
import org.junit.Test;

public class No0045Test {

    private No0045 no0045 = new No0045();

    @Test
    public void testExample01() {
        Assert.assertEquals(2, no0045.jump(new int[]{2, 3, 1, 1, 4}));
    }

    @Test
    public void testExample02() {
        Assert.assertEquals(2, no0045.jump(new int[]{2, 3, 0, 1, 4}));
    }

    @Test
    public void testCustomExample01() {
        Assert.assertEquals(1, no0045.jump(new int[]{4, 3, 0, 1, 4}));
    }

    @Test
    public void testCustomExample02() {
        Assert.assertEquals(1, no0045.jump(new int[]{5, 3, 0, 1, 4}));
    }

    @Test
    public void testCustomExample03() {
        Assert.assertEquals(4, no0045.jump(new int[]{1, 1, 1, 1, 1}));
    }

    @Test
    public void testCustomExample04() {
        Assert.assertEquals(2, no0045.jump(new int[]{2, 2, 2, 2, 2}));
    }

    @Test
    public void testTimeLimitExceededErrorOccurredExample01() {
        Assert.assertEquals(5, no0045.jump(new int[]{2, 9, 6, 5, 7, 0, 7, 2, 7, 9, 3, 2, 2, 5, 7, 8, 1, 6, 6, 6, 3, 5, 2, 2, 6, 3}));
    }
}
