package patterns.arrays;

// Problem: Product of Array Except Self | Difficulty: Medium | Pattern: Prefix/Suffix Product | Source: LeetCode #238 | Time: O(n) | Space: O(1) extra (excluding output)
public class ProductExceptSelf {

    // Brute force: for each index, multiply every other element. Time: O(n^2), Space: O(1)
    // public int[] bruteForce(int[] nums) { ... }

    // Optimised: prefix products going left to right, then fold in suffix products right to left.
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1]; // prefix product
        }
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffix;
            suffix *= nums[i];
        }
        return result;
    }
}
