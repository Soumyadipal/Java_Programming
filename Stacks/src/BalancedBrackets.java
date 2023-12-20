 // Q.1) Check whether a given bracket sequence is balanced or not.
 // Q.2) Find the minimum number of brackets that we need to remove to make the given bracket sequence balanced.
import java.util.*;
public class BalancedBrackets {
    public static int minimumNumberOfBracketsRemove(String str){  // Q.2
        Stack<Character> st = new Stack<>();
        int n = str.length();
        int ans = 0;
        for(int i = 0;i < n;i++){
            char ch = str.charAt(i);
            if(ch == '('){
                st.push(ch);
            }
            else{
                if(st.size() == 0){
                    ans++;
                } else if (st.peek() == '(') {
                    st.pop();
                }
            }
        }
        return ans+st.size();
    }
    public static boolean isBalanced(String str){  // Q.1
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for(int i = 0;i < n;i++){
            char ch = str.charAt(i);
            if(ch == '('){
                st.push(ch);
            }
            else{
                if(st.size() == 0){
                    return false;
                } else if (st.peek() == '(') {
                    st.pop();
                }
            }
        }
        if(st.size() == 0){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isBalanced(str));  // Q.1
        System.out.println("Minimum number of brackets that we need to remove is : "+minimumNumberOfBracketsRemove(str));  // Q.2
    }
}
