import java.util.Stack;
import java.util.Scanner;
public class BasicOfStacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.println("Size of stack is : "+st.size());
        System.out.println(st);
        System.out.println(st.isEmpty());
        st.push(8);
        System.out.println(st.isEmpty());
        st.push(5);
        st.push(10);
        st.push(100);
        st.push(1);
        System.out.println(st.peek());
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println("Size of stack is : "+st.size());
        System.out.println(st.pop());
        while (st.size() > 1){
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st);

        // taking stack inputs from user
        Stack<Integer> st1 = new Stack<>();
        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements : ");
        for (int i = 1;i <= n;i++){
            int x = sc.nextInt();
            st1.push(x);
        }
        System.out.println(st1);
    }
}
