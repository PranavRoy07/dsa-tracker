package patterns.arrays;

// Problem: Container With Most Water | Difficulty: Medium | Pattern: Two Pointer | Source: LeetCode #11 | Time: O(n) | Space: O(1)
public class ContainerWithMostWater {

    // Brute force: check every pair of lines. Time: O(n^2), Space: O(1)
    // public int bruteForce(int[] height) { ... }

    // Optimised: two pointers from the outside in, always move the shorter wall.
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int best = 0;
        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            best = Math.max(best, area);
            if (height[left] < height[right]) left++;
            else right--;
        }
        return best;
    }
}
