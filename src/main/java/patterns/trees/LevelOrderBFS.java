package patterns.trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

// Problem: Binary Tree Level Order Traversal | Difficulty: Medium | Pattern: BFS | Source: LeetCode #102 | Time: O(n) | Space: O(n)
public class LevelOrderBFS {

    // Brute force: recursive DFS while tracking depth to bucket nodes. Time: O(n), Space: O(n)
    // public List<List<Integer>> bruteForce(TreeNode root) { ... }

    // Optimised: iterative BFS with a queue, processing one full level at a time.
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            result.add(level);
        }
        return result;
    }
}
