package patterns.trees;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SymmetricTreeTest {
    private final SymmetricTree solution = new SymmetricTree();

    @Test
    void recognisesSymmetricTree() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(2, new TreeNode(4), new TreeNode(3)));
        assertTrue(solution.isSymmetric(root));
    }

    @Test
    void recognisesAsymmetricTree() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, null, new TreeNode(3)),
                new TreeNode(2, null, new TreeNode(3)));
        assertFalse(solution.isSymmetric(root));
    }
}
