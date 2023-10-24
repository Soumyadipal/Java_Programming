// Q.1) Can we delete a node given the node itself as parameter?
// Is there any efficient way,provided that the given node is not the last node?

// Q.2) Finding Nth Node from the end of Linked List

// Q.3) Removing Nth Node from the end of Linked List

// Q.4) Finding intersection of two linked lists
// Two pointers to the rescue...

// Q.5) Finding middle element of a linked list

// Q.6) Deleting the middle element of the linked list

// Q.7) Check a Linked List is cyclic or not.

// Q.8) Find out the node where the cycle begins, i.e. the node at which the tail node points.
public class ProblemsOnLinkedList1 {
    public static class Node {
        int data;   // value
        Node next;  // address of next node
        Node(int data) {
            this.data = data;
        }
    }
    static void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    static void deleteNode(Node t) {  // Q.1
        t.data = t.next.data;         // Q.1
        t.next = t.next.next;         // Q.1
    }                                 // Q.1
    static Node nthNodeFromEnd(Node head,int n) {  // Q.2
        int size = 0;                              // Q.2
        Node temp = head;                          // Q.2
        while (temp != null) {                     // Q.2
            size++;                                // Q.2
            temp = temp.next;                      // Q.2
        }                                          // Q.2
        int position = size - n + 1;               // Q.2
        temp = head;                               // Q.2
        for (int i = 1;i <= position - 1;i++){     // Q.2
            temp = temp.next;                      // Q.2
        }                                          // Q.2
        return temp;                               // Q.2
    }                                              // Q.2
    static Node nthNodeFromEndUsing1Traversal(Node head,int n) {  // Q.2(alternative efficient approach by 1 traversal)
        Node slow = head;                                         // Q.2(alternative efficient approach by 1 traversal)
        Node fast = head;                                         // Q.2(alternative efficient approach by 1 traversal)
        for (int i = 1;i <= n;i++) {                              // Q.2(alternative efficient approach by 1 traversal)
            fast = fast.next;                                     // Q.2(alternative efficient approach by 1 traversal)
        }                                                         // Q.2(alternative efficient approach by 1 traversal)
        while (fast != null) {                                    // Q.2(alternative efficient approach by 1 traversal)
            slow = slow.next;                                     // Q.2(alternative efficient approach by 1 traversal)
            fast = fast.next;                                     // Q.2(alternative efficient approach by 1 traversal)
        }                                                         // Q.2(alternative efficient approach by 1 traversal)
        return slow;                                              // Q.2(alternative efficient approach by 1 traversal)
    }                                                             // Q.2(alternative efficient approach by 1 traversal)
    static Node removingNthNodeFromEnd(Node head,int n) {     // Q.3
        Node slow = head;                                     // Q.3
        Node fast = head;                                     // Q.3
        for (int i = 1;i <= n;i++) {                          // Q.3
            fast = fast.next;                                 // Q.3
        }                                                     // Q.3
        if (fast == null) {                                   // Q.3
            head = head.next;                                 // Q.3
            return head;                                      // Q.3
        }                                                     // Q.3
        while (fast.next != null) {                           // Q.3
            slow = slow.next;                                 // Q.3
            fast = fast.next;                                 // Q.3
        }                                                     // Q.3
        slow.next = slow.next.next;                           // Q.3
        return head;                                          // Q.3
    }                                                         // Q.3
    static Node getIntersectionNode(Node headA,Node headB) {   // Q.4
        Node tempA = headA;                                    // Q.4
        Node tempB = headB;                                    // Q.4
        int lengthA = 0;                                       // Q.4
        while(tempA != null) {                                 // Q.4
            lengthA++;                                         // Q.4
            tempA = tempA.next;                                // Q.4
        }                                                      // Q.4
        int lengthB = 0;                                       // Q.4
        while(tempB != null) {                                 // Q.4
            lengthB++;                                         // Q.4
            tempB = tempB.next;                                // Q.4
        }                                                      // Q.4
        tempA = headA;                                         // Q.4
        tempB = headB;                                         // Q.4
        if(lengthA > lengthB) {                                // Q.4
            int steps = lengthA - lengthB;                     // Q.4
            for(int i = 1;i <= steps;i++) {                    // Q.4
                tempA = tempA.next;                            // Q.4
            }                                                  // Q.4
        }                                                      // Q.4
        else{                                                  // Q.4
            int steps = lengthB - lengthA;                     // Q.4
            for(int i = 1;i <= steps;i++) {                    // Q.4
                tempB = tempB.next;                            // Q.4
            }                                                  // Q.4
        }                                                      // Q.4
        while(tempA != tempB) {                                // Q.4
            tempA = tempA.next;                                // Q.4
            tempB = tempB.next;                                // Q.4
        }                                                      // Q.4
        return tempA;                                          // Q.4
    }                                                          // Q.4
    static Node getMiddleNode(Node head) {                // Q.5
        Node slow = head;                                 // Q.5
        Node fast = head;                                 // Q.5
        while(fast != null && fast.next != null) {        // Q.5
            slow = slow.next;                             // Q.5
            fast = fast.next.next;                        // Q.5
        }                                                 // Q.5
        return slow;                                      // Q.5
    }                                                     // Q.5
    static Node deleteMiddleNode(Node head) {            // Q.6
        if(head.next == null) {  // single element list  // Q.6
            return null;                                 // Q.6
        }                                                // Q.6
        Node slow = head;                                // Q.6
        Node fast = head;                                // Q.6
        while(fast.next.next != null && fast.next.next.next != null) {  // Q.6
            slow = slow.next;                            // Q.6
            fast = fast.next.next;                       // Q.6
        }                                                // Q.6
        slow.next = slow.next.next;                      // Q.6
        return head;                                     // Q.6
    }                                                    // Q.6
    static boolean hasCycle(Node head) {         // Q.7
        if(head == null) {                       // Q.7
            return false;                        // Q.7
        }                                        // Q.7
        if(head.next == null) {                  // Q.7
            return false;                        // Q.7
        }                                        // Q.7
        Node slow = head;                        // Q.7
        Node fast = head;                        // Q.7
        while(fast != null) {                    // Q.7
            if(slow == null) {                   // Q.7
                return false;                    // Q.7
            }                                    // Q.7
            slow = slow.next;                    // Q.7
            if(fast.next == null) {              // Q.7
                return false;                    // Q.7
            }                                    // Q.7
            fast = fast.next.next;               // Q.7
            if(slow == fast) {                   // Q.7
                return true;                     // Q.7
            }                                    // Q.7
        }                                        // Q.7
        return false;                            // Q.7
    }                                            // Q.7
    static Node detectCycle(Node head) {         // Q.8
        Node slow = head;                        // Q.8
        Node fast = head;                        // Q.8
        while(fast != null){                     // Q.8
            slow = slow.next;                    // Q.8
            if(fast.next == null){               // Q.8
                return null;                     // Q.8
            }                                    // Q.8
            fast = fast.next.next;               // Q.8
            if(slow == fast) {                   // Q.8
                break;                           // Q.8
            }                                    // Q.8
        }                                        // Q.8
        Node temp = head;                        // Q.8
        while(temp != slow) {                    // Q.8
            temp = temp.next;                    // Q.8
            if(slow == null){                    // Q.8
                return null;                     // Q.8
            }                                    // Q.8
            slow = slow.next;                    // Q.8
        }                                        // Q.8
        return slow;                             // Q.8
    }                                            // Q.8


