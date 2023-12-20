import java.util.Stack;

public class Prefix_Evaluation {
    public static void main(String[] args) {
        String prefix = "-9/*+5346";
        System.out.println(prefix);
        Stack<Integer> val = new Stack<>();
        for(int i = prefix.length() - 1;i >= 0;i--){
            char ch = prefix.charAt(i);
            int ascii = (int)ch;
            if(ascii >= 48 && ascii <= 57){
                val.push(ch - '0');
            }
            else {
                int val2 = val.pop();
                int val1 = val.pop();
                if(ch == '+'){
                    val.push(val2 + val1);
                }
                if(ch == '-'){
                    val.push(val2 - val1);
                }
                if(ch == '*'){
                    val.push(val2 * val1);
                }
                if(ch == '/'){
                    val.push(val2 / val1);
                }
            }
        }
        System.out.println(val.peek());
    }
}
