package com.github.lucaseo90.medium;

import org.junit.Assert;
import org.junit.Test;

public class No0079Test {

    private final No0079 no0079 = new No0079();

    @Test
    public void example01() {
        Assert.assertEquals(true, no0079.exist(new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'},
        }, "ABCCED"));
    }

    @Test
    public void example02() {
        Assert.assertEquals(true, no0079.exist(new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'},
        }, "SEE"));
    }

    @Test
    public void example03() {
        Assert.assertEquals(false, no0079.exist(new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'},
        }, "ABCB"));
    }

    @Test
    public void wrongExample01() {
        Assert.assertEquals(false, no0079.exist(new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'},
        }, "ABCB"));
    }

    @Test
    public void wrongExample02() {
        Assert.assertEquals(true, no0079.exist(new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'E', 'S'},
                {'A', 'D', 'E', 'E'},
        }, "ABCESEEEFS"));
    }
}
