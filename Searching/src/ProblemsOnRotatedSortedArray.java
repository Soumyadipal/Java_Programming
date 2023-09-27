// Q.1) A rotated sorted array is a sorted array on which rotation operation has been performed some
// number of times.Given a rotated sorted array, find the index of the minimum element in the array.Follow 0-based indexing
// Input : Array = [3,4,5,1,2]
// Output : 3
public class ProblemsOnRotatedSortedArray {
//    static int findMinimum(int [] arr) {
//        int start = 0,end = arr.length - 1;
//        int ans = -1;
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//            if (arr[mid] < arr[arr.length - 1]) {
//                ans = mid;
//                end = mid - 1;
//            }
//            else start = mid + 1;
//        }
//        return ans;
//    }
//    public static void main(String[] args) {
//        int [] arr = {3,4,5,8,1,2};
//        System.out.println("The index of minimum element is : "+findMinimum(arr));
//    }
}

// Q.2) Given the rotated sorted array of integers, which contains distinct elements, and an integer target,
// return the index of target if it is in the array.Otherwise return -1.
// Input : Array = [3,4,5,1,2] and target = 4
// Output : 1
//class searchTarget {
//    static int search(int [] arr,int target) {
//        int start = 0,end = arr.length - 1;
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//            if (arr[mid] == target)
//                return mid;
//            else if (arr[mid] < arr[end]) { // mid to end, array is sorted
//                if (target > arr[mid] && target <= arr[end])
//                    start = mid + 1;
//                else end = mid - 1;
//            }
//            else { // start to mid, array is sorted
//                if (target >= arr[start] && target < arr[mid])
//                    end = mid - 1;
//                else start = mid + 1;
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//        int [] arr = {3,4,5,1,2};
//        int target = 4;
//        System.out.println("The index of target is : "+search(arr,target));
//    }
//}

// Q.3) Search element in rotated sorted array with duplicate elements.Return true if the element is found else return false
// Input : [0,0,0,1,1,1,2,0,0,0] and target = 2
// Output : true
class searchElement {
    static boolean search(int [] arr,int target) {
        int start = 0,end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return true;
            else if (arr[start] == arr[mid] && arr[end] == arr[mid]) {
                start++;
                end--;
            } else if (arr[mid] <= arr[end]) { // mid to end, array is sorted
                if (target > arr[mid] && target <= arr[end])
                    start = mid + 1;
                else end = mid - 1;
            }
            else { // start to mid, array is sorted
                if (target >= arr[start] && target < arr[mid])
                    end = mid - 1;
                else start = mid + 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] arr = {0,0,0,1,1,1,2,0,0,0};
        int target = 2;
        System.out.println("The element is found : "+search(arr,target));
    }
}
