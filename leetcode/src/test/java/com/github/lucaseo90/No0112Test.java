package com.github.lucaseo90;

import org.junit.Assert;
import org.junit.Test;

public class No0112Test {

    private No0112 no0112 = new No0112();

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
                                        null,
                                        new TreeNode(1)))
                );

        Assert.assertTrue(no0112.hasPathSum(tree, 22));
    }

    @Test
    public void example02() {
        TreeNode tree =
                new TreeNode(
                        1,
                        new TreeNode(2),
                        new TreeNode(3)
                );
        Assert.assertFalse(no0112.hasPathSum(tree, 5));
    }

    /**
     * if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum
     * A left is a node with no children
     */
    @Test
    public void wrongAnswerExample01() {
        TreeNode tree =
                new TreeNode(
                        1,
                        new TreeNode(
                                2),
                        null
                );
        Assert.assertFalse(no0112.hasPathSum(tree, 1));
    }

    @Test
    public void wrongAnswerExample02() {
        TreeNode tree = null;
        Assert.assertFalse(no0112.hasPathSum(tree, 1));
    }
}
