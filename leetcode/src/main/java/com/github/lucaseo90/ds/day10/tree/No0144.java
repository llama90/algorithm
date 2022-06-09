package com.github.lucaseo90.ds.day10.tree;

import com.github.lucaseo90.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class No0144 {

    private List<Integer> nodes = new LinkedList<Integer>();

    public List<Integer> preorderTraversal(TreeNode root) {
        preorder(root);
        return nodes;
    }

    public void preorder(TreeNode node) {
        if(node == null) {
            return;
        }

        nodes.add(node.val);
        if(node.left != null) {
            preorderTraversal(node.left);
        }

        if(node.right != null) {
            preorderTraversal(node.right);
        }
    }

}
