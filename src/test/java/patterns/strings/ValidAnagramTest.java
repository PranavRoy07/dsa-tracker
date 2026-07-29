package patterns.strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidAnagramTest {
    private final ValidAnagram solution = new ValidAnagram();

    @Test
    void recognisesAnagram() {
        assertTrue(solution.isAnagram("anagram", "nagaram"));
    }

    @Test
    void rejectsNonAnagram() {
        assertFalse(solution.isAnagram("rat", "car"));
    }

    @Test
    void rejectsDifferentLengths() {
        assertFalse(solution.isAnagram("ab", "abc"));
    }
}
