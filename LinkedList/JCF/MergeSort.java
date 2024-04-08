import java.util.*;

// O(nlogn)

public class MergeSort {
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

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) { 
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1 != null && head2 != null) {
            if(head1.data <= head2.data) { 
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        while(head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    public Node mergeSort(Node head) {
      if(head == null || head.next == null) {
        return head;
      }

      // Find Mid
      Node mid = getMid(head);
      
      // Left & Rigth MS
      Node rightHead = mid.next;
      mid.next = null;
      Node newLeft = mergeSort(head);
      Node newRight = mergeSort(rightHead);

      // Merge
      return merge(newRight, newLeft);
    }
    
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(5);
        ll.addFirst(2);
        ll.addFirst(1);  
        ll.addFirst(3); 
        ll.addFirst(4);


        System.out.println(ll);
        ll.head = ll.mergeSort(ll.head);
        System.out.println(ll);
    }
}
