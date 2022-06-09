package com.github.lucaseo90.ds.day10.tree;

import com.github.lucaseo90.No0094;
import com.github.lucaseo90.no0094.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class No0094Test {

    private No0094 no0094 = new No0094();

    @Test
    public void example01() {
        TreeNode treeNode = new TreeNode(1,
                null,
                new TreeNode(2,
                        new TreeNode(3,
                                null,
                                null),
                        null));
        Assert.assertEquals("[1, 3, 2]", no0094.inorderTraversal(treeNode).toString());
    }

    @Test
    public void example02() {
        TreeNode treeNode = null;
        Assert.assertEquals("[]", no0094.inorderTraversal(treeNode).toString());
    }

    @Test
    public void example03() {
        TreeNode treeNode = new TreeNode(1,
                null,
                null);
        Assert.assertEquals("[1]", no0094.inorderTraversal(treeNode).toString());
    }
}
