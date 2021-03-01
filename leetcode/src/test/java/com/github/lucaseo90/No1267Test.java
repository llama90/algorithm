package com.github.lucaseo90;

import org.junit.Assert;
import org.junit.Test;

public class No1267Test {

    private No1267 no1267 = new No1267();

    @Test
    public void example01() {
        no1267.countServers(new int[][]{
                {1, 0},
                {0, 1}
        });
    }

    @Test
    public void example02() {
        no1267.countServers(new int[][]{
                {1, 0},
                {1, 1}
        });
    }

    @Test
    public void example03() {
        Assert.assertEquals(4, no1267.countServers(new int[][]{
                {1, 1, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1}
        }));
    }

    /**
     * Two servers are said to communicate if they are on the same row or on the same column.
     */
    @Test
    public void wrongAnswerExample01() {
        Assert.assertEquals(3, no1267.countServers(new int[][]{
                {1, 0, 0, 1, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0}
        }));
    }

    @Test
    public void wrongAnswerExample02() {
        Assert.assertEquals(6, no1267.countServers(new int[][]{
                {0, 0, 1, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
                {1, 0, 1, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 0}
        }));
    }

}
