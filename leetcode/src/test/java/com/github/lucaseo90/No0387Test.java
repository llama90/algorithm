package com.github.lucaseo90;

import org.junit.Assert;
import org.junit.Test;

public class No0387Test {

    private No0387 no0387 = new No0387();

    @Test
    public void example01() {
        Assert.assertEquals(0, no0387.firstUniqChar("leetcode"));
    }

    @Test
    public void example02() {
        Assert.assertEquals(2, no0387.firstUniqChar("loveleetcode"));
    }

    @Test
    public void testCustomExample01() {
        Assert.assertEquals(-1, no0387.firstUniqChar("aabbccddeeffgg"));
    }
}
