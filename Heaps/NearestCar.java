package Java.Heaps;
import java.util.*;

public class NearestCar {
    static class Point implements Comparable<Point> {
        int distSq, id;

        public Point(int distSq, int id) {
            this.distSq = distSq;
            this.id = id;
        }

        @Override
        public int compareTo(Point p2) {
            return this.distSq - p2.distSq;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Point> pq = new PriorityQueue<>();

        int pts[][] = {{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;

        for(int i=0; i < pts.length; i++) {
            int distSq = (pts[i][0] * pts[i][0]) + (pts[i][1] * pts[i][1]);
            pq.add(new Point(distSq, i));
        }

        // for only nearest K cars
        for(int i=0; i < k; i++) {
            System.out.println("C" + pq.remove().id);
        }
    }
}
