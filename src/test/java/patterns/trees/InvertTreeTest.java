package patterns.trees;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class InvertTreeTest {
    private final InvertTree solution = new InvertTree();

    @Test
    void swapsChildrenAtEveryLevel() {
        TreeNode root = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(7, new TreeNode(6), new TreeNode(9)));
        TreeNode inverted = solution.invertTree(root);
        assertEquals(7, inverted.left.val);
        assertEquals(2, inverted.right.val);
        assertEquals(9, inverted.left.left.val);
        assertEquals(6, inverted.left.right.val);
    }

    @Test
    void handlesEmptyTree() {
        assertNull(solution.invertTree(null));
    }
}
