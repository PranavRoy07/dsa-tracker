package patterns.strings;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GroupAnagramsTest {
    private final GroupAnagrams solution = new GroupAnagrams();

    @Test
    void groupsAnagramsTogether() {
        List<List<String>> result = solution.groupAnagrams(
                new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        assertEquals(3, result.size());
        assertTrue(result.stream().anyMatch(g -> g.containsAll(Arrays.asList("eat", "tea", "ate")) && g.size() == 3));
        assertTrue(result.stream().anyMatch(g -> g.containsAll(Arrays.asList("tan", "nat")) && g.size() == 2));
        assertTrue(result.stream().anyMatch(g -> g.contains("bat") && g.size() == 1));
    }
}
