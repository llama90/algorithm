package dictionariesandhashmaps;

import org.junit.Assert;
import org.junit.Test;

public class HashTableTest {

    @Test
    public void example01() {
        Assert.assertEquals("Yes", HashTable.checkMagazine(
                new String[]{"give", "me", "one", "grand", "today", "night"},
                new String[]{"give", "one", "grand", "today"}));
    }

    @Test
    public void example02() {
        Assert.assertEquals("No", HashTable.checkMagazine(
                new String[]{"two", "times", "three", "is", "not", "four"},
                new String[]{"two", "times", "two", "is", "four"}));
    }

    @Test
    public void example03() {
        Assert.assertEquals("No", HashTable.checkMagazine(
                new String[]{"ive", "got", "a", "lovely", "bunch", "of", "coconuts"},
                new String[]{"ive", "got", "some", "coconuts"}));
    }
}
