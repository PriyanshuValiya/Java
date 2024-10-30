public class Swap {
        public static class Node {
            int data;
            Node next;
    
            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        } 
    
        public static Node head;
        public static Node tail;
    
        public void addFirst(int data) {
            Node newNode = new Node(data);
            if(head == null) {
                head = tail = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
    
        public void print() {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.print("null");
        }

        public void swap(int x, int y) {
            Node temp = head;
            int i = 1, a=0, b=0;
            while(temp != null) {
                temp = temp.next;
                if(i == x) {
                    a = x;
                } else if (i == y) {
                    b = y;
                }
                i++;
            }
            int tmp = a;
            a = b;
            b = tmp;
            System.out.println("     P " + a + " " + b);

            
        }
    
        public static void main(String[] args) {
            Swap ll = new Swap();
            int x = 2, y = 4;

            ll.addFirst(4); 
            ll.addFirst(3);
            ll.addFirst(2);
            ll.addFirst(1);
    
            ll.print();
            ll.swap(x, y);
        }
}
