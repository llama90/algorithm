package graphs;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ShortestReachTest {
    private static final int DIFFERENCE_INDEX = 1;

    @Test
    public void example01_1() {
        int numberOfNode = 4;
        int numberOfEdge = 2;
        Assert.assertEquals("6 6 -1 ", ShortestReach.traverse(1 - DIFFERENCE_INDEX,
                prepareNodes(
                        numberOfNode,
                        numberOfEdge,
                        new String[]{"1 2", "1 3"}),
                numberOfNode));
    }

    @Test
    public void example01_2() {
        int numberOfNode = 3;
        int numberOfEdge = 1;
        Assert.assertEquals("-1 6 ", ShortestReach.traverse(2 - DIFFERENCE_INDEX,
                prepareNodes(
                        numberOfNode,
                        numberOfEdge,
                        new String[]{"2 3"}),
                numberOfNode));
    }

    @Test
    public void example02() {
        int numberOfNode = 6;
        int numberOfEdge = 4;
        Assert.assertEquals("6 12 18 6 -1 ", ShortestReach.traverse(1 - DIFFERENCE_INDEX,
                prepareNodes(
                        numberOfNode,
                        numberOfEdge,
                        new String[]{"1 2", "2 3", "3 4", "1 5"}),
                numberOfNode));
    }

    @Test
    public void example03() {
        int numberOfNode = 7;
        int numberOfEdge = 4;
        Assert.assertEquals("6 12 18 6 -1 -1 ", ShortestReach.traverse(2 - DIFFERENCE_INDEX,
                prepareNodes(
                        numberOfNode,
                        numberOfEdge,
                        new String[]{"1 2", "1 3", "3 4", "2 5"}),
                numberOfNode));
    }

    public List<ShortestReach.Node> prepareNodes(int numberOfNode, int numberOfEdge, String[] edges) {
        ArrayList<ShortestReach.Node> nodes = new ArrayList<>(numberOfNode);
        for (int i = 0; i < numberOfNode; i++) {
            nodes.add(new ShortestReach.Node());
        }

        for (int i = 0; i < numberOfEdge; i++) {
            String[] split = edges[i].split(" ");
            int source = Integer.parseInt(split[0]) - DIFFERENCE_INDEX; // started from zero
            int target = Integer.parseInt(split[1]) - DIFFERENCE_INDEX;

            nodes.get(source).addEdge(source, target);
            nodes.get(target).addEdge(target, source); // undirected
        }
        return nodes;
    }

}
