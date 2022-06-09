package com.github.lucaseo90.ds.day10.tree;

import com.github.lucaseo90.no0094.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class No0094 {
    private ArrayList<Integer> answer = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return answer;
    }

    public void inorder(TreeNode node) {
        if (node == null) {
            return;
        }

        inorder(node.getLeft());
        answer.add(node.getVal());
        inorder(node.getRight());
    }
}
