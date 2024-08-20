 // Q.1) Given an integer array of coins[] of size N representing different types of currency and an integer sum,
 //The task is to find the number of ways to make a sum by using different combinations from coins[]. Assume
 //that you have an infinite supply of each type of coin.
 //Input : sum = 4, coins[] = {1,2,3}
 //Output : 4
 //Explanation: there are four solutions: {1, 1, 1, 1}, {1, 1, 2}, {2, 2}, {1, 3};
 //Input : sum = 10, coins[] = {2, 5, 3, 6}
 //Output : 5


 import java.util.ArrayList;
 import java.util.List;

 // Q.2) 0/1 KNAPSACK
 //We are given N items where each item has some weight and profit associated with it. We are also given a bag
 //with capacity W, [i.e., the bag can hold at most W weight in it]. The target is to put the items into the bag such
 //that the sum of profits associated with them is the maximum possible.
 //Input : N = 3, W = 4, profit[] = {1, 2, 3}, weight[] = {4, 5, 1}
 //Output : 3
 //Explanation: There are two items which have weight less than or equal to 4. If we select the ite with weight 4,
 //the possible profit is 1. And if we select the ite with weight 1, the possible profit is 3. So the maximum possible
 //profit is 3. Note that we cannot put both the items with weight 4 and 1 together as the capacity of the bag is 4.
 //Input : N = 3, W = 3, profit[] = {1, 2, 3}, weight[] = {4, 5, 6}
 //Output : 0



 // Q.3) There are N stones, numbered 1,2,...,N. The height of ith stone is hi.
 //There is a frog who is initially on Stone 1. He will repeat an action some number of times to reach Stone N. The
 //action is that if the frog is currently on Stone i, it jumps to one of the following: Stone i+1,i+2,...,i+K. Here, a cost
 //of |hi - hj| is incurred, where j is the stone to land on.
 //Find the minimum possible total cost incurred before the frog reaches Stone N.
 //Input :
 //n = 5
 //k = 3
 //10 30 40 50 20
 // Output : 30
 // Input :
 // n = 3
 // k = 1
 //10 20 10
 // Output : 20
public class ProblemsOnTabulation {
    public static int coinChange(int [] coins,int sum,int index,int [][] dp){
        if(index == 0){
            if(sum % coins[index] == 0) return 1;
            else return 0;
        }
        if(dp[index][sum] != -1) return dp[index][sum];
        int pick = 0;
        if (sum >= coins[index]) pick = coinChange(coins,sum - coins[index],index,dp);
        int not_pick = coinChange(coins,sum,index - 1,dp);
        return dp[index][sum] = pick + not_pick;
    }


    public static int profit(int index,int W,int [] profit,int [] weights,int [][] dp){
        if(index == 0){
            if (weights[index] <= W) return profit[index];
            else return 0;
        }
        if(dp[index][W] != -1) return dp[index][W];
        int pick =0;
        if(W >= weights[index]) pick = profit[index] + profit(index - 1,W - weights[index],profit,weights,dp);
        int not_pick =profit(index - 1,W,profit,weights,dp);

        return dp[index][W] = Math.max(pick,not_pick);
    }


