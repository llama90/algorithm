package com.github.lucaseo90;

import java.util.LinkedList;
import java.util.Queue;

public class No0111 {
    public int minDepth(TreeNode root) {
        Queue<Pair> queue = new LinkedList<>();
        if (root != null) {
            queue.add(new Pair(root, 1));
            while (!queue.isEmpty()) {
                Pair pair = queue.poll();
                TreeNode node = pair.treeNode;
                if (node.left == null && node.right == null) {
                    return pair.depth;
                }

                if (node.left != null) {
                    queue.add(new Pair(node.left, pair.depth + 1));
                }

                if (node.right != null) {
                    queue.add(new Pair(node.right, pair.depth + 1));
                }
            }
        }
        return 0;
    }

    public class Pair {
        TreeNode treeNode;
        int depth;

        public Pair(TreeNode treeNode, int depth) {
            this.treeNode = treeNode;
            this.depth = depth;
        }
    }
}
