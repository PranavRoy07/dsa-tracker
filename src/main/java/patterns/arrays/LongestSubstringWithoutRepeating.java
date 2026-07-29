package patterns.arrays;

import java.util.HashMap;
import java.util.Map;

// Problem: Longest Substring Without Repeating Characters | Difficulty: Medium | Pattern: Sliding Window | Source: LeetCode #3 | Time: O(n) | Space: O(min(n, charset))
public class LongestSubstringWithoutRepeating {

    // Brute force: check every substring for uniqueness. Time: O(n^3), Space: O(min(n, charset))
    // public int bruteForce(String s) { ... }

    // Optimised: sliding window, jump the left edge past the last duplicate.
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> lastSeen = new HashMap<>();
        int left = 0, best = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (lastSeen.containsKey(c) && lastSeen.get(c) >= left) {
                left = lastSeen.get(c) + 1;
            }
            lastSeen.put(c, right);
            best = Math.max(best, right - left + 1);
        }
        return best;
    }
}