    public static void main(String[] args) {
        Node a = new Node(4); // head Node
        Node b = new Node(5);
        Node c = new Node(1);
        Node d = new Node(9);
        Node e = new Node(8);
        Node f = new Node(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        display(a);
        //deleteNode(c);  // Q.1
        //display(a);     // Q.1
        Node ans1 = nthNodeFromEnd(a,3);  // Q.2
        System.out.println(ans1.data);       // Q.2
        Node ans2 = nthNodeFromEndUsing1Traversal(a,3);   // Q.2(alternative efficient approach by 1 traversal)
        System.out.println(ans2.data);                       // Q.2(alternative efficient approach by 1 traversal)
       // a = removingNthNodeFromEnd(a,1);      // Q.3
       // display(a);                              // Q.3
        Node a1 = new Node(4); // head Node1    // Q.4
        Node b1 = new Node(1);                  // Q.4
        Node c1 = new Node(8);                  // Q.4
        Node d1 = new Node(4);                  // Q.4
        Node e1 = new Node(5);                  // Q.4
        Node a2 = new Node(5); // head Node2    // Q.4
        Node b2 = new Node(6);                  // Q.4
        a1.next = b1;                                // Q.4
        b1.next = c1;                                // Q.4
        c1.next = d1;                                // Q.4
        d1.next = e1;                                // Q.4
        a2.next = b2;                                // Q.4
        b2.next = b1;                                // Q.4
        Node intersectionNode = getIntersectionNode(a1,a2); // Q.4
        System.out.println(intersectionNode.data);   // Q.4
        Node middleNode = getMiddleNode(a);                               // Q.5
        System.out.println("value of middle node is : "+middleNode.data); // Q.5
        Node DeletingMiddleElement = deleteMiddleNode(a);   // Q.6
        display(DeletingMiddleElement);                     // Q.6
        Node cyc1 = new Node(3); // head Node    // Q.7 & Q.8
        Node cyc2 = new Node(2);                 // Q.7 & Q.8
        Node cyc3 = new Node(0);                 // Q.7 & Q.8
        Node cyc4 = new Node(-4);                // Q.7 & Q.8
        Node cyc5 = new Node(8);                 // Q.7 & Q.8
        Node cyc6 = new Node(5);                 // Q.7 & Q.8
        cyc1.next = cyc2;                             // Q.7 & Q.8
        cyc2.next = cyc3;                             // Q.7 & Q.8
        cyc3.next = cyc4;                             // Q.7 & Q.8
        cyc4.next = cyc5;                             // Q.7 & Q.8
        cyc5.next = cyc6;                             // Q.7 & Q.8
        cyc6.next = cyc2;                             // Q.7 & Q.8
        System.out.println("The Linked List is cyclic : " + hasCycle(cyc1));  // Q.7
        Node cyclebeginsNode = detectCycle(cyc1);                              // Q.8
        System.out.println("The cycle begins at : "+cyclebeginsNode.data);     // Q.8
    }
}
