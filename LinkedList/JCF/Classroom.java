import java.util.*;

public class Classroom {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.addLast(3);
        ll.addFirst(1);
        ll.addLast(2);

        System.out.println(ll);

        ll.removeLast();
        ll.removeFirst();

        System.out.println(ll);
    }
}