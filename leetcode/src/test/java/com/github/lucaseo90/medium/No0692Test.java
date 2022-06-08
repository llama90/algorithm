package com.github.lucaseo90.medium;

import org.junit.Assert;
import org.junit.Test;

public class No0692Test {

    private No0692 no0692 = new No0692();

    @Test
    public void example01() {
        Assert.assertEquals("[i, love]", no0692.topKFrequent(new String[]{"i", "love", "leetcode", "i", "love", "coding"}, 2).toString());
    }

    @Test
    public void example02() {
        Assert.assertEquals("[the, is, sunny, day]", no0692.topKFrequent(new String[]{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"}, 4).toString());
    }

    @Test
    public void example01_withStream() {
        Assert.assertEquals("[i, love]", no0692.topKFrequentStream(new String[]{"i", "love", "leetcode", "i", "love", "coding"}, 2).toString());
    }

    @Test
    public void example02_withStream() {
        Assert.assertEquals("[the, is, sunny, day]", no0692.topKFrequentStream(new String[]{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"}, 4).toString());
    }
}
