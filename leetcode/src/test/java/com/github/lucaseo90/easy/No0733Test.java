package com.github.lucaseo90.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class No0733Test {

    private No0733 no0733 = new No0733();

    @Test
    public void testExample01() {
        Assert.assertEquals("[[2, 2, 2], [2, 2, 0], [2, 0, 1]]", (Arrays.deepToString(no0733.floodFill(new int[][]{
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1},
        }, 1, 1, 2))));
    }

    @Test
    public void testExample02() {
        Assert.assertEquals("[[2, 2, 2], [2, 2, 2]]", (Arrays.deepToString(no0733.floodFill(new int[][]{
                {0, 0, 0},
                {0, 0, 0},
        }, 0, 0, 2))));
    }
}
