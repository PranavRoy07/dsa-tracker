package patterns.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Problem: Group Anagrams | Difficulty: Medium | Pattern: HashMap (canonical key) | Source: LeetCode #49 | Time: O(n * k log k) | Space: O(n * k)
public class GroupAnagrams {

    // Brute force: compare every string against every group with a sort-based check. Time: O(n^2 * k log k), Space: O(n * k)
    // public List<List<String>> bruteForce(String[] strs) { ... }

    // Optimised: use the sorted string as a HashMap key so anagrams collide into the same bucket.
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            groups.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(groups.values());
    }
}
