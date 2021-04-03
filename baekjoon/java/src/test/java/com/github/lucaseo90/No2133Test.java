package com.github.lucaseo90;

import org.junit.Assert;
import org.junit.Test;

public class No2133Test {

    @Test
    public void example01() {
        Assert.assertEquals(1, No2133.fillTiles(0));
        Assert.assertEquals(0, No2133.fillTiles(1));
        Assert.assertEquals(3, No2133.fillTiles(2));
        Assert.assertEquals(11, No2133.fillTiles(4));
        Assert.assertEquals(153, No2133.fillTiles(8));
        Assert.assertEquals(29681, No2133.fillTiles(16));
    }

}
