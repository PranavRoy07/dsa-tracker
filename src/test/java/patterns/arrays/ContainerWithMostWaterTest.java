package patterns.arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ContainerWithMostWaterTest {
    private final ContainerWithMostWater solution = new ContainerWithMostWater();

    @Test
    void findsMaxAreaClassicCase() {
        assertEquals(49, solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    @Test
    void handlesTwoElements() {
        assertEquals(1, solution.maxArea(new int[]{1, 1}));
    }
}
