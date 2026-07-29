package patterns.strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WordPatternTest {
    private final WordPattern solution = new WordPattern();

    @Test
    void matchesConsistentPattern() {
        assertTrue(solution.wordPattern("abba", "dog cat cat dog"));
    }

    @Test
    void rejectsInconsistentMapping() {
        assertFalse(solution.wordPattern("abba", "dog cat cat fish"));
    }

    @Test
    void rejectsWhenTwoLettersMapToSameWord() {
        assertFalse(solution.wordPattern("aaaa", "dog cat cat dog"));
    }
}
