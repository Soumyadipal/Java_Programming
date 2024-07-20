import java.util.LinkedList;
import java.util.Queue;

public class Pre_In_Post_Order_Traversal {
    public static class Node {
        int val; // 0
        Node left; // null
        Node right; // null
        public Node(int val){
            this.val = val;
        }
    }
    public static void preOrder(Node root){
        // root left right
        if (root == null) return;
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(Node root){
        // left root right
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }
    public static void postOrder(Node root){
        // left right root
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }
    public static void bfs(Node root){  // Breadth First Search using queue
        Queue<Node> q = new LinkedList<>();
        if (root != null) q.add(root);
        while (q.size() > 0){
            Node temp = q.peek();
            if (temp.left != null) q.add(temp.left);
            if (temp.right != null) q.add(temp.right);
            System.out.print(temp.val + " ");
            q.remove();
        }
    }
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
        Node f = new Node(7);
        b.left = e;
        b.right = f;
        System.out.print("Preorder traversal is : ");
        preOrder(root);
        System.out.println();
        System.out.print("Inorder traversal is : ");
        inOrder(root);
        System.out.println();
        System.out.print("Postorder traversal is : ");
        postOrder(root);
        System.out.println();
        System.out.print("Level order traversal(BFS) is : ");
        bfs(root);
    }
}
