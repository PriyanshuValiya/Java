package Java.Heaps;
import java.util.*;

public class Soldiers {
    static class Soldier implements Comparable<Soldier> {
        int idx, numSolds;

        public Soldier(int idx, int numSolds) {
            this.idx = idx;
            this.numSolds = numSolds;
        }

        @Override
        public int compareTo(Soldier row2) {
            if(this.numSolds == row2.numSolds) {
                return this.idx - row2.idx;
            } else {
                return this.numSolds - row2.numSolds;
            }
        } 
    }

    public static void main(String[] args) {
        PriorityQueue<Soldier> pq = new PriorityQueue<>();

        int army[][] = {
            {1 ,0, 0, 0},
            {1, 1, 1, 1},
            {1, 0, 0, 0},
            {1, 0, 0, 0}
        };

        int k = 2;

        for(int i=0; i < army.length; i++) {
            int count = 0;
            for(int j=0; j < army[0].length; j++) {
                count += army[i][j] == 1 ? 1 : 0;
            }
            pq.add(new Soldier(i, count));
        }

        for(int i=0; i < k; i++) {
            System.out.println("R" + pq.remove().idx);
        }
    }
}
