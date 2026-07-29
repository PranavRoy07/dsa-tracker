package patterns.arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumWindowSubstringTest {
    private final MinimumWindowSubstring solution = new MinimumWindowSubstring();

    @Test
    void findsMinimumWindowClassicCase() {
        assertEquals("BANC", solution.minWindow("ADOBECODEBANC", "ABC"));
    }

    @Test
    void returnsEmptyWhenNoWindowExists() {
        assertEquals("", solution.minWindow("a", "aa"));
    }
}
