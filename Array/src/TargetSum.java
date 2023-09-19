// Q.1) Find the total number of pairs in the array whose sum is equal to the given value x
//  Let array elements are = 4,6,3,5,8,2 and target is 7
// Q.2) Count the number of triplates who sum is equal to the given value of x
//  Let array elements are = 1,4,5,6,3 and target is 12

import java.util.Scanner;
public class TargetSum {
    static int TripletSum(int[] arr,int target) {
        int ans = 0;
        for (int i = 0;i < arr.length;i++) {
            for (int j = i + 1;j < arr.length;j++) {
                for (int k = j + 1;k < arr.length;k++) {
                    if (arr[i] + arr[j] + arr[k] == target)
                        ans++;
                }
            }
        }
        return ans;
    }
    static int PairSum(int[] arr,int x) {
        int ans = 0;
        for (int i = 0;i < arr.length;i++) {
            for (int j = i + 1;j < arr.length;j++) {
                if (arr[i] + arr[j] == x)
                    ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target : ");
        int x = sc.nextInt();
        System.out.println("Number of pairs are : "+PairSum(arr,x));         // For only Q.1
        System.out.println("Number of Triplates are : "+TripletSum(arr,x));  // For only Q.2
    }
}
