import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class ListInterface {
    static void StackExample(){
        Stack<String> st = new Stack<>();
        st.push("Soumyadip");
        st.push("Pal");
        st.push("Virat");
        st.push("Gill");
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println(st.peek());
    }
    static void LinkedListExamples(){
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        System.out.println(ll);
        System.out.println(ll.get(1));
        ll.set(2,10);
        System.out.println(ll);
        System.out.println(ll.contains(10));
    }
    static void ArrayListExamples(){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println(al);
        System.out.println(al.get(1));
        al.set(2,10);
        System.out.println(al);
        System.out.println(al.contains(10));
    }
    public static void main(String[] args) {
        ArrayListExamples();
        LinkedListExamples();
        StackExample();
    }
}
