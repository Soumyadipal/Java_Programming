import java.util.Stack;

public class Conversion_Of_Prefix_To_Postfix {
    public static void main(String[] args) {
        String prefix = "-9/*+5346";
        System.out.println(prefix);
        Stack<String> val = new Stack<>();
        for(int i = prefix.length() - 1;i >= 0;i--){
            char ch = prefix.charAt(i);
            int ascii = (int)ch;
            if(ascii >= 48 && ascii <= 57){
                String s = "" + ch;
                val.push(s);
            }
            else {
                String val1 = val.pop();
                String val2 = val.pop();
                String t = val1 + val2 + ch;
                val.push(t);
            }
        }
        String postfix = val.pop();
        System.out.println(postfix);
    }
}
