package com.github.lucaseo90.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class No0973Test {

    private final No0973 no0973 = new No0973();

    @Test
    public void example01() {
        Assert.assertEquals(Arrays.deepToString(new int[][]{
                {-2, 2},
        }), Arrays.deepToString(no0973.kClosest(new int[][]{
                {1, 3},
                {-2, 2}
        }, 1)));
    }

    @Test
    public void example02() {
        Assert.assertEquals(Arrays.deepToString(new int[][]{
                {3, 3},
                {-2, 4}
        }), Arrays.deepToString(no0973.kClosest(new int[][]{
                {3, 3},
                {5, -1},
                {-2, 4}
        }, 2)));
    }

}
