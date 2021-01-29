package com.github.lucaseo90;

import org.junit.Assert;
import org.junit.Test;

public class No0003Test {

    No0003 no0003 = new No0003();

    @Test
    public void testExample01() {
        Assert.assertEquals(3, no0003.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void testExample02() {
        Assert.assertEquals(1, no0003.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void testExample03() {
        Assert.assertEquals(3, no0003.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    public void testExample04() {
        Assert.assertEquals(0, no0003.lengthOfLongestSubstring(""));
    }

    /**
     * Constraints:
     *
     * 0 <= s.length <= 5 * 104
     * s consists of English letters, digits, symbols and spaces.
     */

    @Test
    public void testExampleNumber01() {
        Assert.assertEquals(10, no0003.lengthOfLongestSubstring("1234567890"));
    }

    @Test
    public void testExampleNumber02() {
        Assert.assertEquals(6, no0003.lengthOfLongestSubstring("12345567890"));
    }

    @Test
    public void testExampleSymbols01() {
        Assert.assertEquals(6, no0003.lengthOfLongestSubstring("%^&*()"));
    }

    @Test
    public void testExampleSymbols02() {
        Assert.assertEquals(7, no0003.lengthOfLongestSubstring("%#^&*  (!#$@)"));
    }

    @Test
    public void testExampleSymbols03() {
        Assert.assertEquals(1, no0003.lengthOfLongestSubstring("  "));
    }

}
