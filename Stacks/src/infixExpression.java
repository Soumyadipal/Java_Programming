import java.util.*;
public class infixExpression {
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i = 0;i < str.length();i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii >= 48 && ascii <= 57){  // '0' -> 48  '9' -> 57
                val.push(ch - '0');
            } else if (op.size() == 0 || ch == '(' || op.peek() == '(') {
                op.push(ch);
            } else if (ch == ')') {
                while (op.peek() != '('){
                    int val2 = val.pop();
                    int val1 = val.pop();
                    if(op.peek() == '+'){
                        val.push(val1 + val2);
                    }
                    if(op.peek() == '-'){
                        val.push(val1 - val2);
                    }
                    if(op.peek() == '*'){
                        val.push(val1 * val2);
                    }
                    if(op.peek() == '/'){
                        val.push(val1 / val2);
                    }
                    op.pop();
                }
                op.pop();  // '(' hata diya
            } else{
                if(ch == '+' || ch == '-'){
                    // work
                    int val2 = val.pop();
                    int val1 = val.pop();
                    if(op.peek() == '+'){
                        val.push(val1 + val2);
                    }
                    if(op.peek() == '-'){
                        val.push(val1 - val2);
                    }
                    if(op.peek() == '*'){
                        val.push(val1 * val2);
                    }
                    if(op.peek() == '/'){
                        val.push(val1 / val2);
                    }
                    op.pop();
                    op.push(ch);
                }
                if(ch == '*' || ch == '/'){
                    if(op.peek() == '*' || op.peek() == '/'){
                        // work
                        int val2 = val.pop();
                        int val1 = val.pop();
                        if(op.peek() == '*'){
                            val.push(val1 * val2);
                        }
                        if(op.peek() == '/'){
                            val.push(val1 / val2);
                        }
                        op.pop();
                        op.push(ch);
                    }
                    else{
                        op.push(ch);
                    }
                }
            }
        }
        while (val.size() > 1){
            int val2 = val.pop();
            int val1 = val.pop();
            if(op.peek() == '+'){
                val.push(val1 + val2);
            }
            if(op.peek() == '-'){
                val.push(val1 - val2);
            }
            if(op.peek() == '*'){
                val.push(val1 * val2);
            }
            if(op.peek() == '/'){
                val.push(val1 / val2);
            }
            op.pop();
        }
        System.out.println(val.peek());
    }
}
