package com.github.lucaseo90;

public class No0112 {
    private boolean hasPathSum = false;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return hasPathSum;
        }
        traverse(root, 0, targetSum);
        return hasPathSum;
    }

    public void traverse(TreeNode node, int prevSum, int targetSum) {
        if (node.left == null && node.right == null) {
            if (node.val + prevSum == targetSum) {
                hasPathSum = true;
            }
            return;
        }

        int currentSum = prevSum + node.val;
        if (!hasPathSum) {
            if (node.left != null) {
                traverse(node.left, currentSum, targetSum);
            }
            if (node.right != null) {
                traverse(node.right, currentSum, targetSum);
            }
        }
    }
}
