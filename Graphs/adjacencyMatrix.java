import java.util.Scanner;

class adjacencyMatrix{
    public static void main(String[] args){
        // User Input dimenstions of graph
        // Space used O(N*N)

        Scanner obj = new Scanner(System.in);

        int n,m;
        System.out.println("Enter n and m : ");
        n = obj.nextInt();
        m = obj.nextInt();

        int[][] adj = new int[n+1][n+1];
        for(int i=0;i<m;i++){
            int u = obj.nextInt();
            int v = obj.nextInt();

            adj[u][v] = 1;
            adj[v][u] = 1;
        }

        printGraph(adj,n,m);

        obj.close();
    }

    public static void printGraph(int[][] adj, int n,int m){
        for(int i=0;i<n+1;i++){
            for(int j=0;j<n+1;j++){
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
    }
}