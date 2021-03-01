package com.github.lucaseo90;

import org.junit.Assert;
import org.junit.Test;

public class No0797Test {

    private No0797 no0797 = new No0797();

    @Test
    public void example01() {
        Assert.assertEquals("[[0, 1, 3], [0, 2, 3]]",
                no0797.allPathsSourceTarget(new int[][]{
                        {1, 2},
                        {3},
                        {3},
                        {}
                }).toString());
    }

    @Test
    public void example02() {
        Assert.assertEquals("[[0, 4], [0, 3, 4], [0, 1, 3, 4], [0, 1, 2, 3, 4], [0, 1, 4]]",
                no0797.allPathsSourceTarget(new int[][]{
                        {4, 3, 1},
                        {3, 2, 4},
                        {3},
                        {4},
                        {}
                }).toString());
    }


    @Test
    public void example03() {
        Assert.assertEquals("[[0, 1]]",
                no0797.allPathsSourceTarget(new int[][]{
                        {1},
                        {}
                }).toString());
    }

    @Test
    public void example04() {
        Assert.assertEquals("[[0, 1, 2, 3], [0, 2, 3], [0, 3]]",
                no0797.allPathsSourceTarget(new int[][]{
                        {1, 2, 3},
                        {2},
                        {3},
                        {}
                }).toString());
    }

    @Test
    public void example05() {
        Assert.assertEquals("[[0, 1, 2, 3], [0, 3]]",
                no0797.allPathsSourceTarget(new int[][]{
                        {1, 3},
                        {2},
                        {3},
                        {}
                }).toString());
    }
}
