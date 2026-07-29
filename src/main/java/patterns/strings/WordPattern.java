package patterns.strings;

import java.util.HashMap;
import java.util.Map;

// Problem: Word Pattern | Difficulty: Easy | Pattern: HashMap (bijective mapping) | Source: LeetCode #290 | Time: O(n) | Space: O(n)
public class WordPattern {

    // Brute force: build the mapping, then re-scan to verify uniqueness. Time: O(n), Space: O(n) - same order, less elegant
    // public boolean bruteForce(String pattern, String s) { ... }

    // Optimised: two HashMaps enforce a one-to-one mapping char <-> word in a single pass.
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;

        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (charToWord.containsKey(c) && !charToWord.get(c).equals(word)) return false;
            if (wordToChar.containsKey(word) && wordToChar.get(word) != c) return false;

            charToWord.put(c, word);
            wordToChar.put(word, c);
        }
        return true;
    }
}
