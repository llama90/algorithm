package com.github.lucaseo90.algo.days21.day6;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfProvincesTest {

    private NumberOfProvinces provinces = new NumberOfProvinces();

    @Test
    public void example01() {
        Assert.assertEquals(2,
                provinces.findCircleNum(new int[][]{
                        {1, 1, 0},
                        {1, 1, 0},
                        {0, 0, 1}
                }));
    }

    @Test
    public void wrongAnswer01() {
        Assert.assertEquals(1,
                provinces.findCircleNum(new int[][]{
                        {1, 0, 0, 1},
                        {0, 1, 1, 0},
                        {0, 1, 1, 1},
                        {1, 0, 1, 1}
                }));
    }
}
