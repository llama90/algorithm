package com.github.lucaseo90;

import java.util.*;

public class No0297 {
    private StringBuilder serializedTree = new StringBuilder();

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        buildString(root);
        serializedTree.replace(serializedTree.length() - 1, serializedTree.length(), "");
        return serializedTree.toString();
    }

    public void buildString(TreeNode node) {
        if (node == null) {
            serializedTree.append("null").append(",");
            return;
        }

        serializedTree.append(node.value).append(",");
        buildString(node.left);
        buildString(node.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] split = data.split(",");
        Queue<String> nodes = new LinkedList<>();
        nodes.addAll(Arrays.asList(split));
        TreeNode tree = buildTree(nodes);
        return tree;
    }

    public TreeNode buildTree(Queue<String> nodes) {
        String value = nodes.poll();
        if (value.equals("null")) {
            return null;
        } else {
            TreeNode node = new TreeNode(Integer.parseInt(value));
            node.left = buildTree(nodes);
            node.right = buildTree(nodes);
            return node;
        }
    }

}
