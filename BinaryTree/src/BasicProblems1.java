// Q.1) Find size of Binary Tree
// Q.2) Find the sum of tree nodes
// Q.3) Find the maximum value of Binary Tree
// Q.4) Find the height of the Binary Tre
// Q.5) Find the minimum value of Binary Tree
// Q.6) Find the product of tree nodes
// Q.7) Print elements of nth level
// Q.8) Print elements of the Binary Tree in Zigzag order

public class BasicProblems1 {
    public static class Node {
        int val; // 0
        Node left; // null
        Node right; // null
        public Node(int val){
            this.val = val;
        }
    }
    public static int size(Node root){  // Q.1
        if (root == null) return 0;     // Q.1
        return 1 + size(root.left) + size(root.right);    // Q.1
    }                                                     // Q.1
    public static int sumOfNodes(Node root){       // Q.2
        if (root == null) return 0;                // Q.2
        return root.val + sumOfNodes(root.left) + sumOfNodes(root.right);   // Q.2
    }                                                                       // Q.2
    public static int maxValue(Node root){  // Q.3
        if (root == null) return Integer.MIN_VALUE;  // Q.3
        return Math.max(root.val, Math.max(maxValue(root.left),maxValue(root.right)));  // Q.3
    }                                                                                   // Q.3
    public static int height(Node root){  // Q.4
        if(root == null || (root.left == null && root.right == null)) return 0;  // Q.4
        return 1 + Math.max(height(root.left),height(root.right));   // Q.4
    }                                                                // Q.4
    public static int minValue(Node root){  // Q.5
        if (root == null) return Integer.MAX_VALUE;  // Q.5
        return Math.min(root.val, Math.min(minValue(root.left),minValue(root.right)));  // Q.5
    }                                                                                   // Q.5
    public static int productOfNodes(Node root){  // Q.6
        if (root == null) return 1;                // Q.6
        return root.val * productOfNodes(root.left) * productOfNodes(root.right);   // Q.6
    }                                                                               // Q.6
    public static void nthLevel(Node root,int n){   // Q.7
        if (root == null) return;                   // Q.7
        if (n == 1) {                               // Q.7
            System.out.print(root.val + " ");       // Q.7
            return;                                 // Q.7
        }                                           // Q.7
        nthLevel(root.left,n - 1);               // Q.7
        nthLevel(root.right,n - 1);              // Q.7
    }                                               // Q.7
    public static void nthLevelRightToLeft(Node root,int n){   // Q.8
        if (root == null) return;                   // Q.8
        if (n == 1) {                               // Q.8
            System.out.print(root.val + " ");       // Q.8
            return;                                 // Q.8
        }                                           // Q.8
        nthLevelRightToLeft(root.right,n - 1);   // Q.8
        nthLevelRightToLeft(root.left,n - 1);    // Q.8
    }                                               // Q.8
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        b.right = e;
        System.out.println("Size of the binary tree is : " + size(root));  // Q.1
        System.out.println("Sum of the tree nodes is : " + sumOfNodes(root));  // Q.2
        System.out.println("Maximum value of binary tree is : " + maxValue(root));  // Q.3
        System.out.println("The height of binary tree is : " + height(root));  // Q.4
        System.out.println("Minimum value of binary tree is : " + minValue(root));  // Q.5
        System.out.println("Product of the tree nodes is : " + productOfNodes(root));  // Q.6
        System.out.print("nth level elements are : ");   // Q.7
        nthLevel(root,3);                             // Q.7
        System.out.println();
        System.out.println("The Zigzag order is : ");    // Q.8
        int level = height(root) + 1;                    // Q.8
        for(int i = 1; i <= level;i++){                  // Q.8
            if (i % 2 != 0) nthLevel(root,i);            // Q.8
            else nthLevelRightToLeft(root,i);            // Q.8
            System.out.println();                        // Q.8
        }                                                // Q.8
    }
}
