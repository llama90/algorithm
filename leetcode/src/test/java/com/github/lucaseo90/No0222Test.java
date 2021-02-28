package com.github.lucaseo90;

import org.junit.Assert;
import org.junit.Test;

public class No0222Test {

    private No0222 no0222 = new No0222();

    @Test
    public void example01() {
        Assert.assertEquals(6, no0222.countNodes(
                new TreeNode(1,
                        new TreeNode(2,
                                new TreeNode(4),
                                new TreeNode(5)
                        ),
                        new TreeNode(3,
                                new TreeNode(6),
                                null
                        )
                )));
    }

    @Test
    public void example02() {
        Assert.assertEquals(0, no0222.countNodes(null));
    }

    @Test
    public void example03() {
        Assert.assertEquals(1, no0222.countNodes(new TreeNode(1)));
    }
}
