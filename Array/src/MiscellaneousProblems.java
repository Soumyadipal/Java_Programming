// Q.1) Given two integers a and b.Swap the two given values not using temporary variable.
// Q.2) Reverse an array consisting of integers using a temporary array
// Q.3) Reverse an array consisting of integers by Inplace
// Q.4) Rotate a given array by k steps, where k is non-negative.Using extra space(K can be greater than the length of the array as well)
// Q.5) Rotate a given array by k steps, where k is non-negative.Without using extra space(K can be greater than the length of the array as well)
// Q.6) Given Q queries, check if the given number is present or not in the given array(value of all the elements in the array is less than 10 to the power 5)

import java.util.Scanner;
public class MiscellaneousProblems {
    static int[] MakeFrequencyArray(int[] arr) {
        int[] freq = new int[100001];          // We can take the size greater than 100000 for better space
        for (int i = 0;i < arr.length;i++) {
            freq[arr[i]]++;
        }
        return freq;
    }
    static void ArrayReverseForArrayRotate(int[] arr,int i,int j) {
        while (i < j) {
            ArraySwap(arr,i,j);
            i++;
            j--;
        }
    }
    static void ArrayRotationInPlace(int[] arr,int k) {
        int n = arr.length;
        k = k % n;
        ArrayReverseForArrayRotate(arr,0,n - k - 1);
        ArrayReverseForArrayRotate(arr,n - k,n - 1);
        ArrayReverseForArrayRotate(arr,0,n - 1);
    }
    static int[] ArrayRotateUsingExtraSpace(int[] arr,int k) {
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;
        for (int i =n - k;i < n;i++) {
            ans[j++] = arr[i];
        }
        for (int i = 0;i < n - k;i++) {
            ans[j++] = arr[i];
        }
        return ans;
    }
    static void ArraySwap(int[] arr,int i,int j) {
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }
    static void ArrayReverseInPlace(int[] arr) {
        int i = 0,j = arr.length - 1;
        while (i < j) {
            ArraySwap(arr,i,j);
            i++;
            j--;
        }
    }
    static void ArrayPrint(int[] arr) {
        for (int i = 0;i < arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int[] ArrayReverseUsingTemporary(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;
        for (int i = n-1;i >= 0;i--) {
            ans[j++] = arr[i];
        }
        return ans;
    }
    static void Swap(int a,int b) {
        System.out.println("Original Values are:");
        System.out.print("a = "+a);
        System.out.println(" b = "+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swaping values are:");
        System.out.print("a = "+a);
        System.out.println(" b = "+b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 4,b = 8;                                     // Q.1
//        int[] arr = {1,2,3,4,5};                         // Q.2 & Q.3 & Q.4 & Q.5
//        Swap(a,b);                                         // Q.1
//        int[] ans = ArrayReverseUsingTemporary(arr);       // Q.2
//        System.out.print("The reversing array is : ");     // Q.2
//        ArrayPrint(ans);                                   // Q.2
//        ArrayReverseInPlace(arr);                          // Q.3
//        System.out.print("The reversing array is : ");     // Q.3
//        ArrayPrint(arr);                                   // Q.3
//        System.out.print("The Original array is : ");                          // Q.4 & Q.5
//        ArrayPrint(arr);                                                       // Q.4 & Q.5
//        System.out.print("Enter the value of k : ");                           // Q.4 & Q.5
//        int k = sc.nextInt();                                                  // Q.4 & Q.5
//        int[] ans = ArrayRotateUsingExtraSpace(arr,k);                         // Q.4
//        System.out.print("After rotation of "+k+" steps the array is : ");     // Q.4
//        ArrayPrint(ans);                                                       // Q.4
//        ArrayRotationInPlace(arr,k);                                           // Q.5
//        System.out.print("After rotation of "+k+" steps the array is : ");     // Q.5
//        ArrayPrint(arr);                                                       // Q.5
        System.out.print("Enter the size of the array : ");               // Q.6
        int n = sc.nextInt();                                             // Q.6
        int[] arr = new int[n];                                           // Q.6
        System.out.print("Enter "+n+" elements : ");                      // Q.6
        for (int i = 0;i < n;i++) {                                       // Q.6
            arr[i] = sc.nextInt();                                        // Q.6
        }                                                                 // Q.6
        int[] freq = MakeFrequencyArray(arr);                             // Q.6
        System.out.print("Enter the number of queries : ");               // Q.6
        int q = sc.nextInt();                                             // Q.6
        while (q > 0) {                                                   // Q.6
            System.out.print("Enter the number to be searched : ");       // Q.6
            int x = sc.nextInt();                                         // Q.6
            q--;                                                          // Q.6
            if (freq[x] > 0)                                              // Q.6
                System.out.println("Yes");                                // Q.6
            else System.out.println("No");                                // Q.6
        }                                                                 // Q.6
    }
}
