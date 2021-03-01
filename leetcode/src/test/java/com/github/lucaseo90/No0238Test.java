package com.github.lucaseo90;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class No0238Test {

    private No0238 no0238 = new No0238();

    @Test
    public void example01() {
        Assert.assertEquals("[24, 12, 8, 6]", Arrays.toString(no0238.productExceptSelf(new int[]{1, 2, 3, 4})));

    }


}
