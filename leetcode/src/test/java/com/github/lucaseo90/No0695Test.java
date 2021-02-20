package com.github.lucaseo90;

import org.junit.Assert;
import org.junit.Test;

public class No0695Test {

    private No0695 no0695 = new No0695();

    @Test
    public void example01() {
        Assert.assertEquals(6,
                no0695.maxAreaOfIsland(
                        new int[][]{
                                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
                        }
                ));
    }

    @Test
    public void example02() {
        Assert.assertEquals(0,
                no0695.maxAreaOfIsland(
                        new int[][]{{0, 0, 0, 0, 0, 0, 0, 0}}
                ));
    }

    @Test
    public void example03() {
        Assert.assertEquals(4,
                no0695.maxAreaOfIsland(
                        new int[][]{
                                {1, 1, 0, 0, 0},
                                {1, 1, 0, 0, 0},
                                {0, 0, 0, 1, 1},
                                {0, 0, 0, 1, 1}
                        }
                ));
    }
}
