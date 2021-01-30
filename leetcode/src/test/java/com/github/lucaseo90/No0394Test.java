package com.github.lucaseo90;

import org.junit.Assert;
import org.junit.Test;

public class No0394Test {

    No0394 no0394 = new No0394();

    @Test
    public void example01() {
        Assert.assertEquals("aaabcbc", no0394.decodeString("3[a]2[bc]"));
    }

    @Test
    public void example02() {
        Assert.assertEquals("accaccacc", no0394.decodeString("3[a2[c]]"));
    }

    @Test
    public void example03() {
        Assert.assertEquals("abcabccdcdcdef", no0394.decodeString("2[abc]3[cd]ef"));
    }

    @Test
    public void example04() {
        Assert.assertEquals("abccdcdcdxyz", no0394.decodeString("abc3[cd]xyz"));
    }

    @Test
    public void testCustomExample01() {
        Assert.assertEquals("a", no0394.decodeString("1[a]"));
    }

    @Test
    public void testCustomExample02() {
        Assert.assertEquals("abb", no0394.decodeString("1[a2[b]]"));
    }

    @Test
    public void testCustomExample03() {
        Assert.assertEquals("abcccbccc", no0394.decodeString("1[a2[b3[c]]]"));
    }

    @Test
    public void testCustomExample04() {
        Assert.assertEquals("abcdcdcdbcdcdcd", no0394.decodeString("1[a2[b3[cd]]]"));
    }

    /**
     * All the integers in s are in the range [1, 300].
     * e.g., 100[leetcode]
     */

    @Test
    public void testErrorOccurredExample01() {
        Assert.assertEquals(
                "lmmmmmmmmmmm" +
                        "lmmmmmmmmmmm" +
                        "lmmmmmmmmmmm" +
                        "lmmmmmmmmmmm" +
                        "lmmmmmmmmmmm" +
                        "lmmmmmmmmmmm" +
                        "lmmmmmmmmmmm" +
                        "lmmmmmmmmmmm" +
                        "lmmmmmmmmmmm" +
                        "lmmmmmmmmmmm", no0394.decodeString("10[l11[m]]"));
    }

    @Test
    public void testErrorOccurredExample02() {
        Assert.assertEquals("zzzyypqjkjkefjkjkefjkjkefjkjkefyypqjkjkefjkjkefjkjkefjkjkefef", no0394.decodeString("3[z]2[2[y]pq4[2[jk]e1[f]]]ef"));
    }

}
