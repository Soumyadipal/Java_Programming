import java.util.ArrayList;
import java.util.List;

// Q.1) Smallest Number
 //The task is to find the smallest number with given sum of digits as S and number of digits as D.
 //Example 1:
 // Input : S = 9 D = 2
 //Output : 18
 //Explanation:
 //18 is the smallest number
 //possible with sum = 9
 //and total digits = 2
public class BasicProblems3 {
     public static void main(String[] args) {
         int S = 9;
         int D = 2;
         if(S == 0 || S > D * 9){
             System.out.println("Wrong input");
             return;
         }
         S -= 1;
         List<Integer> number = new ArrayList<>();
         for (int i = 0;i < D;i++){
             number.add(0);
         }
         // Right to left chale
         for (int i = D - 1;i >= 1;i--){
             if (S > 9){
                 number.set(i,9);
                 S-= 9;
             }
             else {
                 number.set(i,S);
                 S = 0;
                 break;
             }
         }
         // stating wala 1 + remaining sum
         number.set(0,S + 1);
         System.out.println(number);
         int result = 0;
         for(int i = 0;i < D;i++){
             result = (result * 10) + number.get(i);
         }
         System.out.println("Smallest number is : " + result); // T.C -> O(D) S.C -> O(D)
     }
}
