package patterns.arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TrappingRainWaterTest {
    private final TrappingRainWater solution = new TrappingRainWater();

    @Test
    void trapsWaterInClassicCase() {
        assertEquals(6, solution.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

    @Test
    void returnsZeroForFlatSurface() {
        assertEquals(0, solution.trap(new int[]{1, 1, 1, 1}));
    }

    @Test
    void returnsZeroForEmptyInput() {
        assertEquals(0, solution.trap(new int[]{}));
    }
}
