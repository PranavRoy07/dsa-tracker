package patterns.trees;

// Problem: Diameter of Binary Tree | Difficulty: Easy | Pattern: DFS (post-order accumulation) | Source: LeetCode #543 | Time: O(n) | Space: O(h)
public class DiameterOfBinaryTree {

    private int diameter = 0;

    // Brute force: for every node compute height(left) + height(right), track max. Time: O(n^2), Space: O(h)
    // public int bruteForce(TreeNode root) { ... }

    // Optimised: single post-order pass, update diameter while returning height.
    public int diameterOfBinaryTree(TreeNode root) {
        diameter = 0;
        height(root);
        return diameter;
    }

    private int height(TreeNode node) {
        if (node == null) return 0;
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        diameter = Math.max(diameter, leftHeight + rightHeight);
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
