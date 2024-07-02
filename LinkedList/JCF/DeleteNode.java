public class DeleteNode {
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
            System.out.println(" *");
        }

        public void skipNode(Node head, int M, int N) {
            Node temp = head;

            while(temp != null) {
             if(temp.next == null) {
                 return;
             }

             for(int i = 1; temp.next == null; i++) {
                temp = temp.next;
                if(i == M) {
                    System.out.println(temp.data);
                }
             }
            }
        }

        static void skipMdeleteN( Node head, int M, int N){
            Node curr = head, t;
            int count;
            while (curr!=null){
            for (count = 1; count < M && curr != null; count++)
            curr = curr.next;
            if (curr == null)
            return;
            t = curr.next;
            for (count = 1; count <= N && t != null; count++){
            Node temp = t;
            t = t.next;
            }
            curr.next = t;
            curr = t;
            }
        }
    
        public static void main(String[] args) {
            DeleteNode ll = new DeleteNode();
    
            ll.addFirst(8); 
            ll.addFirst(7);
            ll.addFirst(6); 
            ll.addFirst(5);
            ll.addFirst(4);
            ll.addFirst(3);
            ll.addFirst(2);
            ll.addFirst(1);
    
           ll.print();
           ll.skipNode(head, 2, 2);System.out.println();
           ll.print();
        }
}