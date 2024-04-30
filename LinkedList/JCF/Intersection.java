class Intersection {
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

    public void sort() {
        Node before = head;
        Node after = head.next;

        System.out.println(before.data + " " + after.data);

        while(after != null) {
            if(before.data < after.data) {
                int temp = before.data;
                before.data = after.data;
                after.data = temp;
            }
            before = before.next;
            after = after.next;
        }
    }

    public static void main(String[] args) {
        Intersection ll1 = new Intersection();
        Intersection ll2 = new Intersection();

        ll1.addFirst(7);
        ll1.addFirst(6); 
        ll1.addFirst(3);
        ll1.addFirst(2);
        ll1.addFirst(1);

        ll2.addFirst(5);
        ll2.addFirst(4);

        ll2.print();System.out.println();
        ll1.sort();
        ll2.sort();
        ll2.print();
    }
}