import java.util.*;

public class StackByArrayList {
    public static class Stack {
        public static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // Push
        public static void push(int data) {
            list.add(data); // add data at top of the Stack
        }

        // Pop
        public static int pop() {
            if(isEmpty()) {
                return -1;
            }

            int top = list.get(list.size() - 1); // get last Putted value in Stack
            list.remove(list.size() - 1);
            return top;
        }

        // Peek
        public static int peek() {
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }   
}