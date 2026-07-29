package patterns.strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanToIntegerTest {
    private final RomanToInteger solution = new RomanToInteger();

    @Test
    void convertsSimpleNumeral() {
        assertEquals(3, solution.romanToInt("III"));
    }

    @Test
    void convertsSubtractiveNumeral() {
        assertEquals(58, solution.romanToInt("LVIII"));
    }

    @Test
    void convertsComplexSubtractiveNumeral() {
        assertEquals(1994, solution.romanToInt("MCMXCIV"));
    }
}
