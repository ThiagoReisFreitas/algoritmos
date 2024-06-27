package algoritmos.depthFirstSearch;

import java.util.*;

public class DepthFirstSearchInterative {
    private Map<Integer, List<Integer>> adjList;

    public DepthFirstSearchInterative(){
        this.adjList = new HashMap<>();
    }

    public void addEdge(int source, int destination){
        adjList.computeIfAbsent(source, k -> new ArrayList<>()).add(destination);
        adjList.computeIfAbsent(destination, k -> new ArrayList<>()).add(source);
    }

    public void dfs(int start) {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> visited = new HashSet<>();

        stack.push(start);

        while(!stack.isEmpty()){
            int node = stack.pop();

            if(!visited.contains(node)){
                visited.add(node);
                System.out.println("Visitando nó " + node);

                for(int neighbor : adjList.get(node)){
                    if (!visited.contains(neighbor)){
                        stack.push(neighbor);
                    }
                }
            }
        }
    }
    public static void  main(String[] args){
        DepthFirstSearchInterative graph = new DepthFirstSearchInterative();

        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(2, 5);
        graph.addEdge(3, 6);
        graph.addEdge(3, 7);

        System.out.println("DFS Interactive começando do nó 1: ");
        graph.dfs(1);
    }
}
