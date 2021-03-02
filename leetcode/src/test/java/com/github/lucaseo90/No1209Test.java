package com.github.lucaseo90;

import org.junit.Assert;
import org.junit.Test;

public class No1209Test {

    private No1209 no1209 = new No1209();

    @Test
    public void example01() {
        Assert.assertEquals("abcd", no1209.removeDuplicates("abcd", 2));
    }

    @Test
    public void example02() {
        Assert.assertEquals("aa", no1209.removeDuplicates("deeedbbcccbdaa", 3));
    }


    @Test
    public void example03() {
        Assert.assertEquals("ps", no1209.removeDuplicates("pbbcggttciiippooaais", 2));
    }

}
