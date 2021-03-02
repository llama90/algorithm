package com.github.lucaseo90;

import org.junit.Assert;
import org.junit.Test;

public class No0070Test {

    private No0070 no0070 = new No0070();

    @Test
    public void example01() {
        Assert.assertEquals(2, no0070.climbStairs(2));
    }

    @Test
    public void example02() {
        Assert.assertEquals(3, no0070.climbStairs(3));
    }

    @Test
    public void customExample03() {
        Assert.assertEquals(5, no0070.climbStairs(4));
    }

    @Test
    public void customExample04() {
        Assert.assertEquals(8, no0070.climbStairs(5));
    }

    @Test
    public void customExample05() {
        Assert.assertEquals(13, no0070.climbStairs(6));
    }
}
