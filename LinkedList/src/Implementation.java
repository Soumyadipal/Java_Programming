public class Implementation {
    public static class Node {
        int data;   // value
        Node next;  // address of next node
        Node(int data) {
            this.data = data;
        }
    }
    public static class linkedList {
        Node head = null;
        Node tail = null;
        int size = 0;
         void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            }
            else {
                tail.next = temp;
            }
            tail = temp;
            size++;
        }
        void insertAtBeginning(int val) {
             Node temp = new Node(val);
             if (head == null) {  // empty list
                 head = tail = temp;
                 // insertAtEnd(val);
             }
             else {                // not empty list
                 temp.next = head;
                 head = temp;
             }
             size++;
        }
        void insertAt(int idx,int val) {
             Node t = new Node(val);
             Node temp = head;
             if (idx == size()) {
                 insertAtEnd(val);
                 return;
             } else if (idx == 0) {
                 insertAtBeginning(val);
                 return;
             } else if (idx < 0 || idx > size()) {
                 System.out.println("Wrong index");
                 return;
             }
            for (int i = 1;i <= idx - 1;i++) {
                 temp = temp.next;
             }
             t.next = temp.next;
             temp.next = t;
             size++;
        }
        int getElementAt(int idx) {
            if (idx < 0 || idx > size()) {
                System.out.println("Wrong index");
                return -1;
            }
            Node temp = head;
            for (int i = 1;i <= idx;i++) {
                temp = temp.next;
            }
            return temp.data;
        }
        void deleteAt(int idx) {
             Node temp = head;
             if (idx == 0) {
                 head = head.next;
             } else if (idx == size - 1) {
                 tail = temp;
             }
             for (int i = 1;i <= idx - 1;i++) {
                 temp = temp.next;
             }
            temp.next = temp.next.next;
             size--;
        }
        void display() {
             Node temp = head;
             while (temp != null) {
                 System.out.print(temp.data + " ");
                 temp = temp.next;
             }
        }
        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.insertAtEnd(5);
        ll.insertAtEnd(8);
        ll.display();
        System.out.println();
        System.out.println(ll.size());
        ll.insertAtBeginning(1);
        ll.display();
        System.out.println();
        ll.insertAt(1,4);
        ll.display();
        System.out.println();
        System.out.println(ll.getElementAt(3));
        System.out.println(ll.size);
        ll.deleteAt(2);
        ll.display();
    }
}
