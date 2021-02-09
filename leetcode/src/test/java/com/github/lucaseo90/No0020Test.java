package com.github.lucaseo90;

import org.junit.Assert;
import org.junit.Test;

public class No0020Test {

    No0020 no0020 = new No0020();

    @Test
    public void example01() {
        Assert.assertEquals(true, no0020.isValid("()"));
    }

    @Test
    public void example02() {
        Assert.assertEquals(true, no0020.isValid("()[]{}"));
    }

    @Test
    public void example03() {
        Assert.assertEquals(false, no0020.isValid("(]"));
    }

    @Test
    public void example04() {
        Assert.assertEquals(false, no0020.isValid("([)]"));
    }

    @Test
    public void example05() {
        Assert.assertEquals(true, no0020.isValid("{[]}"));
    }

    @Test
    public void customExample01() {
        Assert.assertEquals(false, no0020.isValid("}"));
    }

    @Test
    public void testErrorOccurredExample01() {
        Assert.assertEquals(false, no0020.isValid("["));
    }

}
