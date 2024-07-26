import java.util.*;
// Q.1) Given a tree where every node contains variable number of children, convert the tree to its mirror.
public class BasicProblems2 {
     public static void formTree(Node root){
         root.child.add(new Node(2));
         root.child.add(new Node(34));
         root.child.add(new Node(56));
         root.child.add(new Node(100));
         root.child.get(2).child.add(new Node(1));
         root.child.get(3).child.add(new Node(7));
         root.child.get(3).child.add(new Node(8));
         root.child.get(3).child.add(new Node(9));
    }

    public static class Node{
        int value;
        List<Node> child = new ArrayList<>();

        Node(int value){
            this.value = value;
        }
    }

    static void levelOrderTraversal(Node root){
//        Queue<Node> q = new LinkedList<>();
//        q.add(root);
//        while (!q.isEmpty()){
//            Node currentNode = q.peek();
//            System.out.print(currentNode.value + " ");
//            q.remove();
//            int noOfChildren = currentNode.child.size();
//            for (int i = 0;i < noOfChildren;i++){
//                q.add(currentNode.child.get(i));
//            }
//        }

        if (root == null)
            return;
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        while (!q.isEmpty()) {
            int n = q.size();
            while (n > 0) {
                Node p = q.poll();
                System.out.print(p.value + " ");
                for (int i = 0; i < p.child.size(); i++)
                    q.add(p.child.get(i));
                n--;
            }
            System.out.println(); // Separator between levels
        }
    }
    public static void mirrorTree(Node root){
         if (root.child.isEmpty()) return;
         int noOfChildren = root.child.size();
         if (noOfChildren == 1) return;
         for (int i = 0;i < noOfChildren;i++){
             mirrorTree(root.child.get(i));
         }
        Collections.reverse(root.child);
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        formTree(root);
        System.out.println("Original tree is : ");
        levelOrderTraversal(root);
        System.out.println("Mirror of the tree is : ");
        mirrorTree(root);
        levelOrderTraversal(root);
    }
}
