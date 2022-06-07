package com.github.lucaseo90.algo.day04.twopointer;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class No0344Test {
    private No0344 no0344 = new No0344();

    @Test
    public void example01() {
        Assert.assertEquals("[o, l, l, e, h]", Arrays.toString(no0344.reverseString(new char[]{'h', 'e', 'l', 'l', 'o'})));
    }

    @Test
    public void example02() {
        Assert.assertEquals("[h, a, n, n, a, H]", Arrays.toString(no0344.reverseString("Hannah".toCharArray())));
    }
}
