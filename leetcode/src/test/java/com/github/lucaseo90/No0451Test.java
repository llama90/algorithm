package com.github.lucaseo90;

import org.junit.Assert;
import org.junit.Test;

public class No0451Test {

    private No0451 no0451 = new No0451();

    @Test
    public void example01() {
        Assert.assertEquals("eert", no0451.frequencySort("tree"));
    }

    @Test
    public void example02() {
        Assert.assertEquals("aaaccc", no0451.frequencySort("cccaaa"));
    }

    @Test
    public void example03() {
        Assert.assertEquals("bbAa", no0451.frequencySort("Aabb"));
    }

    @Test
    public void wrongAnswerExample01() {
        Assert.assertEquals("eeeeaaarrd", no0451.frequencySort("eeeedrraaa"));
    }
}
