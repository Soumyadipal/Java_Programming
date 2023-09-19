// Q.1) Sort an array consisting of only 0's and 1's
// Q.2) Given an array of integers , move all the even integers at the begining of the array followed by all the odd integers.The relative order of odd or even integers does not matter.Return any array that satisfies the condition.
// Q.3) Given an integer array sorted in non-decreasing order,return an array of the squares of each number sorted in non-decreasing order.
import java.util.Scanner;
public class TwoPointersApproach {

    static int[] SortSquares(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1, k = n - 1;
        int[] ans = new int[n];
        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k--] = arr[left] * arr[left];
                left++;
            }
            else {
                ans[k--] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }
    static void SortArrayByParity(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (arr[left] % 2 != 0 && arr[right] % 2 == 0) {
                ArraySwap(arr, left, right);
                left++;
                right--;
            }
            if(arr[left] % 2 ==0)
                left++;
            if (arr[right] % 2 != 0)
                right--;
        }
    }
    static void ArraySwap(int[] arr,int i,int j) {
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }
    static void SortZeorsAndOnesUsingTwoPointer(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                ArraySwap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] == 0)
                left++;
            if (arr[right] == 1)
                right--;
        }
    }
    static void SortZerosAndOnesNotusingTwoPointer(int[] arr) {
        int n = arr.length;
        int zeros = 0;
        for (int i = 0;i < n;i++) {
            if (arr[i] == 0)
                zeros++;
        }
        for (int i = 0;i < n;i++) {
            if(i < zeros)
                arr[i] = 0;
            else arr[i] = 1;
        }
    }
    static void ArrayPrint(int[] arr) {
        for (int i = 0;i < arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter "+n+" elements : ");
        for (int i = 0;i < n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("The original array is : ");
        ArrayPrint(arr);
        System.out.print("The sorted array is : ");
//        SortZerosAndOnesNotusingTwoPointer(arr);                      // Q.1 notusing Two pointers
//        ArrayPrint(arr);                                              // Q.1 notusing Two pointers
//        SortZeorsAndOnesUsingTwoPointer(arr);                           // Q.1 using Two pointers
//        ArrayPrint(arr);                                                // Q.1 using Two pointers
//        SortArrayByParity(arr);                                         // Q.2
//        ArrayPrint(arr);                                                // Q.2
        int[] ans = SortSquares(arr);                                   // Q.3
        ArrayPrint(ans);                                                // Q.3
    }
}
