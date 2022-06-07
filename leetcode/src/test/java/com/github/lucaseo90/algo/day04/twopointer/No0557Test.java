package com.github.lucaseo90.algo.day04.twopointer;

import org.junit.Assert;
import org.junit.Test;

public class No0557Test {
    private No0557 no0557 = new No0557();

    @Test
    public void example01() {
        Assert.assertEquals("s'teL ekat edoCteeL tsetnoc", no0557.reverseWords("Let's take LeetCode contest"));
    }

    @Test
    public void example02() {
        Assert.assertEquals("doG gniD", no0557.reverseWords("God Ding"));
    }
}
