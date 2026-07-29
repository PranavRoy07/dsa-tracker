package patterns.strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DecodeStringTest {
    private final DecodeString solution = new DecodeString();

    @Test
    void decodesSimplePattern() {
        assertEquals("aaabcbc", solution.decodeString("3[a]2[bc]"));
    }

    @Test
    void decodesNestedPattern() {
        assertEquals("accaccacc", solution.decodeString("3[a2[c]]"));
    }

    @Test
    void decodesMultipleGroups() {
        assertEquals("abcabccdcdcdef", solution.decodeString("2[abc]3[cd]ef"));
    }
}
