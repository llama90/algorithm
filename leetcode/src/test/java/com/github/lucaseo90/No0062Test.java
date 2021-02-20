package com.github.lucaseo90;

import org.junit.Assert;
import org.junit.Test;

public class No0062Test {

    private No0062 no0062 = new No0062();

    @Test
    public void testExample01() {
        Assert.assertEquals(3, no0062.uniquePaths(3, 2));
    }

    @Test
    public void testExample02() {
        Assert.assertEquals(28, no0062.uniquePaths(7, 3));
    }

    @Test
    public void testExample03() {
        Assert.assertEquals(6, no0062.uniquePaths(3, 3));
    }

    @Test
    public void testCustomExample01() {
        Assert.assertEquals(2, no0062.uniquePaths(2, 2));
    }

    @Test
    // This case is overflow
    public void testCustomExample02() {
        Assert.assertEquals(-2129403600, no0062.uniquePaths(100, 100));
    }

}
