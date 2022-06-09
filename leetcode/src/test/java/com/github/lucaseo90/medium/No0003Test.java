package com.github.lucaseo90.medium;

import org.junit.Assert;
import org.junit.Test;

public class No0003Test {

    private final No0003 no0003 = new No0003();

    @Test
    public void example01() {
        Assert.assertEquals(3, no0003.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void example02() {
        Assert.assertEquals(1, no0003.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void example03() {
        Assert.assertEquals(3, no0003.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    public void wrongExample01() {
        Assert.assertEquals(1, no0003.lengthOfLongestSubstring(" "));
    }

    @Test
    public void wrongExample02() {
        Assert.assertEquals(3, no0003.lengthOfLongestSubstring("dvdf"));
    }
}
