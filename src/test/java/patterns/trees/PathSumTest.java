package patterns.trees;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PathSumTest {
    private final PathSum solution = new PathSum();

    @Test
    void findsQualifyingRootToLeafPath() {
        TreeNode root = new TreeNode(5,
                new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null),
                new TreeNode(8, new TreeNode(13), new TreeNode(4, null, new TreeNode(1))));
        assertTrue(solution.hasPathSum(root, 22));
    }

    @Test
    void returnsFalseWhenNoPathMatches() {
        TreeNode root = new TreeNode(1, new TreeNode(2), null);
        assertFalse(solution.hasPathSum(root, 5));
    }

    @Test
    void returnsFalseForEmptyTree() {
        assertFalse(solution.hasPathSum(null, 0));
    }
}
