import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class implementation {
    public static void formTree(Node root){
        root.child.add(new Node(5));
        root.child.add(new Node(11));
        root.child.add(new Node(63));
        root.child.get(0).child.add(new Node(1));
        root.child.get(0).child.add(new Node(4));
        root.child.get(0).child.add(new Node(8));
        root.child.get(1).child.add(new Node(6));
        root.child.get(1).child.add(new Node(7));
        root.child.get(1).child.add(new Node(15));
        root.child.get(2).child.add(new Node(31));
        root.child.get(2).child.add(new Node(55));
        root.child.get(2).child.add(new Node(65));
    }
    public static class Node{
        int value;
        List<Node> child = new ArrayList<>();

        Node(int value){
            this.value = value;
        }
    }

    static void preOrderTraversal(Node root){
        if(root.child.isEmpty()){
            System.out.print(root.value + " ");
            return;
        }
        System.out.print(root.value + " ");
        int n = root.child.size();
        for (int i = 0;i < n;i++){
            preOrderTraversal(root.child.get(i));
        }
    }

     static void postOrderTraversal(Node root){
         if(root.child.isEmpty()){
             System.out.print(root.value + " ");
             return;
         }
         int n = root.child.size();
         for (int i = 0;i < n;i++){
             postOrderTraversal(root.child.get(i));
         }
         System.out.print(root.value + " ");
     }

     static void levelOrderTraversal(Node root){
         Queue<Node> q = new LinkedList<>();
         q.add(root);
         while (!q.isEmpty()){
             Node currentNode = q.peek();
             System.out.print(currentNode.value + " ");
             q.remove();
             int noOfChildren = currentNode.child.size();
             for (int i = 0;i < noOfChildren;i++){
                 q.add(currentNode.child.get(i));
             }
         }
     }

    public static void main(String[] args) {
        Node root = new Node(30);
        formTree(root);
        System.out.print("Preorder Traversal : ");
        preOrderTraversal(root);
        System.out.println();
        System.out.print("Postorder Traversal : ");
        postOrderTraversal(root);
        System.out.println();
        System.out.print("LevelOrder(BFS) Traversal : ");
        levelOrderTraversal(root);
    }
}
