package graphs;

import java.util.*;

public class ShortestReach {
    private static final int DISTANCE_WEIGHT = 6;

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int numberOfQueries = scanner.nextInt();
        for (int q = 0; q < numberOfQueries; q++) {
            int numberOfNode = scanner.nextInt();
            int numberOfEdge = scanner.nextInt();

            ArrayList<Node> nodes = new ArrayList<>(numberOfNode);
            for (int i = 0; i < numberOfNode; i++) {
                nodes.add(new Node(i));
            }

            for (int i = 0; i < numberOfEdge; i++) {
                int source = scanner.nextInt() - 1; // started from zero
                int target = scanner.nextInt() - 1;

                nodes.get(source).addEdge(source, target);
                nodes.get(target).addEdge(target, source); // undirected
            }

            int startIndex = scanner.nextInt() - 1;
            Queue<Node> queue = new LinkedList<>();
            queue.add(nodes.get(startIndex));
            nodes.get(startIndex).visited = true;
            int distance = 0;
            while (!queue.isEmpty()) {
                Node node = queue.poll();
                distance++;
                for (Edge edge : node.edges) {
                    if (!nodes.get(edge.target).visited) {
                        nodes.get(edge.target).visited = true;
                        nodes.get(edge.target).distance = node.distance + 1;
                        queue.add(nodes.get(edge.target));
                    }
                }
            }

            for (int i = 0; i < numberOfNode; i++) {
                Node node = nodes.get(i);
                if (i == startIndex) {
                    continue;
                }
                if (node.visited) {
                    System.out.print(nodes.get(i).distance * DISTANCE_WEIGHT + " ");
                } else {
                    System.out.print("-1 ");
                }
            }
            System.out.println();
        }
    }

    public static class Node {
        private int value;
        private boolean visited = false;
        private int distance;
        private List<Edge> edges = new ArrayList<>();

        public Node(int value) {
            this.value = value;
        }

        public void addEdge(int source, int target) {
            edges.add(new Edge(source, target));
        }
    }

    public static class Edge {
        int source;
        int target;

        public Edge(int source, int target) {
            this.source = source;
            this.target = target;
        }
    }

}
