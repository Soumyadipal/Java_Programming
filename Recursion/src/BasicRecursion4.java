import java.util.*;
// Q.1) There are N stones, numbered 0,1,2,....N-1.For each i (0 <=i <N), the height of stone i is hi.
// There is a frog who is initially on stone 0. He will repeat the following action some number of times to reach
// Stone N-1:
// If the frog is currently on Stone i, jump to Stone i+1 or Stone i+2.
// Here, a cost of |hi-hj| is incurred, where j is the stone to land on.
// Find the minimum possible total cost incurred before the frog reaches Stone N-1.
// Input : n = 4
// arr[] = 10 30 40 20
// Output : 30
public class BasicRecursion4 {
//    static int best(int [] h,int n,int idx) {
//        if (idx == n - 1)
//            return 0;
//        int op1 = Math.abs(h[idx] - h[idx + 1]) + best(h,n,idx + 1);
//        if (idx == n - 2)
//            return op1;
//        int op2 = Math.abs(h[idx] - h[idx + 2]) + best(h,n,idx + 2);
//        return Math.min(op1,op2);
//    }
//    public static void main(String[] args) {
//        int [] h = {10,30,40,20};
//        System.out.println(best(h,h.length,0));
//    }
}

// Q.2) Given a string containing digits 2-9 inclusive, return all possible letter combinations that the number
// could represent. Return the answer in any order. Like keypad mobile : 2->(a,b,c)  3->(d,e,f)  4->(g,h,i)
// 5->(j,k,l)  6->(m,n,o)  7->(p,q,r,s)  8->(t,u,v)  9->(w,x,y,z)
// Input : digits = "23"
// Output : ["ad","ae","af","bd","be","bf","cd","ce","cf"]
class keypadNumbering {
    static void combination(String dig,String [] kp,String res) {
        if (dig.length() == 0){
            System.out.print(res + " ");
            return;
        }
        int currNum = dig.charAt(0) - '0';
        String currChoices = kp[currNum];
        for (int i = 0;i < currChoices.length();i++) {
            combination(dig.substring(1),kp,res + currChoices.charAt(i));
        }
    }
    public static void main(String[] args) {
        String dig = "253";
        String [] kp = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        combination(dig,kp,"");
    }
}
