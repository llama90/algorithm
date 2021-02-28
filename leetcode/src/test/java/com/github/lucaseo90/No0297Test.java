package com.github.lucaseo90;

import org.junit.Assert;
import org.junit.Test;

public class No0297Test {

    private No0297 no0297 = new No0297();

    @Test
    public void example01() {
        no0297.serialize(
                new TreeNode(1,
                        new TreeNode(2),
                        new TreeNode(3,
                                new TreeNode(4),
                                new TreeNode(5))));
    }

    @Test
    public void customExample01() {
        TreeNode example =
                new TreeNode(1,
                        new TreeNode(2,
                                new TreeNode(3)
                                , null),
                        new TreeNode(4,
                                new TreeNode(5),
                                new TreeNode(6)));

        String string = no0297.serialize(example);
        TreeNode tree = no0297.deserialize(string);
        Assert.assertEquals(example.toString(), tree.toString());
    }

}
