// Q.1) Find the unique number in a given array where all the elements are being repeated twice with one value being unique(Only positive elements are in the array)
// Let the array is = 1,2,3,4,2,3,1
// Q.2) Find the Second largest element in the given array
// Let array is = 9,8,9,6,9,5,8
// Let array is = 0,-2,0,-3,0,-4
// Q.3) Given an array consisting of integers.Return the first value that is repeating in this array.If no value is being repeated, return -1
// Let array is = 1,5,3,4,6,3,4
// Let array is = 1,2,4,6,7

import java.util.Scanner;
public class ArrayManipulation {
    static int LastRepeatingNumber(int[] arr) {
        int ans = -1;
        for (int i = 0;i < arr.length;i++) {
            for (int j = i + 1;j < arr.length;j++) {
                if (arr[i] == arr[j])
                    ans = arr[i];
            }
        }
        return ans;
    }
    static int FirstRepeatingNumber(int[] arr) {
        for (int i = 0;i < arr.length;i++) {
            for (int j = i + 1;j < arr.length;j++) {
                if (arr[i] == arr[j])
                    return arr[i];
            }
        }
        return -1;
    }
    static int FindMaximum(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0;i < arr.length;i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }
    static int FindSecondMaximum(int[] arr) {
        int max = FindMaximum(arr);
        for (int i = 0;i < arr.length;i++){
            if (arr[i] == max)
                arr[i] = Integer.MIN_VALUE;
        }
        int SecondMax = FindMaximum(arr);
        return SecondMax;
    }
    static int FindUnique(int[] arr) {
        for (int i = 0;i < arr.length;i++) {
            for (int j = i + 1;j < arr.length;j++) {
                if (arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = -1;
        for (int i = 0;i < arr.length;i++) {
            if(arr[i] != -1)
                ans = arr[i];
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
        System.out.println("The Unique element is : "+FindUnique(arr));                 // Q.1
        System.out.println("The Second maximum element is : "+FindSecondMaximum(arr));  // Q.2
        System.out.println("The First repeating element is : "+FirstRepeatingNumber(arr)); // Q.3
        System.out.println("The Last repeating element is : "+LastRepeatingNumber(arr));   // For last repeating element
    }
}
