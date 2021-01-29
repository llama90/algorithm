package com.github.lucaseo90;

import org.junit.Assert;
import org.junit.Test;

public class No0004Test {

    No0004 no0004 = new No0004();

    @Test
    public void testExample01() {
        Assert.assertEquals(2.00000, no0004.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}), 0.01d);
    }

    @Test
    public void testExample02() {
        Assert.assertEquals(2.50000, no0004.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}), 0.01d);
    }

    @Test
    public void testExample03() {
        Assert.assertEquals(0.00000, no0004.findMedianSortedArrays(new int[]{0, 0}, new int[]{0, 0}), 0.01d);
    }

    @Test
    public void testExample04() {
        Assert.assertEquals(1.00000, no0004.findMedianSortedArrays(new int[]{}, new int[]{1}), 0.01d);
    }

    @Test
    public void testExample05() {
        Assert.assertEquals(2.00000, no0004.findMedianSortedArrays(new int[]{2}, new int[]{}), 0.01d);
    }

    @Test
    public void testCustomExample01() {
        Assert.assertEquals(2.50000, no0004.findMedianSortedArrays(new int[]{1, 3}, new int[]{2, 4}), 0.01d);
    }

    @Test
    public void testCustomExample02() {
        Assert.assertEquals(5.50000, no0004.findMedianSortedArrays(new int[]{1, 2, 3, 4, 5, 6}, new int[]{7, 8, 9, 10}), 0.01d);
    }

    @Test
    public void testCustomExample03() {
        Assert.assertEquals(5.50000, no0004.findMedianSortedArrays(new int[]{7, 8, 9, 10}, new int[]{1, 2, 3, 4, 5, 6}), 0.01d);
    }

    @Test
    public void testCustomExample04() {
        Assert.assertEquals(5.00000, no0004.findMedianSortedArrays(new int[]{1, 2, 3, 4, 5, 6}, new int[]{7, 8, 9}), 0.01d);
    }
}
