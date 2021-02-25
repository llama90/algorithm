package trees;

public class HeightBinaryTree {

    /*
    class Node
        int data;
        Node left;
        Node right;
    */
    private static int height = 0;

    public static int height(Node root) {
        // Write your code here.
        height = 0;
        getHeight(root, 0);
        return height;
    }

    public static void getHeight(Node root, int prevHeight) {
        if (root == null) {
            return;
        }

        if (height < prevHeight) {
            height = prevHeight;
        }

        if (root.left != null) {
            getHeight(root.left, prevHeight + 1);
        }
        if (root.right != null) {
            getHeight(root.right, prevHeight + 1);
        }
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
}
