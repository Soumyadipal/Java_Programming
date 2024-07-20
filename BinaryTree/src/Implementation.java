// Preorder traversal
public class Implementation {
    public static class Node {
        int val; // 0
        Node left; // null
        Node right; // null
        public Node(int val){
            this.val = val;
        }
    }
    public static void display(Node root){  // preorder display
        if(root == null) return;
        System.out.print(root.val + " -> ");
        if (root.left != null) System.out.print(root.left.val + ",");
        if (root.right != null) System.out.print(root.right.val);
        System.out.println();
        display(root.left);
        display(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(2);
        Node a = new Node(4);
        Node b = new Node(10);
        root.left = a;
        root.right = b;
        Node c = new Node(6);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(11);
        b.right = e;
        display(root);
    }
}
