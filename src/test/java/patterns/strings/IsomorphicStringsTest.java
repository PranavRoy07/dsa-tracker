package patterns.strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IsomorphicStringsTest {
    private final IsomorphicStrings solution = new IsomorphicStrings();

    @Test
    void recognisesIsomorphicStrings() {
        assertTrue(solution.isIsomorphic("egg", "add"));
    }

    @Test
    void rejectsNonIsomorphicStrings() {
        assertFalse(solution.isIsomorphic("foo", "bar"));
    }

    @Test
    void enforcesOneToOneMapping() {
        assertFalse(solution.isIsomorphic("badc", "baba"));
    }
}
