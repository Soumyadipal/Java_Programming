import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Q.1) Largest palindromic number by permuting digits
 //Given N(very large), the task is to print the largest palindromic number obtained by permuting the digits of N. If
 //it is not possible to make a palindromic number, then print an appropriate message
 // Input : 313551
 // Output : 531135
 //Explanations : 531135 is the largest number which is a palindrome, 135531, 315513 and the numbers can also
 //be formed but we need the highest of all of the palindromes
 //Input : 331
 //Output : 313
 //Input : 3444
 //Palindrome cannot be formed


 // Q.2) Minimum Cost to cut a board into squares.
 //A board of length M and width N is given. The task is to break this board into M * N squares such that cost of
 //breaking is minimum. The cutting cost for each edge will be given for the board in two arrays X[] and Y[]
 //representing the cost of cutting horizontal and vertical edges respectively, i.e X[i] represents the cost of cutting
 //a horizontal edge of size i. In short, you need to choose such a sequence of cutting such that cost is minimized.
 //Return the minimized cost.
 //Input : M = 6. N = 4
 //X[] = {2, 1, 3, 1, 4}
 //Y[] = {4, 1, 2}
 //The values of M and N aXe positive integers.
 //Constraints: 1 <= M, N <= 10^5
 //The arrays X[] and Y[] represent the costs of cutting horizontal and vertical edges, respectively.
 //The length of X[] is M - 1, and the length of Y[] is N - 1.
 //Constraints: 1 <= X[i], Y[i] <= 10^5
 //Output : 42
 //Explanation: For above boaXd optimal way to cut into square is:
 //Total minimum cost in above case is 42. It is
 //evaluated using following steps.
 //Initial Value : Total_cost = 0
 //Total_cost = Total_cost + edge_cost * total_pieces
 //Cost 4 Horizontal cut Cost = 0 + 4*1 = 4
 //Cost 4 Vertical cut Cost = 4 + 4*2 = 12
 //Cost 3 Vertical cut Cost = 12 + 3*2 = 18
 //Cost 2 Horizontal cut Cost = 18 + 2*3 = 24
 //Cost 2 Vertical cut Cost = 24 + 2*3 = 30
 //Cost 1 Horizontal cut Cost = 30 + 1*4 = 34
 //Cost 1 Vertical cut Cost = 34 + 1*4 = 38
 //Cost 1 Vertical cut Cost = 38 + 1*4 = 42


 // Q.3) Given an array of intervals where intervals[i] = [starti, endi], return the minimum number of intervals you need
 //to remove to make the rest of the intervals non-overlapping.
 //Input: intervals = [[1,2],[2,3],[3,4],[1,3]]
 //Output: 1
 //Explanation: [1,3] can be removed and the rest of the intervals are non-overlapping.
public class BasicProblems2 {
    public static boolean validate(List<Integer> frequency){   // Q.1
        boolean isOdd = false;                                 // Q.1
        for(int i = 0;i < frequency.size();i++){               // Q.1
            if(frequency.get(i) % 2 != 0){                     // Q.1
                if (isOdd == true) return false;               // Q.1
                isOdd = true;                                  // Q.1
            }                                                  // Q.1
        }                                                      // Q.1
        return true;                                           // Q.1
    }                                                          // Q.1


