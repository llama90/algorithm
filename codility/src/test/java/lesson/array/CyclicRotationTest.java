package lesson;

import org.junit.Assert;
import org.junit.Test;

public class CyclicRotationTest {

    @Test
    public void solutionTest() {
        CyclicRotation cyclicRotation = new CyclicRotation();
        Assert.assertArrayEquals(new int []{6, 3, 8, 9, 7}, cyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, 1));
        Assert.assertArrayEquals(new int []{7, 6, 3, 8, 9}, cyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, 2));
        Assert.assertArrayEquals(new int []{9, 7, 6, 3, 8}, cyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, 3));
        Assert.assertArrayEquals(new int []{8, 9, 7, 6, 3}, cyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, 4));
        Assert.assertArrayEquals(new int []{3, 8, 9, 7, 6}, cyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, 5));
    }
}
