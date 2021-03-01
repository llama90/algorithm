package com.github.lucaseo90;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class No0797 {
    List<List<Integer>> paths = new LinkedList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int numberOfNodes = graph.length;
        boolean[] visited = new boolean[numberOfNodes];
        paths = new LinkedList<>();
        ArrayList path = new ArrayList();
        path.add(0);
        traverse(graph, 0, visited, path);
        return paths;
    }

    public void traverse(int[][] graph, int currentIndex, boolean[] visited, ArrayList<Integer> path) {
        if (currentIndex == graph.length - 1) {
            paths.add(new ArrayList(path));
            return;
        }

        int numberOfEdges = graph[currentIndex].length;
        for (int i = 0; i < numberOfEdges; i++) {
            int adjacentNode = graph[currentIndex][i];
            if (!visited[adjacentNode]) {
                visited[adjacentNode] = true;
                path.add(adjacentNode);
                traverse(graph, adjacentNode, visited, path);
                path.remove(path.size() - 1);
                visited[adjacentNode] = false;
            }
        }
    }

}
