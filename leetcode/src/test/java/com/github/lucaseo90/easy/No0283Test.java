package com.github.lucaseo90.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class No0283Test {

    No0283 no0283 = new No0283();

    @Test
    public void testExample01() {
        Assert.assertEquals("[1, 3, 12, 0, 0]", Arrays.toString(no0283.moveZeros(new int[]{0, 1, 0, 3, 12})));
    }

    @Test
    public void testExample02() {
        Assert.assertEquals("[0]", Arrays.toString(no0283.moveZeros(new int[]{0})));
    }

}
