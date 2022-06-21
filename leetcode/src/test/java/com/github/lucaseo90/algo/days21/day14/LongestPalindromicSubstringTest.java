package com.github.lucaseo90.algo.days21.day14;

import org.junit.Assert;
import org.junit.Test;

public class LongestPalindromicSubstringTest {

    private LongestPalindromicSubstring lps = new LongestPalindromicSubstring();

    @Test
    public void example01() {
        Assert.assertEquals("bab", lps.longestPalindrome("babad"));
    }
}
