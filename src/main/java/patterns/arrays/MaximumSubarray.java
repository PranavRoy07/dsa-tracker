package patterns.arrays;

// Problem: Maximum Subarray | Difficulty: Medium | Pattern: Kadane's (DP variant) | Source: LeetCode #53 | Time: O(n) | Space: O(1)
public class MaximumSubarray {

    // Brute force: sum every subarray. Time: O(n^2), Space: O(1)
    // public int bruteForce(int[] nums) {
    //     int best = Integer.MIN_VALUE;
    //     for (int i = 0; i < nums.length; i++) {
    //         int sum = 0;
    //         for (int j = i; j < nums.length; j++) {
    //             sum += nums[j];
    //             best = Math.max(best, sum);
    //         }
    //     }
    //     return best;
    // }

    // Optimised: Kadane's algorithm - extend or restart the running sum.
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int best = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            best = Math.max(best, currentSum);
        }
        return best;
    }
}
