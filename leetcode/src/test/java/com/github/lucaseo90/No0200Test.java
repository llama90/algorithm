package com.github.lucaseo90;

import org.junit.Assert;
import org.junit.Test;

public class No0200Test {

    private No0200 no0200 = new No0200();

    @Test
    public void example01() {
        Assert.assertEquals(1,
                no0200.numIslands(
                        new char[][]
                                {
                                        {'1', '1', '1', '1', '0'},
                                        {'1', '1', '0', '1', '0'},
                                        {'1', '1', '0', '0', '0'},
                                        {'0', '0', '0', '0', '0'}
                                }
                ));
    }

    @Test
    public void example02() {
        Assert.assertEquals(3,
                no0200.numIslands(
                        new char[][]
                                {
                                        {'1', '1', '0', '0', '0'},
                                        {'1', '1', '0', '0', '0'},
                                        {'0', '0', '1', '0', '0'},
                                        {'0', '0', '0', '1', '1'}
                                }
                ));
    }

    @Test
    public void testErrorOccurredExample01() {
        Assert.assertEquals(1,
                no0200.numIslands(
                        new char[][]
                                {
                                        {'1', '1', '1'},
                                        {'0', '1', '0'},
                                        {'1', '1', '1'}
                                }
                ));
    }
}
