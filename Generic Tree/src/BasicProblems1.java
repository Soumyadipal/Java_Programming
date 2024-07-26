import java.util.*;

// Q.1) Write a function to print ZigZag order traversal of a binary tree. A zigzag traversal stores the nodes levelwise.
 // The only difference is that nodes at even numbered levels will be printed in right to left fashion and the
 // ones at odd will be printed in left to right fashion. Consider the root node to be at level 1.
 // Output : 30
 //          63 11 5
 //          1 4 8 6 7 15 31 55 65

 // Q.2) Find the node with the maximum value in the given tree

public class BasicProblems1 {

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

    static void zigzagOrderTraversal(Node root){
        if (root == null)
            return;
        Queue<Node > q = new ArrayDeque<>();
        q.add(root);
        int level = 0;
        while (!q.isEmpty()) {
            int n = q.size();
            if(level % 2 == 0){
                while (n > 0) {
                    Node p = q.peek();
                    q.remove();
                    System.out.print(p.value + " ");
                    for (int i = 0; i < p.child.size(); i++)
                        q.add(p.child.get(i));
                    n--;
                }
            }
            else{
                Stack<Integer> st = new Stack<>();
                while (n > 0) {
                    Node p = q.remove();
                    st.push(p.value);
                    for (int i = 0; i < p.child.size(); i++)
                        q.add(p.child.get(i));
                    n--;
                }
                while(st.size() > 0){
                    System.out.print(st.pop() + " ");
                }
            }
            level++;
            System.out.println();
        }
    }

    public static int findMax(Node root){
        if(root.child.isEmpty()){
            return root.value;
        }
        int maxTillNow = root.value;
        int n = root.child.size();
        for (int i = 0;i < n;i++){
            int childMax = findMax(root.child.get(i));
            maxTillNow = Math.max(maxTillNow,childMax);
        }
        return maxTillNow;
    }

    public static void main(String[] args) {
        Node root = new Node(30);
        formTree(root);
        System.out.println("Zigzag order Traversal : ");
        zigzagOrderTraversal(root);
        System.out.println("The node with the maximum value in the given tree is : " + findMax(root));

    }
}
