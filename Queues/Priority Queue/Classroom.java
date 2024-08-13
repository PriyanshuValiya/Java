import java.util.*
;
public class Classroom {
    static class Student implements Comparable<Student> { // Over Riding
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        // O(log n)
        pq.add(new Student("A", 3));
        pq.add(new Student("B", 9));
        pq.add(new Student("C", 5));
        pq.add(new Student("D", 7));
        pq.add(new Student("E", 10));

        while(!pq.isEmpty()) {
            System.out.println(pq.peek().name + " -> " + pq.peek().rank); // o(1)
            pq.remove(); // O(log n)
        }
    }    
}
