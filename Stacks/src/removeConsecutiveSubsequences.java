 // Q.1) Given a sequence of numbers.Remove all the consecutive subsequences of length greater than or equal to 2 that contains the same element
 import java.util.*;
 public class removeConsecutiveSubsequences {
     public static int[] remove(int [] arr){
         Stack<Integer> st = new Stack<>();
         for (int i = 0;i < arr.length;i++){
             if(st.size() == 0 || st.peek() != arr[i]){
                 st.push(arr[i]);
             } else if (st.peek() == arr[i]) {
                 if(arr[i] != arr[i - 1]){
                     st.push(arr[i]);
                 }
                 else if(i == arr.length - 1 || arr[i] != arr[i + 1]){
                     st.pop();
                 }
             }
         }
         int [] res = new int[st.size()];
         for(int i = res.length - 1;i >= 0;i--){
             res[i] = st.pop();
         }
         return res;
     }
     public static void main(String[] args) {
         int [] arr = {1,2,2,1,3,10,10,10,4,4,4,5,7,7,2};
         int [] res = remove(arr);
         for(int i = 0;i < res.length;i++){
             System.out.print(res[i] + " ");
         }
     }
}
