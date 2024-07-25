import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Q.1) Find Inorder predecessor and successor for a given key in BST
public class BasicProblems1 {
    static int pred = -1; // better approach
    static int suc = -1; // better approach
    static Node temp = null; // better approach
    static boolean flag = false; // better approach
    public static class Node {
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }

    public static Node constructBFS(String [] arr){
        int x = Integer.parseInt(arr[0]);
        Node root = new Node(x);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while (i < arr.length - 1){
            Node temp = q.remove();
            Node left = new Node(0);
            Node right = new Node(0);
            if(arr[i].equals("")) left = null;
            else {
                int l = Integer.parseInt(arr[i]);
                left.val = l;
                q.add(left);
            }
            if(arr[i + 1].equals("")) right = null;
            else {
                int r = Integer.parseInt(arr[i + 1]);
                right.val = r;
                q.add(right);
            }
            temp.left = left;
            temp.right = right;
            i += 2;
        }
        return root;
    }

    public static void inOrder(Node root, List<Integer> arr){
        // ***** Inorder traversal of a B.S.T is always in sorted order *****
        // left root right
        if (root == null) return;
        inOrder(root.left,arr);
        arr.add(root.val);
        inOrder(root.right,arr);
    }
    public static void inorderForBetterApproach(Node root,int val){ // better approach
        if (root == null) return;                                   // better approach
        inorderForBetterApproach(root.left,val);                    // better approach
        if(temp == null) temp = root;                               // better approach
        else {                                                      // better approach
            if(root.val == val){                                    // better approach
                pred = temp.val;                                    // better approach
                flag = true;                                        // better approach
            } else if (root.val > val && flag == true) {            // better approach
                suc = root.val;                                     // better approach
                flag = false;                                       // better approach
            } else {                                                // better approach
                temp = root;                                        // better approach
            }                                                       // better approach
        }                                                           // better approach
        inorderForBetterApproach(root.right,val);                   // better approach
    }                                                               // better approach


    public static void main(String[] args) {
        String [] a = {"50","20","60","17","34","55","89","10","","28","","","","70","","","14"};
        Node root = constructBFS(a);
        System.out.print("In Order : ");
        List<Integer> arr = new ArrayList<>();
        inOrder(root,arr);
        int val = 28;
        int idx = -1;
        for(int i = 0;i < arr.size();i++){
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
//        for (int i = 0;i < arr.size();i++){
//            if(arr.get(i) == val){
//                idx = i;
//                break;
//            }
//        }
//        int pred = arr.get(idx - 1);
//        int suc = arr.get(idx + 1);
//        System.out.println("Predecessor is : " + pred);
//        System.out.println("Successor is : " + suc);


        inorderForBetterApproach(root,val);  // better approach
        System.out.println(pred);            // better approach
        System.out.println(suc);             // better approach
    }
}
