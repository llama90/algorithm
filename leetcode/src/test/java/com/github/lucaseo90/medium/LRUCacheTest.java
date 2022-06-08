package com.github.lucaseo90.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedHashMap;

public class LRUCacheTest {

    @Test
    public void exampleLinkedHashMap() {
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>(10, 0.75f, true);
        linkedHashMap.put(1, 1);
        linkedHashMap.put(2, 2);
        linkedHashMap.get(1);
        linkedHashMap.put(3, 3);
        linkedHashMap.put(4, 4);
        linkedHashMap.get(3);
        linkedHashMap.get(4);
    }

    @Test
    public void example01() {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1, 1); // cache is {1=1}
        lruCache.put(2, 2); // cache is {1=1, 2=2}
        Assert.assertEquals(1, lruCache.get(1));    // return 1
        lruCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        Assert.assertEquals(-1, lruCache.get(2));    // returns -1 (not found)
        lruCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        Assert.assertEquals(-1, lruCache.get(1));    // return -1 (not found)
        Assert.assertEquals(3, lruCache.get(3));    // return 3
        Assert.assertEquals(4, lruCache.get(4));    // return 4
    }
}
