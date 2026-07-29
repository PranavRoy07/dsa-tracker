package patterns.trees;

// Problem: Lowest Common Ancestor of a BST | Difficulty: Medium | Pattern: BST Property Traversal | Source: LeetCode #235 | Time: O(h) | Space: O(1)
public class LCAofBST {

    // Brute force: find root-to-node paths for both nodes, compare. Time: O(h), Space: O(h)
    // public TreeNode bruteForce(TreeNode root, TreeNode p, TreeNode q) { ... }

    // Optimised: use BST ordering - walk down, branch only when p and q diverge.
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode current = root;
        while (current != null) {
            if (p.val < current.val && q.val < current.val) {
                current = current.left;
            } else if (p.val > current.val && q.val > current.val) {
                current = current.right;
            } else {
                return current;
            }
        }
        return null;
    }
}
