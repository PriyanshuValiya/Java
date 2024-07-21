package Java;

import java.util.*;

public class BTBasic {
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

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;

            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void preorder(Node root) { // O(n)
            if (root == null) {
                return;
            }

            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root) { // O(n)
            if (root == null) {
                return;
            }

            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public static void postorder(Node root) { // O(n)
            if (root == null) {
                return;
            }

            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        public static void levelOrder(Node root) {
            if (root == null) {
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");

                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }

                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }

        public static int height(Node root) {
            if (root == null) {
                return 0;
            }

            int leftHeight = height(root.left);
            int rightHeight = height(root.right);

            return Math.max(leftHeight, rightHeight) + 1;
        }

        public static int nodeCount(Node root) {
            if (root == null) {
                return 0;
            }

            int leftCnt = nodeCount(root.left);
            int rightCnt = nodeCount(root.right);

            return leftCnt + rightCnt + 1;
        }

        public static int sum(Node root) {
            if (root == null) {
                return 0;
            }

            int leftEleSum = sum(root.left);
            int rightEleSum = sum(root.right);

            return leftEleSum + rightEleSum + root.data;
        }

        public static int diameter1(Node root) { // O(n^2)
            if (root == null) {
                return 0;
            }

            int leftDia = diameter1(root.left);
            int leftH = height(root.left);
            int rightDia = diameter1(root.right);
            int rightH = height(root.right);

            int selfDia = leftH + rightH + 1;

            return Math.max(selfDia, Math.max(leftDia, rightDia));
        }

        static class Info {
            int dia, ht;

            public Info(int dia, int ht) {
                this.dia = dia;
                this.ht = ht;
            }
        }

        public static Info diameter2(Node root) { // O(n)
            if (root == null) {
                return new Info(0, 0);
            }

            Info leftInfo = diameter2(root.left);
            Info rightInfo = diameter2(root.right);

            int diam = Math.max(Math.max(leftInfo.dia, rightInfo.dia), leftInfo.ht + rightInfo.ht + 1);
            int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

            return new Info(diam, ht);
        }

        public static boolean isIdentical(Node root, Node subRoot) {
            if (root == null && subRoot == null) {
                return true;
            } else if (root == null || subRoot == null || root.data != subRoot.data) {
                return false;
            }

            if (!isIdentical(root.left, subRoot.left)) {
                return false;
            }

            if (!isIdentical(root.right, subRoot.right)) {
                return false;
            }

            return true;
        }

        public static boolean isSubtree(Node root, Node subRoot) {
            if (root == null) {
                return false;
            }

            if (root.data == subRoot.data) {
                if (isIdentical(root, subRoot)) {
                    return true;
                }
            }

            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }

        static class nodeInfo {
            Node node;
            int hd;

            public nodeInfo(Node node, int hd) {
                this.node = node;
                this.hd = hd;
            }
        }

        public static void topView(Node root) {
            Queue<nodeInfo> q = new LinkedList<>();
            Map<Integer, Node> map = new HashMap<>();

            int min = 0, max = 0;
            q.add(new nodeInfo(root, 0));
            q.add(null);

            while (!q.isEmpty()) {
                nodeInfo curr = q.remove();
                if (curr == null) {
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    if (!map.containsKey(curr.hd)) {
                        map.put(curr.hd, curr.node);
                    }

                    if (curr.node.left != null) {
                        q.add(new nodeInfo(curr.node.left, curr.hd - 1));
                        min = Math.min(min, curr.hd - 1);
                    }

                    if (curr.node.right != null) {
                        q.add(new nodeInfo(curr.node.right, curr.hd + 1));
                        max = Math.max(max, curr.hd + 1);
                    }
                }
            }

            for (int i = min; i <= max; i++) {
                System.out.print(map.get(i).data + " ");
            }
        }

        public static void KLevel(Node root, int level, int k) {
            if (root == null) {
                return;
            }

            if (level == k) {
                System.out.print(root.data + " ");
                return;
            }

            KLevel(root.left, level + 1, k);
            KLevel(root.right, level + 1, k);
        }

        public static boolean rootToNodePath(Node root, int node, ArrayList<Node> path) {
            if (root == null) {
                return false;
            }

            path.add(root);

            if (root.data == node) {
                return true;
            }

            if (root.left != null && rootToNodePath(root.left, node, path)) {
                return true;
            }

            if (root.right != null && rootToNodePath(root.right, node, path)) {
                return true;
            }

            path.remove(path.size() - 1);
            return false;
        }

        public static Node lca(Node root, int n1, int n2) {
            ArrayList<Node> path1 = new ArrayList<>();
            ArrayList<Node> path2 = new ArrayList<>();

            rootToNodePath(root, n1, path1);
            rootToNodePath(root, n2, path2);

            int i = 0;
            for (; i < path1.size() && i < path2.size(); i++) {
                if (!path1.get(i).equals(path2.get(i))) {
                    break;
                }
            }

            return path1.get(i - 1);
        }

        public static Node lca2(Node root, int n1, int n2) {  // O(n)
            if (root == null) {
                return null;
            }

            if (root.data == n1 || root.data == n2) {
                return root;
            }

            Node leftFound = lca2(root.left, n1, n2);
            Node rightFound = lca2(root.right, n1, n2);

            if (leftFound == null) {  // both nodes were found at right part and left part returns null
                return rightFound;
            } else if (rightFound == null) {  // both nodes found at left part and right part returns null
                return leftFound;
            } else {  // one node was found at right and one at left part
                return root;
            }
        }

        public static int getDist(Node root, int n) {
            if (root == null) {
                return -1;
            }

            if (root.data == n) {
                return 0;
            }

            int leftDist = getDist(root.left, n);
            if (leftDist != -1) {
                return leftDist + 1;
            }

            int rightDist = getDist(root.right, n);
            if (rightDist != -1) {
                return rightDist + 1;
            }

            return -1;
        }

        public static int minDist(Node root, int n1, int n2) {
            Node lca = lca2(root, n1, n2);

            int d1 = getDist(lca, n1);
            int d2 = getDist(lca, n2);

            return d1 + d2;
        }

        public static int KthAncestor(Node root, int n, int k) {
            if(root == null) {
                return -1;
            }
    
            if(root.data == n) {
                return 0;
            }

            int leftDist = KthAncestor(root.left, n, k);
            int rightDist = KthAncestor(root.right, n, k);
    
            if(leftDist == -1 && rightDist == -1) {
                return -1;
            }
    
            int dist = Math.max(leftDist, rightDist);

            if(dist + 1 == k) {
                System.out.println("Kth Ancestor : " + root.data);
            }

            return dist + 1;
        }

        public static int sumOfTree(Node root) {
            if(root == null) {
                return 0;
            }

            int leftChild = sumOfTree(root.left);
            int rightChild = sumOfTree(root.right);

            int data = root.data;
            int newLeft = root.left == null ? 0 : root.left.data;
            int newRight = root.right == null ? 0 : root.right.data;
 
            root.data = newLeft + leftChild + newRight + rightChild;

            return data;
        }

        public static void printSumTree(Node root) {
            if(root == null) {
                return;
            }

            System.out.print(root.data + " ");
            printSumTree(root.left);
            printSumTree(root.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

    /*
            1
           / \
          2   3
         / \   \
        4   5   6
    */

        Node root = tree.buildTree(nodes);
        System.out.println("Root : " + root.data);

        System.out.print("preOrder() : ");
        tree.preorder(root);
        System.out.println();

        System.out.print("inOrder() : ");
        tree.inorder(root);
        System.out.println();

        System.out.print("postOrder() : ");
        tree.postorder(root);
        System.out.println();

        System.out.print("levelOrder() : \n");
        tree.levelOrder(root);

        System.out.println("Height Of Tree : " + tree.height(root));

        System.out.println("Number Of Nodes : " + tree.nodeCount(root));

        System.out.println("Sum Of All Nodes : " + tree.sum(root));

        System.out.println("diameter1() : " + tree.diameter1(root));

        System.out.println("diameter2() : " + tree.diameter2(root).dia);

        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);
        System.out.println("isSubTree() : " + tree.isSubtree(root, subRoot));

        System.out.print("topView() : ");
        tree.topView(root);
        System.out.println();

        System.out.print("KLevel() : ");
        tree.KLevel(root, 1, 2);
        System.out.println();

        System.out.print("Lowest Common Ancestor1 : " + tree.lca(root, 4, 6).data);
        System.out.println();

        System.out.print("Lowest Common Ancestor2 : " + tree.lca2(root, 4, 6).data);
        System.out.println();

        System.out.println("Min Distance : " + tree.minDist(root, 4, 6));

        tree.KthAncestor(root, 5, 2);

        tree.sumOfTree(root);
        System.out.print("Sum Of Tree : ");
        tree.printSumTree(root);
    }
}
