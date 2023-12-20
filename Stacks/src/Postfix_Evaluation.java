import java.util.Stack;

public class Postfix_Evaluation {
    public static void main(String[] args) {
        String postfix = "953+4*6/-";
        System.out.println(postfix);
        Stack<Integer> val = new Stack<>();
        for(int i = 0;i < postfix.length();i++){
            char ch = postfix.charAt(i);
            int ascii = (int)ch;
            if(ascii >= 48 && ascii <= 57){
                val.push(ch - '0');
            }
            else {
                int val2 = val.pop();
                int val1 = val.pop();
                if(ch == '+'){
                    val.push(val1 + val2);
                }
                if(ch == '-'){
                    val.push(val1 - val2);
                }
                if(ch == '*'){
                    val.push(val1 * val2);
                }
                if(ch == '/'){
                    val.push(val1 / val2);
                }
            }
        }
        System.out.println(val.peek());
    }
}
