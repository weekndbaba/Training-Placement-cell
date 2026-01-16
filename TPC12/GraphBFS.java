import java.util.*;

public class GraphBFS {
    private int vertices;
    private LinkedList<Integer>[] adjList;

    GraphBFS(int v){
        vertices=v;
        adjList = new LinkedList[v];
        for(int i=0;i<v;i++){
            adjList[i]= new LinkedList<>();
        }
    }

    public void addEdge(int src, int dest){
        adjList[src].add(dest);
        adjList[dest].add(src);
    }

    public void bfs(int start){
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[start]=true;
        queue.add(start);

        System.out.print("BFS Traversal starting from node "+start+": ");

        while(!queue.isEmpty()){
            int current = queue.poll();
            System.out.print(current+" ");

            for(int neighbour:adjList[current]){
                if(!visited[neighbour]){
                    visited[neighbour]=true;
                    queue.add(neighbour);
                }
            }
        }
    }


    public static void main(String[] args) {
        GraphBFS graph = new GraphBFS(6);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);
        graph.bfs(0);
    }


}
