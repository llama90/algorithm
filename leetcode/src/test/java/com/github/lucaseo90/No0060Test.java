package com.github.lucaseo90;

import org.junit.Assert;
import org.junit.Test;

public class No0060Test {

    private No0060 no0060 = new No0060();

    @Test
    public void testExample01() {
        Assert.assertEquals("213", no0060.getPermutation(3, 3));
    }

    @Test
    public void testExample02() {
        Assert.assertEquals("2314", no0060.getPermutation(4, 9));
    }

    @Test
    public void testExample03() {
        Assert.assertEquals("123", no0060.getPermutation(3, 1));
    }
}
