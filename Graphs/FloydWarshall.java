import java.util.*;

public class FloydWarshall {
    static final int INF = 100000000;

    public static void floydWarshall(int[][] dist) {
        int n = dist.length;

        // Floyd-Warshall main triple nested loop
        for (int k = 0; k < n; k++) { // intermediate
            for (int i = 0; i < n; i++) { // source
                for (int j = 0; j < n; j++) { // destination
                    if (dist[i][k] < INF && dist[k][j] < INF) {
                        dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                    }
                }
            }
        }
    }

    public static void printMatrix(int[][] dist) {
        for (int row[] : dist) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        int[][] dist = {
            { 0, 4, INF, 5, INF },
            { INF, 0, 1, INF, 6 },
            { 2, INF, 0, 3, INF },
            { INF, INF, 1, 0, 2 },
            { 1, INF, INF, 4, 0 }
        };

        floydWarshall(dist);

        System.out.println("Shortest Distance Matrix:");
        printMatrix(dist);
    }
}
