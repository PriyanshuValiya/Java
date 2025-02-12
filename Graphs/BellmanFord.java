package Java.Graphs;
import java.util.*;

// Note : The Bellman-Ford algorithm is a graph algorithm that computes the shortest paths from a single source vertex to all other vertices in a weighted graph. It can handle graphs with negative weight edges, making it more versatile than algorithms like Dijkstra's, which cannot handle negative weights.

public class BellmanFord {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for(int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));

/*
          1 --- 4       0 --> 1
         /|     |       0 --> 2 --> 3 --> 4 --> 1
        0 |     |       1 --> 2
         \|     |       2 --> 3 --> 4 --> 1
          2 --- 3
*/
    }

    public static void bellmanFord(ArrayList<Edge> graph[], int src) { // O(V*E)
        int dist[] = new int[graph.length];

        for(int i = 0; i < dist.length; i++) { 
            if(i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        int V = graph.length;
        
        for(int i = 0; i < V-1; i++) { // O(V), Here (V-1) bcz we need (n-1) edges to connect (n) nodes.
            for(int j = 0; j < V; j++) { // O(E)
                for(int k = 0; k < graph[j].size(); k++) {
                    Edge e = graph[j].get(k);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    // relaxation code
                    if(dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) { 
                        dist[v] = dist[u] + wt;
                    }
                }
            }
        }

        for(int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
    }

    public static void main(String args[]) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        bellmanFord(graph, 0);
    }

}