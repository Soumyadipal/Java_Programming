public class BasicOfLinkedList {
    static void insertAtEnd(Node head,int val) {
        Node temp = new Node(val);
        Node t = head;
        while (t.next != null) {
            t = t.next;
        }
        t.next = temp;
    }
    static int length(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    static void displayByRecursionInReverseOrder(Node head) {
        if (head == null)
            return;
        displayByRecursionInReverseOrder(head.next);
        System.out.print(head.data + " ");
    }
    static void displayByRecursion(Node head) {
        if (head == null)
            return;
        System.out.print(head.data + " ");
        displayByRecursion(head.next);
    }
    static void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static class Node {
        int data;   // value
        Node next;  // address of next node
        Node(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5); // head Node
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);  // tail Node
        // 5 3 9 8 16
        a.next = b;  // 5 -> 3 9 8 16
        b.next = c;  // 5 -> 3 -> 9 8 16
        c.next = d;  // 5 -> 3 -> 9 -> 8 16
        d.next = e;  // 5 -> 3 -> 9 -> 8 -> 16
        System.out.println(a.data);  // 5
        System.out.println(a.next);  // BasicOfLinkedList$Node@7b23ec81
        System.out.println(b);       // BasicOfLinkedList$Node@7b23ec81
        System.out.println(c);
        System.out.println(d.data);
        System.out.println(d.next);
        System.out.println(e);
        // Printing all values of Linked List using for loop
        Node temp1 = a;
        for (int i = 1;i <=5;i++) {
            System.out.print(temp1.data + " ");
            temp1 = temp1.next;
        }
        System.out.println();
        // Printing all values of Linked List using while loop
        Node temp2 = a;
        while (temp2 != null) {
            System.out.print(temp2.data + " ");
            temp2 = temp2.next;
        }
        System.out.println();
        // Printing all values of Linked List using display method
        display(a);
        System.out.println();
        // Printing all values of Linked List using recursion
        displayByRecursion(a);
        System.out.println();
        // Printing all values of Linked List in reverse order
        displayByRecursionInReverseOrder(a);
        System.out.println();
        // Find the length of the Linked List
        System.out.println("The length of the Linked List is : "+length(a));
        insertAtEnd(a,55);
        display(a);
    }
}