    public static int stones(int index,int [] heights,int k,int [] dp){
        if (index == 0) return 0;
        if(dp[index] != -1) return dp[index];
        int minCost = Integer.MAX_VALUE;
        for(int j = 1;j <= k;j++){
            if(index - j >= 0){
                int jump = Math.abs(heights[index] - heights[index - j]) + stones(index - j,heights,k,dp);
                minCost = Math.min(minCost,jump);
            }
        }
        return dp[index] = minCost;
    }
    public static void main(String[] args) {
//        int [] coins = {1,2,3}; // Using recursion // Q.1
//        int sum = 4;            // Using recursion // Q.1
//        int [][] dp = new int[coins.length + 1][sum + 1]; // Using recursion // Q.1
//        for(int i = 0;i < dp.length;i++){                 // Using recursion // Q.1
//            for (int j = 0;j < dp[i].length;j++){         // Using recursion // Q.1
//                dp[i][j] = -1;                            // Using recursion // Q.1
//            }                                             // Using recursion // Q.1
//        }                                                 // Using recursion // Q.1
//        System.out.println("Total combinations are : "+ coinChange(coins,sum,coins.length - 1,dp));  // Using recursion // Q.1


//        int [] coins = {1,2,3};  // Using tabulation // Q.1
//        int totalSum = 4;        // Using tabulation // Q.1
//        int n = coins.length;    // Using tabulation // Q.1
//        int [] curr = new int[totalSum + 1];  // Using tabulation // Q.1
//        int [] prev = new int[totalSum + 1];  // Using tabulation // Q.1
//        for(int i = 0;i <= totalSum;i++){            // Using tabulation // Q.1
//            curr[i] = 0;                             // Using tabulation // Q.1
//            if(i % coins[0] == 0) prev[i] = 1;      // Using tabulation // Q.1
//            else prev[i] = 0;                       // Using tabulation // Q.1
//        }                                            // Using tabulation // Q.1
//        for (int idx = 1;idx < n;idx++){             // Using tabulation // Q.1
//            for (int sum = 0;sum <= totalSum;sum++){ // Using tabulation // Q.1
//                int pick = 0;                        // Using tabulation // Q.1
//                if (sum >= coins[idx]) pick = curr[sum - coins[idx]];  // Using tabulation // Q.1
//                int not_pick = prev[sum];     // Using tabulation // Q.1
//
//                curr[sum] = pick + not_pick;      // Using tabulation // Q.1
//            }                                        // Using tabulation // Q.1
//            prev = curr;                             // Using tabulation // Q.1
//        }                                            // Using tabulation // Q.1
//        System.out.println("Total combinations are : "+ prev[totalSum]);  // Using tabulation // Q.1



//        int [] profit = {1,2,3};                       // Using recursion // Q.2
//        int [] weights = {4,5,1};                      // Using recursion // Q.2
//        int W = 4;                                     // Using recursion // Q.2
//        int n = profit.length;                         // Using recursion // Q.2
//        int [][] dp = new int[n + 1][W + 1];           // Using recursion // Q.2
//        for (int i = 0;i < dp.length;i++){             // Using recursion // Q.2
//            for (int j = 0; j < dp[i].length;j++){     // Using recursion // Q.2
//                dp[i][j] = -1;                         // Using recursion // Q.2
//            }                                          // Using recursion // Q.2
//        }                                              // Using recursion // Q.2
//        System.out.println("Total profit : "+ profit(n - 1,W,profit,weights,dp));  // Using recursion // Q.2



//        int [] profit = {1,2,3};                       // Using tabulation // Q.2
//        int [] weights = {4,5,1};                      // Using tabulation // Q.2
//        int Wt = 4;                                    // Using tabulation // Q.2
//        int n = profit.length;                         // Using tabulation // Q.2
//        int [] curr = new int[Wt + 1];  // Using tabulation // Q.2
//        int [] prev = new int[Wt + 1];  // Using tabulation // Q.2
//        for (int i = 0;i <= Wt;i++){    // Using tabulation // Q.2
//            curr[i] = 0;                // Using tabulation // Q.2
//            if (weights[0] <= i) prev[i] =  profit[0];  // Using tabulation // Q.2
//            else prev[i] = 0;                           // Using tabulation // Q.2
//        }                                               // Using tabulation // Q.2
//        for (int idx = 1;idx < n;idx++){                // Using tabulation // Q.2
//            for (int W = 0;W <= Wt;W++){                // Using tabulation // Q.2
//                int pick = Integer.MIN_VALUE;           // Using tabulation // Q.2
//                if(W >= weights[idx]) pick = profit[idx] + prev[W - weights[idx]];  // Using tabulation // Q.2
//                int not_pick = prev[W];                 // Using tabulation // Q.2
//
//                curr[W] = Math.max(pick,not_pick);      // Using tabulation // Q.2
//            }                                           // Using tabulation // Q.2
//            System.arraycopy(curr,0,prev,0,Wt + 1);     // Using tabulation // Q.2
//        }                                               // Using tabulation // Q.2
//        System.out.println("Total profit : "+ prev[Wt]); // Using tabulation // Q.2



//        int [] heights = {10,30,40,50,20};          // Using recursion // Q.3
//        int k = 3;                                  // Using recursion // Q.3
//        int n = heights.length;                     // Using recursion // Q.3
//        int [] dp = new int[n + 1];                 // Using recursion // Q.3
//        for (int i = 0;i < dp.length;i++){          // Using recursion // Q.3
//            dp[i] = -1;                             // Using recursion // Q.3
//        }                                           // Using recursion // Q.3
//        System.out.println("Minimum possible cost : " + stones(n - 1,heights,k,dp));  // Using recursion // Q.3



//        int [] heights = {10,30,40,50,20};        // Using tabulation // Q.3
//        int k = 3;                                // Using tabulation // Q.3
//        int n = heights.length;                   // Using tabulation // Q.3
//        int [] dp = new int[n + 1];               // Using tabulation // Q.3
//        dp[0] = 0;                                // Using tabulation // Q.3
//        for(int i = 1;i < n;i++){                 // Using tabulation // Q.3
//            int minCost = Integer.MAX_VALUE;      // Using tabulation // Q.3
//            for(int j = 1;j <= k;j++){            // Using tabulation // Q.3
//                if(i - j >= 0){                   // Using tabulation // Q.3
//                    int jump = Math.abs(heights[i] - heights[i - j]) + dp[i - j];  // Using tabulation // Q.3
//                    minCost = Math.min(minCost,jump);  // Using tabulation // Q.3
//                }                                      // Using tabulation // Q.3
//            }                                          // Using tabulation // Q.3
//            dp[i] = minCost;                           // Using tabulation // Q.3
//        }                                              // Using tabulation // Q.3
//        System.out.println("Minimum possible cost : " + dp[n - 1]);  // Using tabulation // Q.3



        int [] heights = {10,30,40,50,20};  // Using tabulation(better approach) // Q.3
        int k = 3;                          // Using tabulation(better approach) // Q.3
        int n = heights.length;             // Using tabulation(better approach) // Q.3
        List<Integer> dp = new ArrayList<>();  // Using tabulation(better approach) // Q.3
        dp.add(0);                              // Using tabulation(better approach) // Q.3
        for(int i = 1;i < n;i++){               // Using tabulation(better approach) // Q.3
            int minCost = Integer.MAX_VALUE;    // Using tabulation(better approach) // Q.3
            for(int j = 1;j <= k;j++){          // Using tabulation(better approach) // Q.3
                if(i - j >= 0){                 // Using tabulation(better approach) // Q.3
                    int jump = Math.abs(heights[i] - heights[i - j]) + dp.get(dp.size() - j);  // Using tabulation(better approach) // Q.3
                    minCost = Math.min(minCost,jump);  // Using tabulation(better approach) // Q.3
                }                               // Using tabulation(better approach) // Q.3
            }                                    // Using tabulation(better approach) // Q.3
            if(dp.size() == k) dp.remove(0);  // Using tabulation(better approach) // Q.3
            dp.add(minCost);                        // Using tabulation(better approach) // Q.3
        }                                           // Using tabulation(better approach) // Q.3
        System.out.println("Minimum possible cost : " + dp.get(k - 1));  // Using tabulation(better approach) // Q.3
    }
}
