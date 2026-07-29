package patterns.trees;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DiameterOfBinaryTreeTest {
    private final DiameterOfBinaryTree solution = new DiameterOfBinaryTree();

    @Test
    void computesDiameterThroughRoot() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3));
        assertEquals(3, solution.diameterOfBinaryTree(root));
    }

    @Test
    void handlesSingleNode() {
        assertEquals(0, solution.diameterOfBinaryTree(new TreeNode(1)));
    }
}
