package com.github.lucaseo90.medium;

import org.junit.Assert;
import org.junit.Test;

public class No0994Test {

    private final No0994 no0994 = new No0994();

    @Test
    public void example01() {
        Assert.assertEquals(4, no0994.orangesRotting(new int[][]{
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        }));
    }

    @Test
    public void example02() {
        Assert.assertEquals(-1, no0994.orangesRotting(new int[][]{
                {2, 1, 1},
                {0, 1, 1},
                {1, 0, 1}
        }));
    }

    @Test
    public void example03() {
        Assert.assertEquals(0, no0994.orangesRotting(new int[][]{
                {0, 2},
        }));
    }

    @Test
    public void wrongAnswerExample01() {
        Assert.assertEquals(2, no0994.orangesRotting(new int[][]{
                {2, 1, 1},
                {1, 1, 1},
                {0, 1, 2},
        }));
    }

}
