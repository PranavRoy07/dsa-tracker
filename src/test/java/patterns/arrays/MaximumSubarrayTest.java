package patterns.arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumSubarrayTest {
    private final MaximumSubarray solution = new MaximumSubarray();

    @Test
    void findsMaxSubarrayInMixedArray() {
        assertEquals(6, solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    @Test
    void handlesAllNegative() {
        assertEquals(-1, solution.maxSubArray(new int[]{-3, -1, -2}));
    }

    @Test
    void handlesSingleElement() {
        assertEquals(5, solution.maxSubArray(new int[]{5}));
    }
}
