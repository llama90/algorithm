package com.github.lucaseo90;

import org.junit.Assert;
import org.junit.Test;

public class No0049Test {

    private No0049 no0049 = new No0049();

    @Test
    public void example01() {
        Assert.assertEquals("[[tan, nat], [bat], [eat, tea, ate]]",
                no0049.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}).toString());
    }

    @Test
    public void example02() {
        Assert.assertEquals("[[]]",
                no0049.groupAnagrams(new String[]{""}).toString());
    }

    @Test
    public void example03() {
        Assert.assertEquals("[[a]]",
                no0049.groupAnagrams(new String[]{"a"}).toString());
    }

}
