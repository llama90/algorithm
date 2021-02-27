package com.github.lucaseo90;

import org.junit.Assert;
import org.junit.Test;

public class No1598Test {

    @Test
    public void example01() {
        Assert.assertEquals(2, No1598.minOperations(new String[]{"d1/", "d2/", "../", "d21/", "./"}));
    }

    @Test
    public void example02() {
        Assert.assertEquals(3, No1598.minOperations(new String[]{"d1/", "d2/", "./", "d3/", "../", "d31/"}));
    }

    @Test
    public void example03() {
        Assert.assertEquals(0, No1598.minOperations(new String[]{"d1/", "../", "../", "../"}));
    }
}
