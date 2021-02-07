package com.github.lucaseo90;

import org.junit.Assert;
import org.junit.Test;

public class No0007Test {

    No0007 no0007 = new No0007();

    @Test
    public void testExample01() {
        Assert.assertEquals(321, no0007.reverse(123));
    }

    @Test
    public void testExample02() {
        Assert.assertEquals(-321, no0007.reverse(-123));
    }

    @Test
    public void testExample03() {
        Assert.assertEquals(21, no0007.reverse(120));
    }

    @Test
    public void testExample04() {
        Assert.assertEquals(0, no0007.reverse(0));
    }

    @Test
    public void testCustomExample01() {
        Assert.assertEquals(1, no0007.reverse(100));
    }

    @Test
    public void testCustomExample02() {
        Assert.assertEquals(1, no0007.reverse(1000));
    }

    @Test
    public void testCustomExample03() {
        Assert.assertEquals(-1, no0007.reverse(-100));
    }

    @Test
    public void testCustomExample04() {
        Assert.assertEquals(-1, no0007.reverse(-1000));
    }

    @Test
    public void testCustomExample05() {
        Assert.assertEquals(-10001, no0007.reverse(-10001));
    }

    @Test
    public void testCustomExample06() {
        Assert.assertEquals(-201, no0007.reverse(-10200));
    }

    /**
     * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
     */
    @Test
    public void testErrorOccurredExample01() {
        Assert.assertEquals(0, no0007.reverse(1534236469));
    }
}
