package com.github.lucaseo90;

import org.junit.Assert;
import org.junit.Test;

public class No0331Test {

    private No0331 no0331 = new No0331();

    @Test
    public void example01() {
        Assert.assertEquals(true, no0331.isValidSerialization("9,3,4,#,#,1,#,#,2,#,6,#,#"));
    }

    @Test
    public void example02() {
        Assert.assertEquals(false, no0331.isValidSerialization("1,#"));
    }

    @Test
    public void example03() {
        Assert.assertEquals(false, no0331.isValidSerialization("9,#,#,1"));
    }

}
