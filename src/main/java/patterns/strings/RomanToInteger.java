package patterns.strings;

import java.util.HashMap;
import java.util.Map;

// Problem: Roman to Integer | Difficulty: Easy | Pattern: HashMap (lookup table) | Source: LeetCode #13 | Time: O(n) | Space: O(1)
public class RomanToInteger {

    private static final Map<Character, Integer> VALUES = new HashMap<>();
    static {
        VALUES.put('I', 1);
        VALUES.put('V', 5);
        VALUES.put('X', 10);
        VALUES.put('L', 50);
        VALUES.put('C', 100);
        VALUES.put('D', 500);
        VALUES.put('M', 1000);
    }

    // Brute force: match known two-character subtractive pairs first, then singles. Time: O(n), Space: O(1) - messier branching
    // public int bruteForce(String s) { ... }

    // Optimised: walk left to right, subtract instead of add when a smaller value precedes a larger one.
    public int romanToInt(String s) {
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            int value = VALUES.get(s.charAt(i));
            if (i + 1 < s.length() && value < VALUES.get(s.charAt(i + 1))) {
                total -= value;
            } else {
                total += value;
            }
        }
        return total;
    }
}
