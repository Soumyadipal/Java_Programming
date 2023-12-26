import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {
    static void PriorityQueueExamples(){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(10);
        pq.add(7);
        pq.add(8);
        System.out.println(pq);
        System.out.println(pq.remove());
        System.out.println(pq.peek());
    }
    static void QueueExamples(){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        q.remove();
        System.out.println(q);
        System.out.println(q.peek());
    }
    public static void main(String[] args) {
        QueueExamples();
        PriorityQueueExamples();
    }
}
