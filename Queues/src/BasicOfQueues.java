import java.util.LinkedList;
import java.util.Queue;

public class BasicOfQueues {
    public static class CircularQueueLinkedList{
        Node head = null;
        Node tail = null;
        int size = 0;
        public void add(int x){
            Node temp = new Node(x);
            if(size == 0){
                head = tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
            tail.next = head;
            size++;
        }
        public int peek(){
            if(size == 0){
                System.out.println("Queue is empty!");
                return -1;
            }
            return head.val;
        }
        public int remove(){
            if(size == 0){
                System.out.println("Queue is empty!");
                return -1;
            }
            int x = head.val;
            head = head.next;
            tail.next = head;
            size--;
            return x;
        }
        public void display(){
            if(size == 0){
                System.out.println("Queue is empty!");
            }
            else{
                Node temp = head;
                // alternative way of print circular linked list
//                do{
//                    System.out.print(temp.val + " ");
//                    temp = temp.next;
//                }
//                while (temp != head);
//                System.out.println();
                while (temp.next != head){
                    System.out.print(temp.val + " ");
                    temp = temp.next;
                }
                System.out.print(temp.val);
                System.out.println();
            }
        }
        public boolean isEmpty(){
            if(size == 0){
                return true;
            }
            return false;
        }
    }
    public static class CircularQueueArray{
        int front = -1;
        int rear = -1;
        int size = 0;
        int [] arr = new int[5];
        public void add(int val) throws Exception{
            if(size == arr.length){
                throw new Exception("Queue is full!");
            } else if (size == 0) {
                front = rear = 0;
                arr[0] = val;
            } else if (rear < arr.length - 1) {
                arr[++rear] = val;
            } else if (rear == arr.length - 1) {
                rear = 0;
                arr[0] = val;
            }
            size++;
        }
        public int remove() throws Exception{
            if(size == 0){
                throw new Exception("Queue is empty!");
            }else {
                int val = arr[front];
                if(front == arr.length - 1){
                    front = 0;
                }
                else{
                    front++;
                }
                size--;
                return val;
            }
        }
        public int peek() throws Exception{
            if(size == 0){
                throw new Exception("Queue is empty!");
            }else {
                return arr[front];
            }
        }
        public void display(){
            if(size == 0){
                System.out.println("Queue is empty!");
                return;
            }
            else if(front <= rear){
                for (int i = front;i <= rear;i++){
                    System.out.print(arr[i] + " ");
                }
            }
            else{
                for(int i = front;i < arr.length;i++){
                    System.out.print(arr[i] + " ");
                }
                for(int i = 0; i <= rear;i++){
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
        public boolean isEmpty(){
            if(size == 0) return true;
            return false;
        }
    }
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class queueLinkedList{
        Node head = null;
        Node tail = null;
        int size = 0;
        public void add(int x){
            Node temp = new Node(x);
            if(size == 0){
                head = tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
        public int peek(){
            if(size == 0){
                System.out.println("Queue is empty!");
                return -1;
            }
            return head.val;
        }
        public int remove(){
            if(size == 0){
                System.out.println("Queue is empty!");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }
        public void display(){
            if(size == 0){
                System.out.println("Queue is empty!");
            }
            else{
                Node temp = head;
                while (temp != null){
                    System.out.print(temp.val + " ");
                    temp = temp.next;
                }
                System.out.println();
            }
        }
        public boolean isEmpty(){
            if(size == 0){
                return true;
            }
            return false;
        }
    }
    public static class queueArray{
        private int front = -1;
        private int rear = -1;
        int size = 0;
        private int [] arr = new int[100];
        public void add(int val){
            if(rear == arr.length - 1){
                System.out.println("Queue is full!");
                return;
            }
            if(front == -1){
                front = rear = 0;;
                arr[0] = val;
            }
            else {
                arr[++rear] = val;
            }
            size++;
        }
        public int remove(){
            if(size == 0){
                System.out.println("Queue is empty!");
                return -1;
            }
            front++;
            size--;
            return arr[front - 1];
        }
        public int peek(){
            if(size == 0){
                System.out.println("Queue is empty!");
                return -1;
            }
            return arr[front];
        }
        public boolean isEmpty(){
            if(size == 0){
                return true;
            }
            return false;
        }
        public void display(){
            if(size == 0){
                System.out.println("Queue is empty!");
            }
            else {
                for(int i = front;i <= rear;i++){
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) throws Exception{
        Queue<Integer> q = new LinkedList<>();
        System.out.println(q.isEmpty()); // true
        System.out.println(q.size());  // 0
        q.add(1);  // 1
        q.add(2);  // 1 2
        q.add(3);  // 1 2 3
        q.add(4);  // 1 2 3 4
        q.add(5);  // 1 2 3 4 5
        System.out.println(q);  // [1,2,3,4,5]
        System.out.println(q.isEmpty());  // false
        System.out.println(q.size()); // 5
        q.remove();  // remove front element
        System.out.println(q); // [2,3,4,5]
        System.out.println(q.peek());  // return front element
        q.poll();   // remove front element
        System.out.println(q);  // [3,4,5]
        System.out.println(q.element()); // return front element

        //----------Array implementation of Queue-----------------------------
        System.out.println("--------------------------Array implementation of Queue-----------------------------");
        queueArray q1 = new queueArray();
        q1.display();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.display();
        q1.remove();
        q1.display();
        System.out.println(q1.peek());
        System.out.println(q1.size);


        //----------LinkedList implementation of Queue-----------------------------
        System.out.println("--------------------------LinkedList implementation of Queue-----------------------------");
        queueLinkedList q2 = new queueLinkedList();
        q2.display();
        q2.add(1);
        q2.add(2);
        q2.add(3);
        q2.add(4);
        q2.display();
        q2.remove();
        q2.display();
        System.out.println(q2.peek());
        System.out.println(q2.size);


        //-----------------------Implementation to CircularQueue--------------------------------------------
        System.out.println("-----------------------Implementation to CircularQueue--------------------------------------------");
        CircularQueueArray q3 = new CircularQueueArray();
        q3.display();
        q3.add(1);
        q3.add(2);
        q3.add(3);
        q3.add(4);
        q3.display();  // 1 2 3 4
        q3.remove();
        q3.display();  //   2 3 4
        q3.add(5);
        q3.display();  //   2 3 4 5
        q3.add(8);
        q3.display();  // 8 2 3 4 5 -> 2 3 4 5 8
        System.out.println(q3.peek());
        //q3.add(10);
        for (int i = 0;i < q3.arr.length;i++){
            System.out.print(q3.arr[i] + " ");
        }


        //-----------------------------Linked List implementation of Circular Queue-------------------------------
        System.out.println("-----------------------------Linked List implementation of Circular Queue-------------------------------");
        CircularQueueLinkedList q4 = new CircularQueueLinkedList();
        q4.display();
        q4.add(1);
        q4.add(2);
        q4.add(3);
        q4.add(4);
        q4.display();
        q4.remove();
        q4.display();
        System.out.println(q4.peek());
        System.out.println(q4.size);
    }
}
