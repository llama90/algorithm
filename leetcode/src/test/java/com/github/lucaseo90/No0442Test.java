package com.github.lucaseo90;

import org.junit.Assert;
import org.junit.Test;

public class No0442Test {

    private No0442 no0442 = new No0442();

    @Test
    public void example01() {
        Assert.assertEquals("[2, 3]", no0442.findDuplicates(new int[]{4, 3, 2, 7, 8, 2, 3, 1}).toString());
    }

}
