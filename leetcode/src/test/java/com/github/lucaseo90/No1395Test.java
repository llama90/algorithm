package com.github.lucaseo90;

import org.junit.Assert;
import org.junit.Test;

public class No1395Test {

    private No1395 no1395 = new No1395();

    @Test
    public void example01() {
        Assert.assertEquals(3, no1395.numTeams(new int[]{2, 5, 3, 4, 1}));
    }

    @Test
    public void example02() {
        Assert.assertEquals(0, no1395.numTeams(new int[]{2, 1, 3}));
    }

    @Test
    public void example03() {
        Assert.assertEquals(4, no1395.numTeams(new int[]{1, 2, 3, 4}));
    }

}
