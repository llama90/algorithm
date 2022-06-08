package com.github.lucaseo90.easy;

import org.junit.Assert;
import org.junit.Test;

public class No0819Test {

    private final No0819 no0819 = new No0819();

    @Test
    public void example01() {
        Assert.assertEquals("ball", no0819.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"hit"}));
    }

    @Test
    public void example02() {
        Assert.assertEquals("a", no0819.mostCommonWord("a.", new String[]{}));
    }

    @Test
    public void exampleWrongCase01() {
        Assert.assertEquals("ball", no0819.mostCommonWord("Bob. hIt, baLl", new String[]{"bob", "hit"}));
    }

}
