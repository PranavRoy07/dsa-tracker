package patterns.arrays;

import java.util.HashMap;
import java.util.Map;

// Problem: Two Sum | Difficulty: Easy | Pattern: HashMap | Source: LeetCode #1 | Time: O(n) | Space: O(n)
public class TwoSum {

    // Brute force: check every pair. Time: O(n^2), Space: O(1)
    // public int[] bruteForce(int[] nums, int target) {
    //     for (int i = 0; i < nums.length; i++) {
    //         for (int j = i + 1; j < nums.length; j++) {
    //             if (nums[i] + nums[j] == target) return new int[]{i, j};
    //         }
    //     }
    //     throw new IllegalArgumentException("No two sum solution");
    // }

    // Optimised: one pass, store complement -> index in a map.
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (seen.containsKey(complement)) {
                return new int[]{seen.get(complement), i};
            }
            seen.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
