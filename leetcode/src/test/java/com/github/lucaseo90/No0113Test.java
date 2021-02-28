package com.github.lucaseo90;

import org.junit.Assert;
import org.junit.Test;

public class No0113Test {

    private No0113 no0113 = new No0113();

    @Test
    public void example01() {
        TreeNode tree =
                new TreeNode(
                        5,
                        new TreeNode(
                                4,
                                new TreeNode(11,
                                        new TreeNode(7),
                                        new TreeNode(2)),
                                null),
                        new TreeNode(8,
                                new TreeNode(13),
                                new TreeNode(4,
                                        new TreeNode(5),
                                        new TreeNode(1)))
                );

        Assert.assertEquals("[[5, 4, 11, 2], [5, 8, 4, 5]]", no0113.pathSum(tree, 22).toString());
    }

    @Test
    public void example02() {
        TreeNode tree =
                new TreeNode(
                        1,
                        new TreeNode(2),
                        new TreeNode(3)
                );
        Assert.assertEquals("[]",no0113.pathSum(tree, 5).toString());
    }

    @Test
    public void example03() {
        TreeNode tree =
                new TreeNode(
                        1,
                        new TreeNode(2),
                        null
                );
        Assert.assertEquals("[]", no0113.pathSum(tree, 0).toString());
    }
}
