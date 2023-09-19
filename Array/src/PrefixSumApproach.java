// Q.1) Given an integer array,return the prefix sum/running sum in the same array without creating a new array.
// Q.2) Given an array of integers of size n.Answer q queries where you need to print the sum of values in a given range of indices from l to r(both included).Note:The values of l and r in queries follow 1-based indexing.
// Q.3) Check if we can partition the array into two subarrays with equal sum.More formally,check that the prefix sum of a part of the array is equal to the suffix sum of rest of the array.
// Q.4) Given an integer array,return the suffix sum in the same array without creating a new array.
import java.util.Scanner;
public class PrefixSumApproach {
    static void MakeSuffixSum(int[] arr) {
        int n = arr.length;
        for (int i = n - 2;i >= 0;i--) {
            arr[i] = arr[i + 1] + arr[i];
        }
    }
    static int FindTotalSumOfArray(int[] arr) {
        int TotalSum = 0;
        for (int i = 0;i < arr.length;i++) {
            TotalSum += arr[i];
        }
        return TotalSum;
    }
    static boolean EqualSumPartition(int[] arr) {
        int TotalSum = FindTotalSumOfArray(arr);
        int PrefixSum = 0;
        for (int i = 0;i < arr.length;i++) {
            PrefixSum += arr[i];
            int SuffixSum = TotalSum - PrefixSum;
            if (PrefixSum == SuffixSum)
                return true;
        }
        return false;
    }
    static void MakePrefixSumArrayWithoutCreatingNewArray(int[] arr) {
        int n = arr.length;
        for (int i = 1;i < n;i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
    }
    static int[] MakePrefixSumArrayWithCreatingNewArray(int[] arr) {
        int n = arr.length;
        int[] Pref = new int[n];
        Pref[0] = arr[0];
        for (int i = 1;i < n;i++) {
            Pref[i] = Pref[i - 1] + arr[i];
        }
        return Pref;
    }

    static void ArrayPrint(int[] arr) {
        for (int i = 0;i < arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                         // Q.1 & Q.3 & Q.4
        System.out.print("Enter the size of the array : ");          // Q.1 & Q.3 & Q.4
        int n = sc.nextInt();                                        // Q.1 & Q.3 & Q.4
        int[] arr = new int[n];                                      // Q.1 & Q.3 & Q.4
        System.out.print("Enter " + n + " elements : ");            // Q.1 & Q.3 & Q.4
        for (int i = 0; i < n; i++) {                               // Q.1 & Q.3 & Q.4
            arr[i] = sc.nextInt();                                  // Q.1 & Q.3 & Q.4
        }                                                           // Q.1 & Q.3 & Q.4
        System.out.print("The original array is : ");               // Q.1 & Q.3 & Q.4
        ArrayPrint(arr);                                            // Q.1 & Q.3 & Q.4
        System.out.print("The Output array is : ");                 // Q.1 & Q.3 & Q.4
//        int[] Pref = MakePrefixSumArrayWithCreatingNewArray(arr);  // Q.1 With Creating a new array
//        ArrayPrint(Pref);                                          // Q.1 With Creating a new array
//        MakePrefixSumArrayWithoutCreatingNewArray(arr);            // Q.1 Without Creating a new array
//        ArrayPrint(arr);                                           // Q.1 Without Creating a new array
//        System.out.print("Enter the size of the array : ");         // Q.2
//        int n = sc.nextInt();                                       // Q.2
//        int[] arr = new int[n + 1];                                 // Q.2
//        System.out.print("Enter " + n + " elements : ");            // Q.2
//        for (int i = 1; i <= n; i++) {                               // Q.2
//            arr[i] = sc.nextInt();                                  // Q.2
//        }                                                           // Q.2
//        MakePrefixSumArrayWithoutCreatingNewArray(arr);             // Q.2
//        System.out.print("Enter the number of queries : ");         // Q.2
//        int q = sc.nextInt();                                       // Q.2
//        while (q-- > 0) {                                           // Q.2
//            System.out.print("Enter the range : ");                 // Q.2
//            int l = sc.nextInt();                                   // Q.2
//            int r = sc.nextInt();                                   // Q.2
//            int ans = arr[r] - arr[l - 1];                          // Q.2
//            System.out.println("The sum is : "+ans);                // Q.2
//        }                                                           // Q.2
//        System.out.println("Equal Partition possible : "+EqualSumPartition(arr));  // Q.3
        MakeSuffixSum(arr);                                                          // Q.4
        ArrayPrint(arr);                                                             // Q.4

    }
}
