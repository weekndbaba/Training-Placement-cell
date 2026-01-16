import java.util.*;

public class GraphDFS {
    private int vertices;
    private LinkedList<Integer>[] adjList;

    public GraphDFS(int v){
        adjList = new LinkedList[v];
        for(int i=0;i<v;i++){
            adjList[i]=new LinkedList<>();
        }
    }

    public void addEdge(int src, int dest){
        adjList[src].add(dest);
        adjList[dest].add(src);
    }

    public void dfs(int start){
        boolean[] visited = new boolean[vertices];
        System.out.print("DFS Traversal starting from node "+start+": ");
        dfsUtil(start, visited);
    }   

    private void dfsUtil(int current, boolean[] visited){
        visited[current] = true;
        System.out.print(current+" ");
        for(int neighbour: adjList[current]){
            if(!visited[neighbour]){
                dfsUtil(neighbour, visited);
            }
        }
    }

    public static void main(String[] args) {
        GraphDFS graph = new GraphDFS(6);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);
        graph.dfs(0);
    }


}
