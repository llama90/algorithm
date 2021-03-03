package com.github.lucaseo90;

public class No0104 {
    private int maximumDepth = 0;

    public int maxDepth(TreeNode root) {
        traverse(root, 1);
        return maximumDepth;
    }

    public void traverse(TreeNode root, int currDepth) {
        if (root == null) {
            return;
        }

        if (root.left != null) {
            traverse(root.left, currDepth + 1);
        }

        if (maximumDepth < currDepth) {
            maximumDepth = currDepth;
        }

        if (root.right != null) {
            traverse(root.right, currDepth + 1);
        }
    }
}
