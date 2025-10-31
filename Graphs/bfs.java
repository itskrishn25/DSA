import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bfs {
    public static void main(String[] args){
        // User Input dimenstions of graph
        // Space used O(2*M)

        Scanner obj = new Scanner(System.in);

        int n,m;
        System.out.println("Enter n and m : ");
        n = obj.nextInt();
        m = obj.nextInt();

        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] adj = new ArrayList[n+1];
        for(int i=0;i<n+1;i++){
            adj[i] = new ArrayList<>();
        }
        for(int i=0;i<m;i++){
            int u = obj.nextInt();
            int v = obj.nextInt();

            adj[u].add(v);
            adj[v].add(u);
        }

        printGraph(adj,n);
        bfstraversal(adj, n, 1);

        obj.close();
    }

    public static void printGraph(ArrayList<Integer>[] adj, int n){
        System.out.println();
        for(int i=0;i<n+1;i++){
            System.out.println(i + " -> " + adj[i]);
        }
    }

    public static void bfstraversal(ArrayList<Integer>[] adj, int n, int node){
        int[] visited = new int[n+1];
        Queue<Integer> q = new LinkedList<>();
        q.offer(node);
        visited[node] = 1;

        while(!q.isEmpty()){
            int current = q.poll();
            System.out.print(current + " ");

            for(int i=0;i<adj[current].size();i++){
                if(visited[adj[current].get(i)] == 0){
                    q.offer(adj[current].get(i));
                    visited[adj[current].get(i)] = 1;
                }
            }
        }
    }
}
