// Q.1) Search the 'target' value in a 2d integer matrix of dimensions n x m and return true if found,
// else return false.This matrix has the following properties:
//       1. Integers in each row are sorted from left to right.
//       2. The first integer of each row is greater than the last integer of the previous row.
// Input : Matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]] and target = 3
// Output : true
public class ProblemsOnBinarySearch2 {
//    static boolean findTarget(int [][] arr,int target) {
//        int n = arr.length,m = arr[0].length; // n = no. of rows and m = no. of columns
//        int start = 0,end = n * m - 1;
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//            int midElement = arr[mid / m][mid % m];
//            if (midElement == target)
//                return true;
//            else if (midElement < target) {
//                start = mid + 1;
//            }
//            else end = mid - 1;
//        }
//        return false;
//    }
//    public static void main(String[] args) {
//        int [][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
//        int target = 16;
//        System.out.println("The target is present in the 2d matrix : "+findTarget(arr,target));
//    }
}

// Q.2) Write an efficient algorithm that searches for a value target in an m x n integer matrix.This matrix has the following properties:
//         1.Integers in each row are sorted in ascending from left to right
//         2.Integers in each column are sorted in ascending from top to bottom
// Input : Matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]] and target = 5
// Output : true
//class findTarget {    // Time Complexity -> O(m + n)
//    static boolean findTargetValue(int [][] arr,int target) {
//        int n = arr.length,m = arr[0].length; // n = no. of rows and m = no. of columns
//        int i = 0,j = m - 1;
//        while (i < n && j >= 0) {
//            if (arr[i][j] == target)
//                return true;
//            else if (arr[i][j] < target) {
//                i++;  // move down
//            }
//            else j--; // move left
//        }
//        return false;
//    }
//    public static void main(String[] args) {
//        int [][] arr = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
//        int target = 8;
//        System.out.println("The target is present in the 2d matrix : "+findTargetValue(arr,target));
//    }
//}

// Q.3) Given a mountain array 'a' of length greater than 3, return the index 'i' such that arr[0] < arr[1] < ....< arr[i - 1] < arr[i] > arr[i + 1] > ....> arr[arr.length - 1].
// This index is known as the peak index
// Input : Array = [0,4,1,0]
// Output : 1
//class mountainArrayProblem1 {
//    static int peakIndexInMountainArray(int [] arr) {
//        int start = 0,end = arr.length - 1;
//        int ans = -1;
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//            if (arr[mid] < arr[mid + 1]) {
//                ans = mid + 1;
//                start = mid + 1;
//            }else end = mid - 1;
//        }
//        return ans;
//    }
//    public static void main(String[] args) {
//        int [] arr = {0,4,5,8,4,3,1,0};
//        System.out.println("The peak index of mountain array is : "+peakIndexInMountainArray(arr));
//    }
//}

// Q.4) A peak element is an element that is strictly greater than its neighbours.
// Given a 0-indexed integer array nums ,find a peak element and return its index.If the array contains multiple peaks
// return the index to any of the peaks.
// You may imagine that nums[-1] = nums[n] = -infinity.In other words, an element is always considered to be strictly
// greater than a neighbour that is outside the array.
// Input : nums = [1,2,3,1]
// Output : 2
class mountainArrayProblem2 {
    static int peakIndexInMountainArray(int [] arr) {
        int start = 0,end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if ((mid == 0 || arr[mid] > arr[mid - 1]) && (mid == arr.length - 1 || arr[mid] > arr[mid + 1]))
                return mid;
            else if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }else end = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,1};
        System.out.println("The peak index of mountain array is : "+peakIndexInMountainArray(arr));
    }
}