package com.github.lucaseo90.ds.day10.tree;

import com.github.lucaseo90.No0144;
import com.github.lucaseo90.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class No0144Test {

    private No0144 no0144 = new No0144();

    @Test
    public void example01() {
        TreeNode tree =
                new TreeNode(
                        1,
                        null,
                        new TreeNode(2,
                                new TreeNode(3),
                                null)
                );
        Assert.assertEquals("[1, 2, 3]", no0144.preorderTraversal(tree).toString());
    }

    @Test
    public void example02() {
        Assert.assertEquals("[]", no0144.preorderTraversal(null).toString());
    }

    @Test
    public void example03() {
        Assert.assertEquals("[1]", no0144.preorderTraversal(new TreeNode(1)).toString());
    }

    @Test
    public void example04() {
        TreeNode tree =
                new TreeNode(
                        1,
                        new TreeNode(2),
                        null
                );
        Assert.assertEquals("[1, 2]", no0144.preorderTraversal(tree).toString());
    }

    @Test
    public void example05() {
        TreeNode tree =
                new TreeNode(
                        1,
                        null,
                        new TreeNode(2)
                );
        Assert.assertEquals("[1, 2]", no0144.preorderTraversal(tree).toString());
    }
}
