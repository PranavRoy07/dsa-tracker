package patterns.arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MoveZeroesTest {
    private final MoveZeroes solution = new MoveZeroes();

    @Test
    void movesZeroesToEndPreservingOrder() {
        int[] nums = {0, 1, 0, 3, 12};
        solution.moveZeroes(nums);
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);
    }

    @Test
    void handlesArrayWithNoZeroes() {
        int[] nums = {1, 2, 3};
        solution.moveZeroes(nums);
        assertArrayEquals(new int[]{1, 2, 3}, nums);
    }
}
