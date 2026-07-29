package patterns.arrays;

// Problem: Trapping Rain Water | Difficulty: Hard | Pattern: Two Pointer | Source: LeetCode #42 | Time: O(n) | Space: O(1)
public class TrappingRainWater {

    // Brute force: for each bar, scan left and right for max walls. Time: O(n^2), Space: O(1)
    // public int bruteForce(int[] height) {
    //     int total = 0;
    //     for (int i = 0; i < height.length; i++) {
    //         int leftMax = 0, rightMax = 0;
    //         for (int l = 0; l <= i; l++) leftMax = Math.max(leftMax, height[l]);
    //         for (int r = i; r < height.length; r++) rightMax = Math.max(rightMax, height[r]);
    //         total += Math.min(leftMax, rightMax) - height[i];
    //     }
    //     return total;
    // }

    // Optimised: two pointers closing in, tracking left/right max as we go.
    public int trap(int[] height) {
        if (height.length == 0) return 0;
        int left = 0, right = height.length - 1;
        int leftMax = height[left], rightMax = height[right];
        int total = 0;
        while (left < right) {
            if (leftMax < rightMax) {
                left++;
                leftMax = Math.max(leftMax, height[left]);
                total += leftMax - height[left];
            } else {
                right--;
                rightMax = Math.max(rightMax, height[right]);
                total += rightMax - height[right];
            }
        }
        return total;
    }
}
