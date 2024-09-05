package Java.Graphs;
import java.util.*;

// For getting previous dependencies of curr node

public class KahnAlgorithBFS {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for(int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

/*
        5     4
        |\   /|       5 --> 0
        | \ / |       4 --> 0
        |  0  |       5 --> 2 --> 3 --> 1
        2     1       4 --> 1
         \   /
          \ /
           3
*/
    }

    public static void calcInDeg(ArrayList<Edge> graph[], int InDeg[]) {
        for(int i = 0; i < graph.length; i++) {
            for(int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                InDeg[e.dest]++;
            }
        }
    }

    public static void topSort(ArrayList<Edge> graph[]) {
        int inDeg[] = new int[graph.length];
        Queue<Integer> q = new LinkedList<>();
        
        calcInDeg(graph, inDeg);

        for(int i = 0; i < inDeg.length; i++) {
            if(inDeg[i] == 0) {
                q.add(i);
            }
        }

        while(!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " ");

            for(int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);

                inDeg[e.dest]--;

                if(inDeg[e.dest] == 0) {
                    q.add(e.dest);
                }
            }
        }
    }

    public static void main(String args[]) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        topSort(graph);

    }
}