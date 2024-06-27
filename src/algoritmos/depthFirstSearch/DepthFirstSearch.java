package algoritmos.depthFirstSearch;

import java.util.*;

public class DepthFirstSearch {
    private Map<Integer, List<Integer>> adjList;
    private Set<Integer> visited;

    public DepthFirstSearch() {
        this.adjList = new HashMap<>();
        this.visited = new HashSet<>();
    }

    public void addEdge(int source, int destination){
        adjList.computeIfAbsent(source, k -> new ArrayList<>()).add(destination);
        adjList.computeIfAbsent(destination, k -> new ArrayList<>()).add(source);
    }

    public void dsf(int node){
        if(visited.contains(node)){
            return;
        }

        visited.add(node);
        System.out.println("Visitando nó "+node);

        for (int neighbor : adjList.get(node)){
            dsf(neighbor);
        }
    }

    public static void main(String[] args){
        DepthFirstSearch graph = new DepthFirstSearch();

        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(2, 5);
        graph.addEdge(3, 6);
        graph.addEdge(3, 7);

        System.out.println("DFS começando do nó 1:");
        graph.dsf(1);
    }

    public static void printGraph(Map<Integer, List<Integer>> graph){
        for (int vertex :graph.keySet()){
            System.out.print(vertex + " -> ");
            for (int neighbor : graph.get(vertex)){
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}
