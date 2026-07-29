package patterns.strings;

// Problem: Valid Anagram | Difficulty: Easy | Pattern: HashMap (frequency count) | Source: LeetCode #242 | Time: O(n) | Space: O(1) (bounded alphabet)
public class ValidAnagram {

    // Brute force: sort both strings and compare. Time: O(n log n), Space: O(n)
    // public boolean bruteForce(String s, String t) { ... }

    // Optimised: one frequency array over the alphabet, single pass increments/decrements.
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }
        for (int count : counts) {
            if (count != 0) return false;
        }
        return true;
    }
}
