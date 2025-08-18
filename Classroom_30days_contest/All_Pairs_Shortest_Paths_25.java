import java.util.Arrays;
import java.util.Scanner;

public class All_Pairs_Shortest_Paths_25 {
     static final long INF = (long) 1e15;  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  
        int M = sc.nextInt(); 

        long[][] dist = new long[N][N];

        for (int i = 0; i < N; i++) {
            Arrays.fill(dist[i], INF);
            dist[i][i] = 0;  
        }

        for (int i = 0; i < M; i++) {
            int u = sc.nextInt() - 1;  
            int v = sc.nextInt() - 1;
            long w = sc.nextLong();

            dist[u][v] = Math.min(dist[u][v], w);
        }

        for (int k = 0; k < N; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (dist[i][k] != INF && dist[k][j] != INF) {
                        dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                    }
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (dist[i][j] == INF) System.out.print("INF");
                else System.out.print(dist[i][j]);

                if (j < N - 1) System.out.print(" ");
            }
            System.out.println();
        }

        sc.close();   
    }
}
