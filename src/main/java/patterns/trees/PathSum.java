package patterns.trees;

// Problem: Path Sum | Difficulty: Easy | Pattern: DFS | Source: LeetCode #112 | Time: O(n) | Space: O(h)
public class PathSum {

    // Brute force: collect every root-to-leaf path sum into a list, then check membership. Time: O(n), Space: O(n)
    // public boolean bruteForce(TreeNode root, int targetSum) { ... }

    // Optimised: DFS subtracting the current value from the remaining target as we descend.
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }
        int remaining = targetSum - root.val;
        return hasPathSum(root.left, remaining) || hasPathSum(root.right, remaining);
    }
}
