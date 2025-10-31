import java.util.ArrayList;
import java.util.Scanner;

public class dfs {
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
        dfstraversal(adj, n, 1);

        obj.close();
    }

    public static void printGraph(ArrayList<Integer>[] adj, int n){
        System.out.println();
        for(int i=0;i<n+1;i++){
            System.out.println(i + " -> " + adj[i]);
        }
    }

    public static void dfstraversal(ArrayList<Integer>[] adj, int n, int node){
        int[] visited = new int[n+1];
        dfsrecur(adj,visited,node);
    }

    public static void dfsrecur(ArrayList<Integer>[] adj, int[] visited, int node){
        visited[node] = 1;
        System.out.print(node + " ");
        for(int i=0;i<adj[node].size();i++){
            if(visited[adj[node].get(i)] == 0){
                dfsrecur(adj, visited, adj[node].get(i));
            }
        }
    }
}
