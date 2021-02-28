package com.github.lucaseo90;

import org.junit.Assert;
import org.junit.Test;

public class No0040Test {

    private No0040 no0040 = new No0040();

    @Test
    public void example01() {
        Assert.assertEquals(
                "[[1, 2, 5], [1, 1, 6], [2, 6], [1, 7]]",
                no0040.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8).toString());
    }

    @Test
    public void example02() {
        Assert.assertEquals(
                "[[1, 2, 2], [5]]",
                no0040.combinationSum2(new int[]{2, 5, 2, 1, 2}, 5).toString());
    }

}
