// Q.1) Given an array where all its elements are sorted in increasing order except two swapped elements,
// sort it in linear time. Assume there are no duplicates in the array.
// Input : A[] = {3,8,6,7,5,9,10}
// Output : A[] = {3,5,6,7,8,9,10}
public class ProblemOnSortingAlgorithm2 {
//    static void sortForLinearArray(int [] arr) {
//        int x = -1,y = -1;
//        if (arr.length <= 1)
//            return;
//        for (int i = 1;i < arr.length;i++) {
//            if (arr[i - 1] > arr[i]) {
//                if (x == -1) {
//                    x = i - 1;
//                    y = i;
//                } else y = i;
//            }
//        }
//        // swap x and y
//        int temp = arr[x];
//        arr[x] = arr[y];
//        arr[y] = temp;
//    }
//    public static void main(String[] args) {
//        int [] arr = {10,5,6,7,8,9,3};
//        sortForLinearArray(arr);
//        System.out.print("The sorted array is : ");
//        for (int i = 0;i < arr.length;i++)
//            System.out.print(arr[i] + " ");
//    }
}

// Q.2) Given an array of positive and negative integers, segregate them in linear time and constant space.
// The output should print all negative numbers, followed by all positive numbers.
// Input : {19,-20,7,-4,-13,11,-5,3}
// Output : {-5,-20,-13,-4,7,11,19,3}
//class sortPosNeg {
//    static void swap(int [] arr,int a,int b) {
//        int temp = arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp;
//    }
//    static void sortPositiveAndNegative(int [] arr) {
//        int l = 0;
//        int r = arr.length - 1;
//        while (l < r) {
//            while (arr[l] < 0)
//                l++;
//            while (arr[r] >= 0)
//                r--;
//            if (l < r) {
//                swap(arr, l, r);
//                l++;
//                r--;
//            }
//        }
//    }
//    public static void main(String[] args) {
//        int [] arr = {19,-20,7,-4,-13,11,-5,3};
//        sortPositiveAndNegative(arr);
//        System.out.print("The sorted array is : ");
//        for (int i = 0;i < arr.length;i++)
//            System.out.print(arr[i] + " ");
//    }
//}

// Q.3) Given an array of size N containing only 0s,1s and 2s, sort the array in ascending order.
// Input : N = 6 and arr [] = {0,2,1,2,0,0}
// Output : 0 0 0 1 2 2
// This algorithm is called Dutch National Flag Algorithm
class Sorting012 {
    static void swap(int [] arr,int a,int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void sort012(int [] arr) {
        int low = 0,mid = 0,hi = arr.length - 1;
        while (mid <= hi) {
            if (arr[mid] == 2) {
                swap(arr,mid,hi);
                hi--;
            }
            else if (arr[mid] == 1) {
                mid++;
            }
            else if (arr[mid] == 0) {
                swap(arr,low,mid);
                low++;
                mid++;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {0,2,1,2,0,0};
        sort012(arr);
        System.out.print("The sorted array is : ");
        for (int i = 0;i < arr.length;i++)
            System.out.print(arr[i] + " ");
    }
}
