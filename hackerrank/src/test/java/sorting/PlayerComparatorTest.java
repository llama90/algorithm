package sorting;

import org.junit.Assert;
import org.junit.Test;

public class PlayerComparatorTest {

    @Test
    public void example01() {
        Assert.assertEquals("[aleksa 150, amy 100, david 100, aakansha 75, heraldo 50]", PlayerComparator.sortPlayer(new Player[]{
                new Player("amy", 100),
                new Player("david", 100),
                new Player("heraldo", 50),
                new Player("aakansha", 75),
                new Player("aleksa", 150)
        }));
    }

}
