package com.github.lucaseo90.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class No0189Test {

    No0189 no0189 = new No0189();

    @Test
    public void testExample01() {
        Assert.assertEquals("[5, 6, 7, 1, 2, 3, 4]", Arrays.toString(no0189.rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3)));
    }

    @Test
    public void testExample02() {
        Assert.assertEquals("[3, 99, -1, -100]", Arrays.toString(no0189.rotate(new int[]{-1, -100, 3, 99}, 2)));
    }

    @Test
    public void testUserDefined01() {
        Assert.assertEquals("[1, 2, 3, 4, 5, 6, 7]", Arrays.toString(no0189.rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 0)));
        Assert.assertEquals("[7, 1, 2, 3, 4, 5, 6]", Arrays.toString(no0189.rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 1)));
        Assert.assertEquals("[6, 7, 1, 2, 3, 4, 5]", Arrays.toString(no0189.rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 2)));
        Assert.assertEquals("[5, 6, 7, 1, 2, 3, 4]", Arrays.toString(no0189.rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3)));
        Assert.assertEquals("[4, 5, 6, 7, 1, 2, 3]", Arrays.toString(no0189.rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 4)));
        Assert.assertEquals("[3, 4, 5, 6, 7, 1, 2]", Arrays.toString(no0189.rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 5)));
        Assert.assertEquals("[2, 3, 4, 5, 6, 7, 1]", Arrays.toString(no0189.rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 6)));
        Assert.assertEquals("[1, 2, 3, 4, 5, 6, 7]", Arrays.toString(no0189.rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 7)));
        Assert.assertEquals("[7, 1, 2, 3, 4, 5, 6]", Arrays.toString(no0189.rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 8)));
        Assert.assertEquals("[6, 7, 1, 2, 3, 4, 5]", Arrays.toString(no0189.rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 9)));

    }

}
