package patterns.arrays;

// Problem: Move Zeroes | Difficulty: Easy | Pattern: Two Pointer | Source: LeetCode #283 | Time: O(n) | Space: O(1)
public class MoveZeroes {

    // Brute force: build a new array of non-zeroes then pad with zeroes. Time: O(n), Space: O(n)
    // public void bruteForce(int[] nums) { ... }

    // Optimised: in-place, slow pointer marks the next slot for a non-zero value.
    public void moveZeroes(int[] nums) {
        int insertPos = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }
}