     public static class Interval{
         int startTime;
         int endTime;
         public Interval(int startTime,int endTime){
             this.startTime = startTime;
             this.endTime = endTime;
         }
     }
     public static class IntervalComparator implements Comparator<Interval>{
         public int compare(Interval i1,Interval i2){
             if(i1.startTime > i2.startTime) return 1;
             else if(i1.startTime < i2.startTime) return -1;
             else return 0;
         }
     }
     public static void main(String[] args) {
//         String number = "301103333";                    // Q.1
//         List<Integer> frequency = new ArrayList<>();    // Q.1
//         for(int i = 0;i < 10;i++){                      // Q.1
//             frequency.add(0);                           // Q.1
//         }                                               // Q.1
//         int n = number.length();                        // Q.1
//         for (int i = 0;i < n;i++){                      // Q.1
//             int digit = number.charAt(i) - '0';         // Q.1
//             frequency.set(digit, frequency.get(digit) + 1); // Q.1
//         }                                               // Q.1
//         if(!validate(frequency)){                       // Q.1
//             System.out.println("Palindrome cannot be formed"); // Q.1
//         }                                                      // Q.1
//         else {                                                 // Q.1
//             String firstHalf = "";                             // Q.1
//             for (int i = 9;i >= 0;i--){                        // Q.1
//                 while (frequency.get(i) > 1){                  // Q.1
//                     firstHalf += i;                            // Q.1
//                     frequency.set(i, frequency.get(i) - 2);    // Q.1
//                 }                                              // Q.1
//             }                                                  // Q.1
//             StringBuilder temp = new StringBuilder(firstHalf); // Q.1
//             temp.reverse();                                    // Q.1
//             String secondHalf = temp.toString();               // Q.1
//             for (int i = 9;i >= 0;i--){                        // Q.1
//                 if(frequency.get(i) == 1) firstHalf += i;      // Q.1
//             }                                                  // Q.1
//             String result = firstHalf + secondHalf;            // Q.1
//             System.out.println("The largest palindromic number is : " + result);  // T.C -> O(n) S.C -> O(1) // Q.1
//         }         // Q.1


//             int M = 6,N = 4;                                            // Q.2
//             List<Integer> X = new ArrayList<>(); // vertical cuts       // Q.2
//             List<Integer> Y = new ArrayList<>(); // horizontal cuts     // Q.2
//             X.add(2);   // Q.2
//             X.add(1);   // Q.2
//             X.add(3);   // Q.2
//             X.add(1);   // Q.2
//             X.add(4);   // Q.2
//             Y.add(4);   // Q.2
//             Y.add(1);   // Q.2
//             Y.add(2);   // Q.2
//
//             X.sort(Comparator.reverseOrder()); // Q.2
//             Y.sort(Comparator.reverseOrder()); // Q.2
//
//             int no_of_Vertical_Piece = 1;  // Q.2
//             int no_of_Horizontal_Piece = 1;  // Q.2
//             int totalCost = 0;               // Q.2
//             int i = 0,j = 0;                 // Q.2
//             while (i < M - 1 && j < N - 1){  // Q.2
//                 if(X.get(i) > Y.get(j)){     // Q.2
//                     totalCost += X.get(i) * no_of_Horizontal_Piece;  // Q.2
//                     no_of_Vertical_Piece++;   // Q.2
//                     i++;                      // Q.2
//                 }                             // Q.2
//                 else {                        // Q.2
//                     totalCost += Y.get(j) * no_of_Vertical_Piece;  // Q.2
//                     no_of_Horizontal_Piece++;                      // Q.2
//                     j++;                       // Q.2
//                 }                              // Q.2
//             }                                  // Q.2
//             while (i < M - 1){                 // Q.2
//                 totalCost += X.get(i) * no_of_Horizontal_Piece;  // Q.2
//                 i++;                           // Q.2
//             }                                  // Q.2
//             while (j < N - 1) {                // Q.2
//                 totalCost += Y.get(j) * no_of_Vertical_Piece;  // Q.2
//                 j++;                           // Q.2
//             }                                  // Q.2
//             System.out.println("Total minimum cost is : " + totalCost); // T.C -> O(nlogn + mlogm) S.C -> O(1)  // Q.2



         List<Interval> intervalList = new ArrayList<>();
         intervalList.add(new Interval(1,2));
         intervalList.add(new Interval(2,3));
         intervalList.add(new Interval(3,4));
         intervalList.add(new Interval(1,3));
         intervalList.sort(new IntervalComparator());
         int result = 0;
         int previousEndTime = intervalList.get(0).endTime;
         for (int i = 1;i < intervalList.size();i++){
             Interval current = intervalList.get(i);
             // check if overlap and remove
             if(current.startTime < previousEndTime){
                 // chhote wale ko previous bana do
                 previousEndTime = Math.min(current.endTime,previousEndTime);
                 result++;
             }
             else {
                 previousEndTime = current.endTime;
             }
         }
         System.out.println(result); // T.C -> O(nlogn) S.C-> O(1)
     }
}
