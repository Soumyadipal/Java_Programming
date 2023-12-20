import java.util.Stack;

public class InfixToPrefix {
    public static void main(String[] args) {
        String infix = "9-(5+3)*4/6";
        System.out.println(infix);
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i = 0;i < infix.length();i++){
            char ch = infix.charAt(i);
            int ascii = (int)ch;
            if(ascii >= 48 && ascii <= 57){  // '0' -> 48  '9' -> 57
                String s = "" + ch;
                val.push(s);
            } else if (op.size() == 0 || ch == '(' || op.peek() == '(') {
                op.push(ch);
            } else if (ch == ')') {
                while (op.peek() != '('){
                    String val2 = val.pop();
                    String val1 = val.pop();
                    char operator = op.pop();
                    String t = operator + val1 + val2;
                    val.push(t);
                }
                op.pop();  // '(' hata diya
            } else{
                if(ch == '+' || ch == '-'){
                    // work
                    String val2 = val.pop();
                    String val1 = val.pop();
                    char operator = op.pop();
                    String t = operator + val1 + val2;
                    val.push(t);
                    op.push(ch);
                }
                if(ch == '*' || ch == '/'){
                    if(op.peek() == '*' || op.peek() == '/'){
                        // work
                        String val2 = val.pop();
                        String val1 = val.pop();
                        char operator = op.pop();
                        String t = operator + val1 + val2;
                        val.push(t);
                        op.push(ch);
                    }
                    else{
                        op.push(ch);
                    }
                }
            }
        }
        while (val.size() > 1){
            String val2 = val.pop();
            String val1 = val.pop();
            char operator = op.pop();
            String t = operator + val1 + val2;
            val.push(t);
        }
        String prefix = val.pop();
        System.out.println(prefix);
    }
}
