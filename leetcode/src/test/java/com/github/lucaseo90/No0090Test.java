package com.github.lucaseo90;

import org.junit.Assert;
import org.junit.Test;

public class No0090Test {

    private No0090 no0090 = new No0090();

    @Test
    public void example01() {
        Assert.assertEquals("[[1], [1, 2, 2], [], [2], [2, 2], [1, 2]]", no0090.subsetsWithDup(new int[]{1, 2, 2}).toString());
    }

    @Test
    public void example02() {
        Assert.assertEquals("[[1], [1, 2, 2], [], [2], [2, 2], [1, 2]]", no0090.subsetsWithDup(new int[]{1, 2, 2}).toString());
    }

    @Test
    public void wrongAnswerExample01() {
        Assert.assertEquals("[[1], [1, 4, 4], [], [4, 4], [4], [4, 4, 4], [1, 4], [1, 4, 4, 4, 4], [1, 4, 4, 4], [4, 4, 4, 4]]", no0090.subsetsWithDup(new int[]{4, 4, 4, 1, 4}).toString());
    }

}
