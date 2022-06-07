package com.github.lucaseo90.ds.day09.stackNqueue;

import org.junit.Assert;
import org.junit.Test;

public class No0232Test {

    private No0232 no0232 = new No0232();

    @Test
    public void example01() {
        no0232.push(1);
        no0232.push(2);
        Assert.assertEquals(1, no0232.peek());
        Assert.assertEquals(1, no0232.pop());
        Assert.assertEquals(false, no0232.empty());
    }

}
