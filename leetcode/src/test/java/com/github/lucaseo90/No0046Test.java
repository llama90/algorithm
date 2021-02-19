package com.github.lucaseo90;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class No0046Test {

    private No0046 no0046 = new No0046();

    @Test
    public void testExample01() {
        Assert.assertEquals("[[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]", no0046.permute(new int[]{1, 2, 3}).toString());
    }

    @Test
    public void testExample02() {
        Assert.assertEquals("[[0, 1], [1, 0]]", no0046.permute(new int[]{0, 1}).toString());
    }

    @Test
    public void testExample03() {
        Assert.assertEquals("[[1]]", no0046.permute(new int[]{1}).toString());
    }
}
