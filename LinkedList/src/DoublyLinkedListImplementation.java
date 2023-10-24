public class DoublyLinkedListImplementation {
    public static class Node {
        Node prev;
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }
    static void display(Node head) {
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    static void displayReverse(Node tail) {
        Node temp = tail;
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
    static void displayRandom(Node random) {
        Node temp = random;
        while (temp.prev != null){
            temp = temp.prev;
        }
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    static Node insertionAtHead(Node head,int x) {
        Node t = new Node(x);
        t.next = head;
        head.prev = t;
        head = t;
        return head;
    }
    static void insertAtTail(Node head,int x) {
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        Node t = new Node(x);
        temp.next = t;
        t.prev = temp;
    }
    static void insertAtIndex(Node head,int idx,int x) {
        Node s = head;
        for (int i = 1;i <= idx - 1;i++){
            s = s.next;
        }
        Node r = s.next;
        Node t = new Node(x);
        s.next = t;
        t.prev = s;
        t.next = r;
        r.prev = t;
    }
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        display(a);
        displayReverse(e);
        displayRandom(c);
        Node newHead = insertionAtHead(a,55);
        display(newHead);
        insertAtTail(a,88);
        display(a);
        insertAtIndex(a,3,5);
        display(a);
    }
}
