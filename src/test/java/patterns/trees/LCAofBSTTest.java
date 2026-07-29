package patterns.trees;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LCAofBSTTest {
    private final LCAofBST solution = new LCAofBST();

    // Tree:        6
    //           2     8
    //         0  4  7  9
    //           3  5
    private TreeNode buildTree() {
        TreeNode n0 = new TreeNode(0);
        TreeNode n3 = new TreeNode(3);
        TreeNode n5 = new TreeNode(5);
        TreeNode n4 = new TreeNode(4, n3, n5);
        TreeNode n2 = new TreeNode(2, n0, n4);
        TreeNode n7 = new TreeNode(7);
        TreeNode n9 = new TreeNode(9);
        TreeNode n8 = new TreeNode(8, n7, n9);
        return new TreeNode(6, n2, n8);
    }

    @Test
    void findsAncestorAcrossSubtrees() {
        TreeNode root = buildTree();
        TreeNode p = root.left;        // 2
        TreeNode q = root.right;       // 8
        assertEquals(6, solution.lowestCommonAncestor(root, p, q).val);
    }

    @Test
    void findsAncestorWithinSameSubtree() {
        TreeNode root = buildTree();
        TreeNode p = root.left;              // 2
        TreeNode q = root.left.right.left;   // 3
        assertEquals(2, solution.lowestCommonAncestor(root, p, q).val);
    }
}
