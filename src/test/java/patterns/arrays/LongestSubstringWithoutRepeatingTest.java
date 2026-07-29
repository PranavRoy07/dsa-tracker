package patterns.arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubstringWithoutRepeatingTest {
    private final LongestSubstringWithoutRepeating solution = new LongestSubstringWithoutRepeating();

    @Test
    void findsLongestUniqueSubstring() {
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    void handlesAllSameCharacter() {
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    void handlesEmptyString() {
        assertEquals(0, solution.lengthOfLongestSubstring(""));
    }
}
