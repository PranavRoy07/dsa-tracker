package patterns.trees;

// Problem: Symmetric Tree | Difficulty: Easy | Pattern: DFS (mirrored recursion) | Source: LeetCode #101 | Time: O(n) | Space: O(h)
public class SymmetricTree {

    // Brute force: serialize left and mirrored-right subtrees to strings, compare. Time: O(n), Space: O(n)
    // public boolean bruteForce(TreeNode root) { ... }

    // Optimised: recursively compare left/right pair as mirror images.
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode a, TreeNode b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        return a.val == b.val
                && isMirror(a.left, b.right)
                && isMirror(a.right, b.left);
    }
}
