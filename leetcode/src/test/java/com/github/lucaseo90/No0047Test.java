package com.github.lucaseo90;

import org.junit.Assert;
import org.junit.Test;

public class No0047Test {
    private No0047 no0047 = new No0047();

    @Test
    public void testExample01() {
        Assert.assertEquals("[[1, 1, 2], [1, 2, 1], [2, 1, 1]]", no0047.permuteUnique(new int[]{1, 1, 2}).toString());
    }

    @Test
    public void testExample02() {
        Assert.assertEquals("[[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]", no0047.permuteUnique(new int[]{1, 2, 3}).toString());
    }

}
