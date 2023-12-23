import java.util.Deque;
import java.util.LinkedList;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
        dq.addLast(5);
        System.out.println(dq); // 1 2 3 4 5
        dq.addFirst(10);
        System.out.println(dq); // 10 1 2 3 4 5
        dq.removeLast();
        System.out.println(dq); // 10 1 2 3 4
        dq.removeFirst();
        System.out.println(dq); // 1 2 3 4
        System.out.println(dq.getFirst()); // 1
        System.out.println(dq.getLast()); // 4
        dq.add(8); // add last
        System.out.println(dq); // 1 2 3 4 8
        dq.remove(); // remove first
        System.out.println(dq); // 2 3 4 8
        dq.add(2);
        dq.add(5);
        dq.add(4);
        dq.add(10);
        System.out.println(dq); // 2 3 4 8 2 5 4 10
        dq.removeFirstOccurrence(2);
        System.out.println(dq); // 3 4 8 2 5 4 10
        dq.removeLastOccurrence(4);
        System.out.println(dq); // 3 4 8 2 5 10
        dq.removeAll(dq); // remove all
        System.out.println(dq); // []

    }
}
