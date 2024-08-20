public class FibonacciSequenceUsingTabulation {
    public static void main(String[] args) {
        int n = 10;
        int prev2 = 0;
        int prev1 = 1;
        int curr = 0;
        for (int i = 2;i <= n;i++){
            curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        System.out.println("The "+ n + "th Fibonacci number is : " + curr); // T.C -> O(n) S.C -> O(1)
    }
}
