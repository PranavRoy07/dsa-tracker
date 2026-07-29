package patterns.strings;

import java.util.ArrayDeque;
import java.util.Deque;

// Problem: Decode String | Difficulty: Medium | Pattern: Stack | Source: LeetCode #394 | Time: O(n) | Space: O(n)
public class DecodeString {

    // Brute force: repeated string replace on the innermost brackets via regex. Time: O(n^2) worst case, Space: O(n)
    // public String bruteForce(String s) { ... }

    // Optimised: two stacks (counts, partial strings) - push on '[', pop and repeat on ']'.
    public String decodeString(String s) {
        Deque<Integer> countStack = new ArrayDeque<>();
        Deque<StringBuilder> stringStack = new ArrayDeque<>();
        StringBuilder current = new StringBuilder();
        int count = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                count = count * 10 + (c - '0');
            } else if (c == '[') {
                countStack.push(count);
                stringStack.push(current);
                current = new StringBuilder();
                count = 0;
            } else if (c == ']') {
                int repeat = countStack.pop();
                StringBuilder previous = stringStack.pop();
                for (int i = 0; i < repeat; i++) {
                    previous.append(current);
                }
                current = previous;
            } else {
                current.append(c);
            }
        }
        return current.toString();
    }
}
