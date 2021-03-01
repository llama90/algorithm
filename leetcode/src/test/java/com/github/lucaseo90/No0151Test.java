package com.github.lucaseo90;

import org.junit.Assert;
import org.junit.Test;

public class No0151Test {

    private No0151 no0151 = new No0151();

    @Test
    public void example01() {
        Assert.assertEquals("blue is sky the", no0151.reverseWords("the sky is blue"));
    }

    @Test
    public void example02() {
        Assert.assertEquals("world hello", no0151.reverseWords("  hello world  "));
    }

    @Test
    public void example03() {
        Assert.assertEquals("example good a", no0151.reverseWords("a good   example"));
    }

    @Test
    public void example04() {
        Assert.assertEquals("Alice Loves Bob", no0151.reverseWords("  Bob    Loves  Alice   "));
    }

    @Test
    public void example05() {
        Assert.assertEquals("bob like even not does Alice", no0151.reverseWords("Alice does not even like bob"));
    }

    @Test
    public void customExample01() {
        Assert.assertEquals("blue is sky the", no0151.reverseWords("        the            sky             is            blue"));
    }

    @Test
    public void customExample02() {
        Assert.assertEquals("blue is sky the", no0151.reverseWords("        the            sky             is            blue"));
    }

    @Test
    public void customExample03() {
        Assert.assertEquals("blue is sky the", no0151.reverseWords("        the            sky             is            blue            "));
    }
}
