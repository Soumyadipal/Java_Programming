// Q.1) Find the first occurrence of a given element x, given that the given array is sorted. If no
// occurrence of x is found then return -1.
// Input : arr = [2,5,5,5,6,6,8,9,9,9] and x = 5
// Output : 1
public class ProblemsOnBinarySearch1 {
//    static int firstOccurrence(int [] arr,int x) {
//        int start = 0,end = arr.length - 1;
//        int fo = -1;
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//            if (arr[mid] == x) {
//                fo = mid;
//                end = mid - 1;
//            } else if (arr[mid] < x) {
//                start = mid + 1;
//            } else if (arr[mid] > x) {
//                end = mid - 1;
//            }
//        }
//        return fo;
//    }
//    public static void main(String[] args) {
//        int [] arr = {2,5,5,5,6,6,8,9,9,9};
//        int x = 5;
//        System.out.println("The first occurrence of "+x+" is : "+firstOccurrence(arr,x));
//    }
}

// Q.2) Find the square root of the given non-negative value x.Round it off to the nearest floor integer value.
// Input : x = 4
// Output : 2
// Input : x = 11
// Output : 3
class findSquareRoot {
    static int squareRoot(int x) {
        int start = 0,end = x;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int val = mid * mid;
            if (val == x)
                return mid;
            else if (val < x) {
                ans = mid;
                start = mid + 1;
            }
            else end = mid - 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int x = 24;
        System.out.println("The square root of "+x+" is : "+squareRoot(x));
    }
}
