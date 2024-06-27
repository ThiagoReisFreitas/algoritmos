package algoritmos.breadthFirstSearch;

import java.util.*;

public class BreadthFirstSearch {
    private Map<Integer, List<Integer>> adjList;
    public BreadthFirstSearch(){
        this.adjList = new HashMap<>();
    }

    public void addEdge(int source, int destination){
        adjList.computeIfAbsent(source, k -> new ArrayList<>()).add(destination);
        adjList.computeIfAbsent(destination, k -> new ArrayList<>()).add(source);
    }

    public void bfs(int startnode){
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        queue.add(startnode);
        visited.add(startnode);

        while(!queue.isEmpty()){
            int node = queue.poll();
            System.out.println("Visitando nó "+node);

            for(int neighbor : adjList.get(node)){
                if (!visited.contains(neighbor)){
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
     }

     public static void main(String[] args){
        BreadthFirstSearch graph = new BreadthFirstSearch();

         graph.addEdge(1, 2);
         graph.addEdge(1, 3);
         graph.addEdge(2, 4);
         graph.addEdge(2, 5);
         graph.addEdge(3, 6);
         graph.addEdge(3, 7);

         System.out.println("BFS começando do nó 1: ");
         graph.bfs(1);
     }
}
