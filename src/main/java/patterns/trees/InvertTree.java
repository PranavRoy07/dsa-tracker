package patterns.trees;

// Problem: Invert Binary Tree | Difficulty: Easy | Pattern: DFS | Source: LeetCode #226 | Time: O(n) | Space: O(h)
public class InvertTree {

    // Brute force: level-order traversal, swapping children with a queue. Time: O(n), Space: O(n)
    // public TreeNode bruteForce(TreeNode root) { ... }

    // Optimised: recursive swap of left/right at every node.
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
