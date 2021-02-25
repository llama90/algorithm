package trees;

import org.junit.Assert;
import org.junit.Test;

public class HeightBinaryTreeTest {

    @Test
    public void example01() {
        int[] values = new int[]{3, 5, 2, 1, 4, 6, 7};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = HeightBinaryTree.insert(root, values[i]);
        }
        Assert.assertEquals(3, HeightBinaryTree.height(root));
    }

    @Test
    public void example02() {
        int[] values = new int[]{15};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = HeightBinaryTree.insert(root, values[i]);
        }
        Assert.assertEquals(0, HeightBinaryTree.height(root));
    }

    @Test
    public void example03() {
        int[] values = new int[]{3, 1, 7, 5, 4};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = HeightBinaryTree.insert(root, values[i]);
        }
        Assert.assertEquals(3, HeightBinaryTree.height(root));
    }
}
