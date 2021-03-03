package com.github.lucaseo90;

import java.util.LinkedList;
import java.util.List;

public class No0145 {
    private List<Integer> traverseResult = new LinkedList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        postorder(root);
        return traverseResult;
    }

    public void postorder(TreeNode node) {
        if (node == null) {
            return;
        }

        if (node.left != null) {
            postorder(node.left);
        }

        if (node.right != null) {
            postorder(node.right);
        }

        traverseResult.add(node.val);
    }


}
