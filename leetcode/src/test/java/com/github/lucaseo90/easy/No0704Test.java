package com.github.lucaseo90.easy;

import org.junit.Assert;
import org.junit.Test;

public class No0704Test {

    No0704 no0704 = new No0704();

    @Test
    public void testExample01() {
        Assert.assertEquals(4, no0704.search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
    }

    @Test
    public void testExample02() {
        Assert.assertEquals(-1, no0704.search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
    }

    @Test
    public void testUserDefinedExample01() {
        Assert.assertEquals(-1, no0704.search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
        Assert.assertEquals(0, no0704.search(new int[]{-1, 0, 3, 5, 9, 12}, -1));
        Assert.assertEquals(1, no0704.search(new int[]{-1, 0, 3, 5, 9, 12}, 0));
        Assert.assertEquals(2, no0704.search(new int[]{-1, 0, 3, 5, 9, 12}, 3));
        Assert.assertEquals(3, no0704.search(new int[]{-1, 0, 3, 5, 9, 12}, 5));
        Assert.assertEquals(4, no0704.search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        Assert.assertEquals(5, no0704.search(new int[]{-1, 0, 3, 5, 9, 12}, 12));
    }

}
