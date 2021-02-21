package com.github.lucaseo90;

import org.junit.Assert;
import org.junit.Test;

public class No0039Test {

    private No0039 no0039 = new No0039();

    @Test
    public void example01() {
        Assert.assertEquals(
                "[[2, 2, 3], " +
                        "[7]]",
                no0039.combinationSum(new int[]{2, 3, 6, 7}, 7).toString());
    }

    @Test
    public void example02() {
        Assert.assertEquals(
                "[[2, 2, 2, 2], " +
                        "[2, 3, 3], " +
                        "[3, 5]]",
                no0039.combinationSum(new int[]{2, 3, 5}, 8).toString());
    }

    @Test
    public void example03() {
        Assert.assertEquals(
                "[]",
                no0039.combinationSum(new int[]{2}, 1).toString());
    }

    @Test
    public void example04() {
        Assert.assertEquals(
                "[[1]]",
                no0039.combinationSum(new int[]{1}, 1).toString());
    }

    @Test
    public void example05() {
        Assert.assertEquals(
                "[[1, 1]]",
                no0039.combinationSum(new int[]{1}, 2).toString());
    }

    @Test
    public void testErrorOccurredExample01() {
        Assert.assertEquals(
                "[[1, 1, 1, 1, 1, 1, 1, 1, 1], " +
                        "[1, 1, 1, 1, 1, 1, 1, 2], " +
                        "[1, 1, 1, 1, 1, 1, 3], " +
                        "[1, 1, 1, 1, 1, 2, 2], " +
                        "[1, 1, 1, 1, 2, 3], " +
                        "[1, 1, 1, 1, 5], " +
                        "[1, 1, 1, 2, 2, 2], " +
                        "[1, 1, 1, 3, 3], " +
                        "[1, 1, 1, 6], " +
                        "[1, 1, 2, 2, 3], " +
                        "[1, 1, 2, 5], " +
                        "[1, 1, 7], " +
                        "[1, 2, 2, 2, 2], " +
                        "[1, 2, 3, 3], " +
                        "[1, 2, 6], " +
                        "[1, 3, 5], " +
                        "[2, 2, 2, 3], " +
                        "[2, 2, 5], " +
                        "[2, 7], " +
                        "[3, 3, 3], " +
                        "[3, 6]]",
                no0039.combinationSum(new int[]{2, 7, 6, 3, 5, 1}, 9).toString());
    }
}
