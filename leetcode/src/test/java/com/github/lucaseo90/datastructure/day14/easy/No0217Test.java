package com.github.lucaseo90.datastructure.day14.easy;

import org.junit.Assert;
import org.junit.Test;

public class No0217Test {

    private No0217 no0217 = new No0217();

    @Test
    public void testExample01() {
        Assert.assertEquals(true, no0217.containsDuplicate(new int[]{1, 2, 3, 1}));
    }

    @Test
    public void testExample02() {
        Assert.assertEquals(false, no0217.containsDuplicate(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void testExample03() {
        Assert.assertEquals(true, no0217.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }
}
