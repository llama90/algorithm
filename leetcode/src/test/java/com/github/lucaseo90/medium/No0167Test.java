package com.github.lucaseo90.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class No0167Test {

    No0167 no0167 = new No0167();

    @Test
    public void testExample01() {
        Assert.assertEquals("[1, 2]", Arrays.toString(no0167.twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    @Test
    public void testExample02() {
        Assert.assertEquals("[1, 3]", Arrays.toString(no0167.twoSum(new int[]{2, 3, 4}, 6)));
    }

    @Test
    public void testExample03() {
        Assert.assertEquals("[1, 2]", Arrays.toString(no0167.twoSum(new int[]{-1, 0}, -1)));
    }

}
