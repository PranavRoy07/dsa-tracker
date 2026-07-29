package patterns.arrays;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ThreeSumTest {
    private final ThreeSum solution = new ThreeSum();

    @Test
    void findsAllTripletsSummingToZero() {
        List<List<Integer>> result = solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        assertEquals(2, result.size());
        assertTrue(result.contains(Arrays.asList(-1, -1, 2)));
        assertTrue(result.contains(Arrays.asList(-1, 0, 1)));
    }

    @Test
    void returnsEmptyWhenNoTripletExists() {
        assertTrue(solution.threeSum(new int[]{0, 1, 1}).isEmpty());
    }
}
