package com.github.lucaseo90;

import org.junit.Assert;
import org.junit.Test;

public class No1679Test {

    private No1679 no1679 = new No1679();

    @Test
    public void example01() {
        Assert.assertEquals(2, no1679.maxOperations(new int[]{1, 2, 3, 4}, 5));
    }

    @Test
    public void example02() {
        Assert.assertEquals(1, no1679.maxOperations(new int[]{3, 1, 3, 4, 3}, 6));
    }

    @Test
    public void wrongAnswerExample01() {
        Assert.assertEquals(2, no1679.maxOperations(new int[]{2, 2, 2, 3, 1, 1, 4, 1}, 4));
    }

    @Test
    public void wrongAnswerExample02() {
        Assert.assertEquals(4, no1679.maxOperations(new int[]{2, 5, 4, 4, 1, 3, 4, 4, 1, 4, 4, 1, 2, 1, 2, 2, 3, 2, 4, 2}, 3));

    }

}
