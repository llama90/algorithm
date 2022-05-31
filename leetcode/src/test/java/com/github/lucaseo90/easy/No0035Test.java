package com.github.lucaseo90.easy;

import org.junit.Assert;
import org.junit.Test;

public class No0035Test {

    No0035 no0035 = new No0035();

    @Test
    public void testExample01() {
        Assert.assertEquals(2, no0035.searchInsert(new int[]{1, 3, 5, 6}, 5));
    }

    @Test
    public void testExample02() {
        Assert.assertEquals(1, no0035.searchInsert(new int[]{1, 3, 5, 6}, 2));
    }

    @Test
    public void testExample03() {
        Assert.assertEquals(4, no0035.searchInsert(new int[]{1, 3, 5, 6}, 7));
    }

    @Test
    public void testUserDefinedExample01() {
        Assert.assertEquals(4, no0035.searchInsert(new int[]{-1, 0, 3, 5, 9, 12}, 9));
    }

    @Test
    public void testUserDefinedExample02() {
        Assert.assertEquals(2, no0035.searchInsert(new int[]{-1, 0, 3, 5, 9, 12}, 2));
    }

    @Test
    public void testUserDefinedExample03() {
        Assert.assertEquals(0, no0035.searchInsert(new int[]{-1, 0, 3, 5, 9, 12}, -2));
        Assert.assertEquals(0, no0035.searchInsert(new int[]{-1, 0, 3, 5, 9, 12}, -1));
        Assert.assertEquals(2, no0035.searchInsert(new int[]{-1, 0, 3, 5, 9, 12}, 1));
        Assert.assertEquals(2, no0035.searchInsert(new int[]{-1, 0, 3, 5, 9, 12}, 2));
        Assert.assertEquals(2, no0035.searchInsert(new int[]{-1, 0, 3, 5, 9, 12}, 3));
        Assert.assertEquals(3, no0035.searchInsert(new int[]{-1, 0, 3, 5, 9, 12}, 4));
        Assert.assertEquals(3, no0035.searchInsert(new int[]{-1, 0, 3, 5, 9, 12}, 5));
        Assert.assertEquals(4, no0035.searchInsert(new int[]{-1, 0, 3, 5, 9, 12}, 6));
        Assert.assertEquals(4, no0035.searchInsert(new int[]{-1, 0, 3, 5, 9, 12}, 7));
        Assert.assertEquals(4, no0035.searchInsert(new int[]{-1, 0, 3, 5, 9, 12}, 8));
        Assert.assertEquals(4, no0035.searchInsert(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        Assert.assertEquals(5, no0035.searchInsert(new int[]{-1, 0, 3, 5, 9, 12}, 10));
        Assert.assertEquals(5, no0035.searchInsert(new int[]{-1, 0, 3, 5, 9, 12}, 11));
        Assert.assertEquals(5, no0035.searchInsert(new int[]{-1, 0, 3, 5, 9, 12}, 12));
        Assert.assertEquals(6, no0035.searchInsert(new int[]{-1, 0, 3, 5, 9, 12}, 13));
    }
}
