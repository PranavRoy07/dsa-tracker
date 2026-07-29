package patterns.strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StringBuilderDemoTest {
    private final StringBuilderDemo solution = new StringBuilderDemo();

    @Test
    void concatenatesWordsInOrder() {
        assertEquals("helloworld", solution.fastConcat(new String[]{"hello", "world"}));
    }

    @Test
    void handlesEmptyArray() {
        assertEquals("", solution.fastConcat(new String[]{}));
    }
}
