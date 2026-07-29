package patterns.strings;

import java.util.LinkedHashMap;
import java.util.Map;

// Problem: First Unique Character in a String | Difficulty: Easy | Pattern: HashMap (frequency count) | Source: LeetCode #387 | Time: O(n) | Space: O(1) (bounded alphabet)
public class FirstUniqueChar {

    // Brute force: for each char, scan the whole string to check if it repeats. Time: O(n^2), Space: O(1)
    // public int bruteForce(String s) { ... }

    // Optimised: one pass to count frequencies, second pass to find first count == 1.
    public int firstUniqChar(String s) {
        Map<Character, Integer> counts = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            counts.merge(c, 1, Integer::sum);
        }
        for (int i = 0; i < s.length(); i++) {
            if (counts.get(s.charAt(i)) == 1) return i;
        }
        return -1;
    }
}
