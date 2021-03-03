package com.github.lucaseo90;

import org.junit.Assert;
import org.junit.Test;

public class No0438Test {

    private No0438 no0438 = new No0438();

    @Test
    public void example01() {
        Assert.assertEquals("[0, 6]", no0438.findAnagrams("cbaebabacd", "abc").toString());
    }

    @Test
    public void example02() {
        Assert.assertEquals("[0, 1, 2]", no0438.findAnagrams("abab", "ab").toString());
    }
}
