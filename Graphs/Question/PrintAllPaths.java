package Java.Graphs.Question;
import java.util.*;

public class PrintAllPaths {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for(int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();

        }

        graph[0].add(new Edge(0, 3));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

/*
        5     4
        |\   /|       5 --> 0 --> 3 --> 1
        | \ / |       4 --> 0 --> 3 --> 1
        |  0  |       5 --> 2 --> 3 --> 1
        2  |  1       4 --> 1
         \ | /
          \|/
           3
*/
    }

    public static void printAllpath(ArrayList<Edge> graph[], int src, int dest, String path) {
        if(src == dest) {
            System.out.println(path + dest);
            return;
        }

        for(int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            printAllpath(graph, e.dest, dest, path + src + " -> "); 
        }
    }

    public static void main(String args[]) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        printAllpath(graph, 5, 1, "");

    }
}