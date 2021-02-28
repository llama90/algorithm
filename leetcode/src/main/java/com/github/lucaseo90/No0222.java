package com.github.lucaseo90;

public class No0222 {
    private int numberOfNodes = 0;

    public int countNodes(TreeNode root) {
        numberOfNodes = 0;
        preOrder(root);
        return numberOfNodes;
    }

    public void preOrder(TreeNode node) {
        if (node == null) {
            return;
        }

        if (node.left != null) {
            preOrder(node.left);
        }
        numberOfNodes++;
        if (node.right != null) {
            preOrder(node.right);
        }
    }

}
