package com.github.lucaseo90;

import org.junit.Assert;
import org.junit.Test;

public class No0063Test {

    private No0063 no0063 = new No0063();

    @Test
    public void example01() {
        Assert.assertEquals(2,
                no0063.uniquePathsWithObstacles(
                        new int[][]{
                                {0, 0, 0},
                                {0, 1, 0},
                                {0, 0, 0}
                        }
                ));
    }

    @Test
    public void example02() {
        Assert.assertEquals(1,
                no0063.uniquePathsWithObstacles(
                        new int[][]{
                                {0, 1},
                                {0, 0}
                        }
                ));
    }

    @Test
    public void testErrorOccurredExample01() {
        Assert.assertEquals(0,
                no0063.uniquePathsWithObstacles(
                        new int[][]{
                                {1, 0}
                        }
                ));
    }

    @Test
    public void testErrorOccurredExample02() {
        Assert.assertEquals(0,
                no0063.uniquePathsWithObstacles(
                        new int[][]{
                                {0, 0},
                                {1, 1},
                                {0, 0}
                        }
                ));
    }
}
