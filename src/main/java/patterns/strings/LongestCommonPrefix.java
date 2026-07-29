package patterns.strings;

// Problem: Longest Common Prefix | Difficulty: Easy | Pattern: HashMap-adjacent string scanning (vertical comparison) | Source: LeetCode #14 | Time: O(n * m) | Space: O(1)
public class LongestCommonPrefix {

    // Brute force: compare the first string against every other string, char by char, shrinking on mismatch. Time: O(n * m), Space: O(1)
    // public String bruteForce(String[] strs) { ... }

    // Optimised: vertical scan - check column i across all strings before moving to column i + 1.
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (String str : strs) {
                if (i == str.length() || str.charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}
