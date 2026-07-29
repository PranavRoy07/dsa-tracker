package patterns.strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstUniqueCharTest {
    private final FirstUniqueChar solution = new FirstUniqueChar();

    @Test
    void findsFirstUniqueIndex() {
        assertEquals(0, solution.firstUniqChar("leetcode"));
    }

    @Test
    void findsLaterUniqueIndex() {
        assertEquals(2, solution.firstUniqChar("loveleetcode"));
    }

    @Test
    void returnsNegativeOneWhenNoneUnique() {
        assertEquals(-1, solution.firstUniqChar("aabb"));
    }
}
