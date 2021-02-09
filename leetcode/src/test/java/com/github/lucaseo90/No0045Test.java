package com.github.lucaseo90;

import org.junit.Assert;
import org.junit.Test;

public class No0045Test {

    private No0045 no0045 = new No0045();

    @Test
    public void testExample01() {
        Assert.assertEquals(2, no0045.jump(new int[]{2, 3, 1, 1, 4}));
    }

    @Test
    public void testExample02() {
        Assert.assertEquals(2, no0045.jump(new int[]{2, 3, 0, 1, 4}));
    }

    @Test
    public void testCustomExample01() {
        Assert.assertEquals(1, no0045.jump(new int[]{4, 3, 0, 1, 4}));
    }

    @Test
    public void testCustomExample02() {
        Assert.assertEquals(1, no0045.jump(new int[]{5, 3, 0, 1, 4}));
    }

    @Test
    public void testCustomExample03() {
        Assert.assertEquals(4, no0045.jump(new int[]{1, 1, 1, 1, 1}));
    }

    @Test
    public void testCustomExample04() {
        Assert.assertEquals(2, no0045.jump(new int[]{2, 2, 2, 2, 2}));
    }

    /**
     * The example cases were passed by checking the visited index
     *   - testTimeLimitExceededErrorOccurredExample01
     *   - testTimeLimitExceededErrorOccurredExample02
     */

    @Test
    public void testTimeLimitExceededErrorOccurredExample01() {
        Assert.assertEquals(5, no0045.jump(new int[]{2, 9, 6, 5, 7, 0, 7, 2, 7, 9, 3, 2, 2, 5, 7, 8, 1, 6, 6, 6, 3, 5, 2, 2, 6, 3}));
    }

    @Test
    public void testTimeLimitExceededErrorOccurredExample02() {
        Assert.assertEquals(13, no0045.jump(new int[]{8, 2, 4, 4, 4, 9, 5, 2, 5, 8, 8, 0, 8, 6, 9, 1, 1, 6, 3, 5, 1, 2, 6, 6, 0, 4, 8, 6, 0, 3, 2, 8, 7, 6, 5, 1, 7, 0, 3, 4, 8, 3, 5, 9, 0, 4, 0, 1, 0, 5, 9, 2, 0, 7, 0, 2, 1, 0, 8, 2, 5, 1, 2, 3, 9, 7, 4, 7, 0, 0, 1, 8, 5, 6, 7, 5, 1, 9, 9, 3, 5, 0, 7, 5}));
    }

    /**
     *
     */

    @Test
    public void testTimeLimitExceededErrorOccurredExample03() {
        Assert.assertEquals(16, no0045.jump(new int[]{5, 8, 1, 8, 9, 8, 7, 1, 7, 5, 8, 6, 5, 4, 7, 3, 9, 9, 0, 6, 6, 3, 4, 8, 0, 5, 8, 9, 5, 3, 7, 2, 1, 8, 2, 3, 8, 9, 4, 7, 6, 2, 5, 2, 8, 2, 7, 9, 3, 7, 6, 9, 2, 0, 8, 2, 7, 8, 4, 4, 1, 1, 6, 4, 1, 0, 7, 2, 0, 3, 9, 8, 7, 7, 0, 6, 9, 9, 7, 3, 6, 3, 4, 8, 6, 4, 3, 3, 2, 7, 8, 5, 8, 6, 0}));
    }
}
