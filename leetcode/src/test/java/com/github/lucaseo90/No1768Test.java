package com.github.lucaseo90;

import org.junit.Assert;
import org.junit.Test;

public class No1768Test {

    @Test
    public void example01() {
        Assert.assertEquals("apbqcr", No1768.mergeAlternately("abc", "pqr"));
    }

    @Test
    public void example02() {
        Assert.assertEquals("apbqrs", No1768.mergeAlternately("ab", "pqrs"));
    }

    @Test
    public void example03() {
        Assert.assertEquals("apbqcd", No1768.mergeAlternately("abcd", "pq"));
    }

    @Test
    public void customExample01() {
        Assert.assertEquals("abcd", No1768.mergeAlternately("abcd", ""));
    }

    @Test
    public void customExample02() {
        Assert.assertEquals("abcd", No1768.mergeAlternately("", "abcd"));
    }

}
