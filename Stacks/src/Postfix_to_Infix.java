import java.util.Stack;

public class Postfix_to_Infix {
    public static void main(String[] args) {
        String postfix = "953+4*6/-";
        System.out.println(postfix);
        Stack<String> val = new Stack<>();
        for(int i = 0;i < postfix.length();i++){
            char ch = postfix.charAt(i);
            int ascii = (int)ch;
            if(ascii >= 48 && ascii <= 57){
                String s = "" + ch;
                val.push(s);
            }
            else {
                String val2 = val.pop();
                String val1 = val.pop();
                String t = "(" + val1 + ch + val2 + ")";
                val.push(t);
            }
        }
        String infix = val.pop();
        System.out.println(infix);
    }
}
