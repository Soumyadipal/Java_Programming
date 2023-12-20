import java.util.*;
public class BasicOfStacks2 {
    public static void reverseStackUsingRecursion(Stack <Integer> st){
        if(st.size() == 1){
            return;
        }
        int top = st.pop();
        reverseStackUsingRecursion(st);
        pushAtBottomUsingRecursion(st,top);
    }
    public static void pushAtBottomUsingRecursion(Stack <Integer> st,int x){
        if(st.size() == 0){
            st.push(x);
            //System.out.print(x + " ");
            return;
        }
        int top = st.pop();
        pushAtBottomUsingRecursion(st,x);
        //System.out.print(top + " ");
        st.push(top);
    }
    public static void displayReverse(Stack <Integer> st){
        if(st.size() == 0){
            return;
        }
        int top = st.pop();
        System.out.print(top + " ");
        displayReverse(st);
        st.push(top);
    }
    public static void displayUsingRecursion(Stack <Integer> st){
        if(st.size() == 0){
            return;
        }
        int top = st.pop();
        displayUsingRecursion(st);
        System.out.print(top + " ");
        st.push(top);
    }
    public static void main(String[] args) {
        // Q.1) Copy stack
//        Stack<Integer> st = new Stack<>();
//        st.push(1);
//        st.push(2);
//        st.push(3);
//        st.push(4);
//        st.push(5);
//        System.out.println(st);
//        Stack<Integer> gt = new Stack<>();
//        while (st.size() > 0){
//            gt.push(st.pop());
//        }
//        Stack<Integer> rt = new Stack<>();
//        while (gt.size() > 0){
//            rt.push(gt.pop());
//        }
//        System.out.println(rt);

        // Q.2) Insert at bottom/any index
//        Stack<Integer> st = new Stack<>();
//        st.push(1);
//        st.push(2);
//        st.push(3);
//        st.push(4);
//        st.push(5);
//        System.out.println(st);
//        int idx = 3;
//        int x = 8;
//        Stack<Integer> rt = new Stack<>();
//        while (st.size() > 3) {
//            rt.push(st.pop());
//        }
//        st.push(x);
//        while (rt.size() > 0) {
//            st.push(rt.pop());
//        }
//        System.out.println(st);

        // alternate way using recursion
//        pushAtBottomUsingRecursion(st,x);
//        System.out.println(st);


        // Q.3) Display stack
//        Stack<Integer> st = new Stack<>();
//        st.push(1);
//        st.push(2);
//        st.push(3);
//        st.push(4);
//        st.push(5);
//        Stack<Integer> rt = new Stack<>();
//        while (st.size() > 0){
//            rt.push(st.pop());
//        }
//        while (rt.size() > 0){
//            int x = rt.pop();
//            System.out.print(x+" ");
//            st.push(x);
//        }
//        System.out.println(st);

        // alternate way
//        int n = st.size();
//        int [] arr = new int[n];
//        for (int i = n - 1;i >= 0;i--){
//            arr[i] = st.pop();
//        }
//        for(int i = 0;i < n;i++){
//            System.out.print(arr[i]+" ");
//            st.push(arr[i]);
//        }
//        System.out.println(st);
//
//        // alternate way using recursion

//        displayUsingRecursion(st);    // Time Complexity = O(n) and Space Complexity >= O(n)
//        System.out.println();
//
//        // display reverse using recursion
//        displayReverse(st);

          // Q.4) Reverse a stack using recursion
//        Stack<Integer> st = new Stack<>();
//        st.push(1);
//        st.push(2);
//        st.push(3);
//        st.push(4);
//        st.push(5);
//        System.out.println(st);
//        reverseStackUsingRecursion(st);
//        System.out.println(st);
//
        // Q.5) Remove from bottom or any index
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        Stack<Integer> rt = new Stack<>();
        while(st.size() > 1){
            rt.push(st.pop());
        }
        st.pop();
        while (rt.size() > 0){
            st.push(rt.pop());
        }
        System.out.println(st);
    }
}
