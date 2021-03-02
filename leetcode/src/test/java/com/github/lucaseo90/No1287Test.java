package com.github.lucaseo90;

import org.junit.Assert;
import org.junit.Test;

public class No1287Test {

    private No1287 no1287 = new No1287();

    @Test
    public void example01() {
        Assert.assertEquals(6, no1287.findSpecialInteger(new int[]{1, 2, 2, 6, 6, 6, 6, 7, 10}));
    }

}
