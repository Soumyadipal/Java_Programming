import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BasicOfQueues2 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        // Q.1) Print all the elements present in given queue only using add(),remove(),peek(),size(),extra queue
//        Queue<Integer> helper = new ArrayDeque<>();
//        while (q.size() > 0){
//            System.out.print(q.peek() + " ");
//            helper.add(q.remove());
//        }
//        while (helper.size() > 0){
//            q.add(helper.poll());
//        }


        // Q.2) Reverse a queue
//        System.out.println(q);
//        Stack<Integer> st = new Stack<>();
//        while (q.size() > 0){
//            st.push(q.remove());
//        }
//        while (st.size() > 0){
//            q.add(st.pop());
//        }
//        System.out.println(q);


        // Q.3) Reverse first K elements of a queue
        int K = 3;
        System.out.println(q);
        Stack<Integer> st = new Stack<>();
        for(int i = 1;i <= K;i++){
            st.push(q.remove());
        }
        for(int i = 1;i <= K;i++){
            q.add(st.pop());
        }
        for(int i = 1;i <= q.size() - K;i++){
            q.add(q.remove());
        }
        System.out.println(q);
    }
}
