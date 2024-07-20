import java.util.LinkedList;
import java.util.Queue;

// Q.1) Construct tree from level order traversal
// Q.2) Given a binary tree, print boundary nodes of the binary tree Anti-clockwise starting from the root(Boundary Traversal)
public class BasicProblems2 {
    public static class Node {
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    public static int height(Node root){  // Q.1
        if(root == null || (root.left == null && root.right == null)) return 0;  // Q.1
        return 1 + Math.max(height(root.left),height(root.right));   // Q.1
    }                                                                // Q.1
    public static void nthLevel(Node root,int n){   // Q.1
        if (root == null) return;                   // Q.1
        if (n == 1) {                               // Q.1
            System.out.print(root.val + " ");       // Q.1
            return;                                 // Q.1
        }                                           // Q.1
        nthLevel(root.left,n - 1);               // Q.1
        nthLevel(root.right,n - 1);              // Q.1
    }
    public static Node constructBFS(String [] arr){   // Q.1
        int x = Integer.parseInt(arr[0]);             // Q.1
        Node root = new Node(x);                      // Q.1
        Queue<Node> q = new LinkedList<>();           // Q.1
        q.add(root);                                  // Q.1
        int i = 1;                                    // Q.1
        while (i < arr.length - 1){                   // Q.1
            Node temp = q.remove();                   // Q.1
            Node left = new Node(0);              // Q.1
            Node right = new Node(0);             // Q.1
            if(arr[i].equals("")) left = null;        // Q.1
            else {                                    // Q.1
                int l = Integer.parseInt(arr[i]);     // Q.1
                left.val = l;                         // Q.1
                q.add(left);                          // Q.1
            }                                         // Q.1
            if(arr[i + 1].equals("")) right = null;   // Q.1
            else {                                    // Q.1
                int r = Integer.parseInt(arr[i + 1]); // Q.1
                right.val = r;                        // Q.1
                q.add(right);                         // Q.1
            }                                         // Q.1
            temp.left = left;                         // Q.1
            temp.right = right;                       // Q.1
            i += 2;                                   // Q.1
        }                                             // Q.1
        return root;                                  // Q.1
    }                                                 // Q.1
    public static void boundaryDisplay(Node root){
        LeftBoundary(root);
        BottomBoundary(root);
        RightBoundary(root.right);
    }
    public static void LeftBoundary(Node root){
        if(root == null) return;
        if(root.left == null && root.right == null) return;
        System.out.print(root.val + " ");
        if(root.left != null) LeftBoundary(root.left);
        else LeftBoundary(root.right);
    }
    public static void BottomBoundary(Node root){
        if(root == null) return;
        if(root.left == null && root.right == null) {
            System.out.print(root.val + " ");
            return;
        }
        BottomBoundary(root.left);
        BottomBoundary(root.right);
    }
    public static void RightBoundary(Node root){
        if(root == null) return;
        if(root.left == null && root.right == null) return;
        if(root.right != null) RightBoundary(root.right);
        else RightBoundary(root.left);
        System.out.print(root.val + " ");
    }
    public static void main(String[] args) {
//        String [] arr = {"1","2","3","4","5","","6","","7","","","8","","","","9",""};  // Q.1
//        Node root = constructBFS(arr);                   // Q.1
//        int level = height(root) + 1;                    // Q.1
//        for(int i = 1; i <= level;i++){                  // Q.1
//            nthLevel(root,i);                            // Q.1
//            System.out.println();                        // Q.1
//        }                                                // Q.1

        String [] arr = {"1","2","3","4","5","","6","7","","8","","9","10","","11","","12","","13","","14","15","16","","17","","","18","","19","","","","20","21","22","23","","24","25","26","27","","","28","",""};
        Node root = constructBFS(arr);
        boundaryDisplay(root);
    }
}
