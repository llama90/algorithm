package com.github.lucaseo90;

import org.junit.Assert;
import org.junit.Test;

public class No0216Test {

    private No0216 no0216 = new No0216();

    @Test
    public void example01() {
        Assert.assertEquals("[[1, 2, 4]]", no0216.combinationSum3(3, 7).toString());
    }

    @Test
    public void example02() {
        Assert.assertEquals("[[1, 2, 6], [1, 3, 5], [2, 3, 4]]", no0216.combinationSum3(3, 9).toString());
    }

    @Test
    public void example03() {
        Assert.assertEquals("[]", no0216.combinationSum3(4, 1).toString());
    }

    @Test
    public void example04() {
        Assert.assertEquals("[]", no0216.combinationSum3(3, 2).toString());
    }

    @Test
    public void example05() {
        Assert.assertEquals("[[1, 2, 3, 4, 5, 6, 7, 8, 9]]", no0216.combinationSum3(9, 45).toString());
    }
}
