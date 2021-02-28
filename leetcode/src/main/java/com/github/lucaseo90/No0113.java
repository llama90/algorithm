package com.github.lucaseo90;

import java.util.ArrayList;
import java.util.List;

public class No0113 {
    private List<List<Integer>> paths = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return paths;
        }
        traverse(root, 0, targetSum, new ArrayList<>());
        return paths;
    }

    public void traverse(TreeNode node, int prevSum, int targetSum, List<Integer> path) {
        if (node.left == null && node.right == null) {
            if (node.value + prevSum == targetSum) {
                path.add(node.value);
                List<Integer> list = new ArrayList<>(path);
                paths.add(list);
                path.remove(path.size() - 1);
            }
            return;
        }

        path.add(node.value);
        int currentSum = prevSum + node.value;
        if (node.left != null) {
            traverse(node.left, currentSum, targetSum, path);
        }

        if (node.right != null) {
            traverse(node.right, currentSum, targetSum, path);
        }
        path.remove(path.size() - 1);
    }
}
