package patterns.strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestPalindromicSubstringTest {
    private final LongestPalindromicSubstring solution = new LongestPalindromicSubstring();

    @Test
    void findsOddLengthPalindrome() {
        String result = solution.longestPalindrome("babad");
        assertEquals(true, result.equals("bab") || result.equals("aba"));
    }

    @Test
    void findsEvenLengthPalindrome() {
        assertEquals("bb", solution.longestPalindrome("cbbd"));
    }

    @Test
    void handlesSingleCharacter() {
        assertEquals("a", solution.longestPalindrome("a"));
    }
}
