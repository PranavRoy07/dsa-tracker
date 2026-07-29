package patterns.strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestCommonPrefixTest {
    private final LongestCommonPrefix solution = new LongestCommonPrefix();

    @Test
    void findsCommonPrefix() {
        assertEquals("fl", solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    @Test
    void returnsEmptyWhenNoCommonPrefix() {
        assertEquals("", solution.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }
}
