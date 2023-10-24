// Q.1) Merge two sorted Linked List

// Q.2) Given a Linked List, split it into two lists such that one contains odd values, while the other contains even values

// Q.3) Reverse a Linked List and return its new head using recursion

// Q.4) Reverse a Linked List and return its new head using iteration and 3 pointers

// Q.5) Check whether a linked list is Palindrome or not

// Q.6) Find the maximum twin sum of a linked list of even length.
// Twin of any node at (i)th index is the node at (n-i-1)th index.Twin sum is the sum of values of a node and its twin.

public class ProblemsOnLinkedList2 {
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
    static Node mergeTwoListsUsingExtraSpace(Node list1, Node list2) {
        Node temp1 = list1;
        Node temp2 = list2;
        Node head = new Node(5);
        Node temp = head;
        while(temp1 != null && temp2 != null){
            if(temp1.data <= temp2.data){
                Node a = new Node(temp1.data);
                temp.next = a;
                temp = a;
                temp1 = temp1.next;
            }
            else{
                Node a = new Node(temp2.data);
                temp.next = a;
                temp = a;
                temp2 = temp2.next;
            }
        }
        if(temp1 == null){
            temp.next = temp2;
        }
        else{
            temp.next = temp1;
        }
        return head.next;
    }
    static Node mergeTwoListsWithoutUsingExtraSpace(Node list1, Node list2) {
        Node t1 = list1;
        Node t2 = list2;
        Node h = new Node(5);
        Node t = h;
        while(t1 != null && t2 != null){
            if(t1.data <= t2.data){
                t.next = t1;
                t = t1;
                t1 = t1.next;
            }
            else{
                t.next = t2;
                t = t2;
                t2 = t2.next;
            }
        }
        if(t1 == null){
            t.next = t2;
        }
        else{
            t.next = t1;
        }
        return h.next;
    }
    static void SplitOddEvenList(Node head) {
        Node temp = head;
        Node OddList = new Node(-1);
        Node tempOdd = OddList;
        Node EvenList = new Node(0);
        Node tempEven = EvenList;
        while(temp != null){
            if(temp.data % 2 != 0){
                Node a = new Node(temp.data);
                tempOdd.next = a;
                tempOdd = a;
                temp = temp.next;
            }
            else{
                Node a = new Node(temp.data);
                tempEven.next = a;
                tempEven = a;
                temp = temp.next;
            }
        }
        System.out.print("The Odd values list is : ");
        display(OddList.next);
        System.out.print("The Even values list is : ");
        display(EvenList.next);
    }
    static Node reverseLinkedListUsingRecursion(Node head){   // Time complexity -> O(n)  & Space complexity -> O(n)
        if(head.next == null)
            return head;
        Node newHead = reverseLinkedListUsingRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    static Node reverseLinkedListUsingIteration(Node head){
        Node current = head;
        Node previous = null;
        Node after = null;
        while(current != null){
            after = current.next;
            current.next = previous;
            previous = current;
            current = after;
        }
        return previous;
    }
    static boolean isPalindrome(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node temp = reverseLinkedListUsingIteration(slow.next);
        slow.next = temp;
        Node p1 = head;
        Node p2 = slow.next;
        while(p2 != null){
            if(p1.data != p2.data){
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }
    static int maxTwinSum(Node head) {
        int maximumSum = Integer.MIN_VALUE;
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node temp = reverseLinkedListUsingIteration(slow.next);
        slow.next = temp;
        Node p1 = head;
        Node p2 = slow.next;
        while(p2 != null){
            if(p1.data + p2.data > maximumSum){
                maximumSum = p1.data + p2.data;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return maximumSum;
    }
    public static void main(String[] args) {
        Node a1 = new Node(1); // head Node  // Q.1
        Node b1 = new Node(3);               // Q.1
        Node c1 = new Node(5);               // Q.1
        Node d1 = new Node(8);               // Q.1
        Node e1 = new Node(9);               // Q.1
        a1.next = b1;                             // Q.1
        b1.next = c1;                             // Q.1
        c1.next = d1;                             // Q.1
        d1.next = e1;                             // Q.1
        System.out.print("List1 is : ");          // Q.1
        display(a1);                              // Q.1
        Node a2 = new Node(2); // head Node  // Q.1
        Node b2 = new Node(4);               // Q.1
        Node c2 = new Node(6);               // Q.1
        Node d2 = new Node(7);               // Q.1
        a2.next = b2;                             // Q.1
        b2.next = c2;                             // Q.1
        c2.next = d2;                             // Q.1
        System.out.print("List2 is : ");          // Q.1
        display(a2);                              // Q.1
        System.out.print("The sorted list with extra space is : ");  // Q.1
        display(mergeTwoListsUsingExtraSpace(a1,a2));                // Q.1
        System.out.print("The sorted list without extra space is : ");  // Q.1
        display(mergeTwoListsWithoutUsingExtraSpace(a1,a2));         // Q.1
        Node a = new Node(3); // head Node  // Q.2
        Node b = new Node(5);               // Q.2
        Node c = new Node(4);               // Q.2
        Node d = new Node(1);               // Q.2
        Node e = new Node(2);               // Q.2
        Node f = new Node(8);               // Q.2
        Node g = new Node(10);               // Q.2
        Node h = new Node(13);               // Q.2
        a.next = b;                             // Q.2
        b.next = c;                             // Q.2
        c.next = d;                             // Q.2
        d.next = e;                             // Q.2
        e.next = f;                             // Q.2
        f.next = g;                             // Q.2
        g.next = h;                             // Q.2
        System.out.print("The input list is : "); // Q.2
        display(a);                               // Q.2
        SplitOddEvenList(a);                      // Q.2
        // System.out.print("The reverse list using recursion is : ");  // Q.3
        //Node reverseHead1 = reverseLinkedListUsingRecursion(a);       // Q.3
        //display(reverseHead1);                                        // Q.3
        //System.out.print("The reverse list using iteration is : ");  // Q.4
        //Node reverseHead2 = reverseLinkedListUsingIteration(a);      // Q.4
        //display(reverseHead2);                                       // Q.4
        //System.out.println("The Linked List is Palindrome : "+isPalindrome(a));  // Q.5
        System.out.println("The  maximum twin is : "+maxTwinSum(a));               // Q.6
    }
}
