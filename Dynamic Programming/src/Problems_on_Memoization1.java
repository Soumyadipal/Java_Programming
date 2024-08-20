 // Q.1) The Fibonacci numbers,commonly denoted F(n) form a sequence,called the Fibonacci sequence, such
 //that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
 //F(0) = 0, F(1) = 1
 //F(n) = F(n-1)+F(n-2),for n>1.
 //Given n, calculate F(n). 0 <= n < 30
 // Input : n = 2
 // Output : 1
 //Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
 //Input : n = 3
 //Output : 2
 //Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.


 // Q.2) You are a professional robber planning to rob houses along a street. Each house has a certain amount of
 //money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have
 //security systems connected and it will automatically contact the police if two adjacent houses were broken
 //into on the same night.
 //Given an integer array nums representing the amount of money of each house, return the maximum amount
 //of money you can rob tonight without alerting the police.
 //Input1: nums = [1,2,3,1]
 //Output1: 4
 //Explanation : Rob house 1 (money = 1) and then rob house 3 (money = 3).
 //Total amount you can rob=1+3=4.
 //Input2 : nums = [2,7,9,3,1]
 //Output2 : 12
 //Explanation : Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5(money=1).
 //Total amount you can rob=2+9+1=12.


 // Q.3) A message containing letters from A-Z can be encoded into numbers using the following mapping:
 //'A'->"1"
 //'B'->"2"
 //...
 //'Z'->"26"
 //To decode an encoded message, all the digits must be grouped then mapped back into letters using the
 //reverse of the mapping above (there may be multiple ways). For example, "11106" can be mapped into:
 //"AAJF" with the grouping (1 1 10 6)
 //"KJF" with the grouping (11 10 6)
 //Note that the grouping (1 11 06) is invalid because "06" cannot be mapped into 'F' since "6" is different from
 //"06".
 //Given a string s containing only digits, return the number of ways to decode it.
 //Input1 : s = "12"
 //Output : 2
 //ExplanationR "12" could be decoded as "AB" (1 2) or "L" (12).
 //Input : s = "226"
 //Output : 3
 //ExplanationR "226" could be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6).
public class Problems_on_Memoization1 {
    public static int fibonacci(int n,int [] dp){ // T.C-> O(n) S.C -> O(n)
        if(n == 1 || n == 0) return n;
        if (dp[n] != -1 ) return dp[n];
        return dp[n] = fibonacci(n - 1,dp) + fibonacci(n - 2,dp);
    }

    public static int rob(int [] nums,int index,int [] dp){  //     T.C->O(n) S.C->O(n)
        if(index == nums.length - 1) return nums[nums.length - 1];
        if(index >= nums.length) return 0;
        if(dp[index] != -1) return dp[index];

        int pick = nums[index] + rob(nums,index + 2,dp);
        int not_pick = rob(nums,index + 1,dp);

        return dp[index] = Math.max(pick,not_pick);
    }

     static int number_of_ways(String s,int index,int [] dp){
         if(s.charAt(0) == '0') return 0;
         if(index <= 0) return 1;
         if(dp[index] != -1) return dp[index];

         int not_combine = 0;
         if(s.charAt(index) != '0'){
             not_combine = number_of_ways(s,index - 1,dp);
         }

         int combine = 0;
         if(s.charAt(index - 1) == '1' || (s.charAt(index - 1) == '2' && s.charAt(index) <= '6')){
             combine = number_of_ways(s,index - 2,dp);
         }

         return dp[index] = not_combine + combine;
     }
    public static void main(String[] args) {
//        int n = 6;                    // Q.1
//        int [] dp = new int[n + 1];   // Q.1
//        for(int i = 0;i < n + 1;i++){ // Q.1
//            dp[i] = -1;               // Q.1
//        }                             // Q.1
//        System.out.println("The "+ n + "th Fibonacci number is : " + fibonacci(n,dp));  // Q.1



//        int [] nums = {2,7,9,3,1};             // Q.2
//        int [] dp = new int[nums.length + 1];  // Q.2
//        for(int i = 0;i < dp.length;i++){      // Q.2
//            dp[i] = -1;                        // Q.2
//        }                                      // Q.2
//        System.out.println("Total amount you can rob : " + rob(nums,0,dp));  // Q.2


        String s = "226";                        // Q.3
        int [] dp = new int[s.length() + 1];     // Q.3
        for(int i = 0;i < dp.length;i++){        // Q.3
            dp[i] = -1;                          // Q.3
        }                                        // Q.3
        System.out.println("Total number of ways : " + number_of_ways(s,s.length() - 1,dp));  // Q.3
    }
}
