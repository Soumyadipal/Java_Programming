public class LinkedListImplementation {
    public static class Node{  // user defined data type
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class LLStack{  // user defined data structure
        private Node head = null;
        private int size = 0;
        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        int pop(){
            if(size == 0){
                System.out.println("Stack is empty!");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }
        int peek(){
            if(size == 0){
                System.out.println("Stack is empty!");
                return -1;
            }
            return head.val;
        }
        void displayRecursion(Node h){
            if(h == null){
                return;
            }
            displayRecursion(h.next);
            System.out.print(h.val + " ");
        }
        void display(){
            displayRecursion(head);
            System.out.println();
        }
        void displayReverse(){
            Node temp = head;
            while (temp != null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        int size(){  // getter
            return size;
        }
        boolean isEmpty(){
            if(size == 0){
                return true;
            }
            return false;
        }
    }
    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(4);
        st.display();  // 4
        st.push(5);
        st.display();  // 4 5
        st.push(1);
        st.display();  // 4 5 1
        System.out.println(st.peek());  // 1
        System.out.println(st.size());  // 3
        st.pop();
        st.display();  // 4 5
        System.out.println(st.size());  // 2
        st.pop();
        System.out.println(st.size());
        st.push(7);
        st.push(8);
        st.push(100);
        st.display();  // 4 7 8 100
    }
}
