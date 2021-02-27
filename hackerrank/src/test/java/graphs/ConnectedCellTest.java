package graphs;

import org.junit.Assert;
import org.junit.Test;

public class ConnectedCellTest {

    @Test
    public void example01() {
        Assert.assertEquals(5,
                ConnectedCell.maxRegion(
                        new int[][]{
                                {1, 1, 0, 0},
                                {0, 1, 1, 0},
                                {0, 0, 1, 0},
                                {1, 0, 0, 0}
                        }));
    }

    @Test
    public void example02() {
        Assert.assertEquals(8,
                ConnectedCell.maxRegion(
                        new int[][]{
                                {0, 0, 1, 1},
                                {0, 0, 1, 0},
                                {0, 1, 1, 0},
                                {0, 1, 0, 0},
                                {1, 1, 0, 0}
                        }));
    }

    @Test
    public void example03() {
        Assert.assertEquals(10,
                ConnectedCell.maxRegion(
                        new int[][]{
                                {1, 0, 1, 1, 0},
                                {1, 1, 0, 0, 1},
                                {0, 1, 1, 1, 0},
                                {0, 0, 0, 0, 1},
                                {1, 1, 1, 0, 0}
                        }));
    }
}
