package patterns.trees;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LevelOrderBFSTest {
    private final LevelOrderBFS solution = new LevelOrderBFS();

    @Test
    void groupsNodesByLevel() {
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        List<List<Integer>> result = solution.levelOrder(root);
        assertEquals(Arrays.asList(
                Arrays.asList(3),
                Arrays.asList(9, 20),
                Arrays.asList(15, 7)
        ), result);
    }

    @Test
    void handlesEmptyTree() {
        assertEquals(0, solution.levelOrder(null).size());
    }
}
