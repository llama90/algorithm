package com.github.lucaseo90;

import org.junit.Assert;
import org.junit.Test;

public class No0509Test {

    private No0509 no0509 = new No0509();

    @Test
    public void example01() {
        Assert.assertEquals(1, no0509.fib(2));
    }

    @Test
    public void example02() {
        Assert.assertEquals(2, no0509.fib(3));
    }

    @Test
    public void example03() {
        Assert.assertEquals(3, no0509.fib(4));
    }
}
