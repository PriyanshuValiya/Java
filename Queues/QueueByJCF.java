import java.util.*;

public class QueueByJCF {
    public static void main(String[] args) {
        // Queue<Integer> q = new LinkedList<>(); 
        // or
        Queue<Integer> q = new ArrayDeque<>(); 
        
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
