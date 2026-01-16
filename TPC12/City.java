import java.util.*;

public class City {
    private int vertices;
    private LinkedList<Integer>[] adjList;

    City(int v){
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

    public boolean bfs(int src, int des) {
    if (src == des) return true;

    boolean[] visited = new boolean[vertices];
    Queue<Integer> queue = new LinkedList<>();

    visited[src] = true;
    queue.add(src);

    while (!queue.isEmpty()) {
        int current = queue.poll();

        for (int neighbour : adjList[current]) {
            if (!visited[neighbour]) {
                if (neighbour == des) {++
                    return true;
                }
                visited[neighbour] = true;
                queue.add(neighbour);
            }
        }
    }
    return false;
}



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number of pairs");
        int n = scan.nextInt();
        GraphBFS graph = new GraphBFS(n);

        for(int i=0;i<n;i++){
            System.out.println("enter 2 pairs");
            int n1 = scan.nextInt();
            int n2 = scan.nextInt();
            graph.addEdge(n1, n2);
        }
        System.out.println("enter src and des");
        graph.bfs();
    }


}
