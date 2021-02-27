package com.github.lucaseo90;

import org.junit.Assert;
import org.junit.Test;

public class No1725Test {

    @Test
    public void example01() {
        Assert.assertEquals(3, No1725.countGoodRectangles(new int[][]{
                {5, 8},
                {3, 9},
                {5, 12},
                {16, 5}
        }));
    }
}
