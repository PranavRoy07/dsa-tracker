package patterns.trees;

// Problem: Validate Binary Search Tree | Difficulty: Medium | Pattern: DFS with bounds | Source: LeetCode #98 | Time: O(n) | Space: O(h)
public class ValidateBST {

    // Brute force: in-order traversal into a list, then check the list is strictly increasing. Time: O(n), Space: O(n)
    // public boolean bruteForce(TreeNode root) { ... }

    // Optimised: DFS carrying a valid (min, max) range down the tree, no extra list.
    public boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }

    private boolean validate(TreeNode node, Long lower, Long upper) {
        if (node == null) return true;
        if (lower != null && node.val <= lower) return false;
        if (upper != null && node.val >= upper) return false;
        return validate(node.left, lower, (long) node.val)
                && validate(node.right, (long) node.val, upper);
    }
}
