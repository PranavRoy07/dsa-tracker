package patterns.strings;

import java.util.HashMap;
import java.util.Map;

// Problem: Isomorphic Strings | Difficulty: Easy | Pattern: HashMap (bijective mapping) | Source: LeetCode #205 | Time: O(n) | Space: O(1) (bounded alphabet)
public class IsomorphicStrings {

    // Brute force: try building the mapping, then fully re-verify with a second pass over both strings. Time: O(n), Space: O(n) - same order, more scans
    // public boolean bruteForce(String s, String t) { ... }

    // Optimised: two HashMaps enforce a one-to-one char mapping in a single synchronized pass.
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Character> sToT = new HashMap<>();
        Map<Character, Character> tToS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i), b = t.charAt(i);
            if (sToT.containsKey(a) && sToT.get(a) != b) return false;
            if (tToS.containsKey(b) && tToS.get(b) != a) return false;
            sToT.put(a, b);
            tToS.put(b, a);
        }
        return true;
    }
}
