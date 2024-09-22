import java.util.*;

public class BST1 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int val) {
        if(root == null) {
            root = new Node(val);
            return root;
        }

        if(root.data > val) { 
           //go to left subtree
           root.left = insert(root.left, val);
        } else { 
           // go to right subtree
           root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inorder(Node root) {
        if(root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static boolean isAvailable(Node root, int key) {
        if(root == null) {
            return false;
        }

        if(root.data == key) {
            return true;
        }

        if(root.data > key) {
            return isAvailable(root.left, key);
        } else {
            return isAvailable(root.right, key);
        }
    }

    public static Node inorderSuccessor(Node root) {
        while(root.left != null) {
            root = root.left;
        }

        return root;
    }

    public static Node delete(Node root, int val) {
        if(root == null) {
            return null;
        } else if(root.data > val) {
            root.left = delete(root.left, val);
        } else if(root.data < val) {
            root.right = delete(root.right, val);
        } else {
            // case 1 : leaf node
            if(root.left == null && root.right == null) {
                return null;
            }

            // case 2 : single child node
            if(root.left == null) {
               return root.right;
            } else if(root.right == null) {
                return root.left;
            }

            // case 3 : double child node
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
            
       return root;
    }

    public static void printInRange(Node root, int k1, int k2) {
        if(root == null) {
            return;
        }

        if(root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        } else if (root.data < k1) {
            printInRange(root.left, k1, k2);
        } else {
            printInRange(root.right, k1, k2);
        }
    }

    public static void printRoot2Leaf(Node root, ArrayList<Integer> path) {
        if(root == null) {
            return;
        }

        if(root.left == null && root.right == null) {
            System.out.print(path + " ");
        }

        path.add(root.data);
        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);
        
        path.remove(path.size()-1);
    }

    public static boolean isValidBST(Node root, Node min, Node max) {
        if(root == null) {
            return true;
        }

        if(min != null && root.data <= min.data) {
            return false;
        }

        if(max != null && root.data >= max.data) {
            return false;
        }

        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }

    public static Node createMirror(Node root) {  // O(n)
        if(root == null) {
            return null;
        }

        Node leftChild = createMirror(root.left);
        Node rightChild = createMirror(root.right);

        root.left = rightChild;
        root.right = leftChild;

        return root;
    }

    public static void main(String args[]) {
        Node root = null;
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};

        for(int i=0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

/* 
                8
               / \
              6   10
            /  \    \
           3    5    11
          / \          \
         1   4          14
*/

        System.out.print("inOrder() : ");
        inorder(root);
        System.out.println();

        System.out.println("isAvailable() : " + isAvailable(root, 11));

        System.out.print("Delete 5 : ");
        root = delete(root, 5);
        inorder(root);
        System.out.println();

        System.out.print("printInRange() : ");
        printInRange(root, 5, 12);
        System.out.println();

        System.out.print("RootToLeaves : ");
        printRoot2Leaf(root, new ArrayList<>());
        System.out.println();

        System.out.println("isValidBST() : " + isValidBST(root, null, null));
    }
}