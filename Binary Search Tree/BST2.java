import java.util.*;
;
public class BST2 {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void preorder(Node root) {
        if(root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static Node convertToBST1(int arr[], int st, int end) {
        if(st > end) {
            return null;
        }

        int mid = (st + end) / 2;

        Node curr = new Node(arr[mid]);
        curr.left = convertToBST1(arr, st, mid-1);
        curr.right = convertToBST1(arr, mid+1, end);
        
        return curr;
    }

    public static Node convertToBST2(ArrayList<Integer> arr, int st, int end) {
        if(st > end) {
            return null;
        }
        
        int mid = (st + end) / 2;

        Node curr = new Node(arr.get(mid));
        curr.left = convertToBST2(arr, st, mid-1);
        curr.right = convertToBST2(arr, mid+1, end);

        return curr;
    }

    public static void getInorder(Node root, ArrayList<Integer> arr) {
        if(root == null) {
            return;
        }

        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);
    }

    public static Node balanceBST(Node root) {
        ArrayList<Integer> arr = new ArrayList<>();
        getInorder(root, arr);

        return convertToBST2(arr, 0, arr.size()-1);
    }

    public static void main(String args[]) {
        int arr[] = {3, 5, 6, 8, 10, 11, 12};

        /*
                     8
                   /   \
                  5     11
                 / \    / \
                3   6  10  12   
        */

         Node root = convertToBST1(arr, 0, arr.length-1);

         System.out.print("preOrder() : ");
         preorder(root);
         System.out.println();
         
         System.out.print("balanceBST() : ");
         Node mainRoot = balanceBST(root);
         preorder(mainRoot);
         System.out.println();
    }
}