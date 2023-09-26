public class BinarySearch {
    static boolean recursiveBinarySearch(int [] arr,int start,int end,int target){
        if (start > end)
            return false;
        int mid = start + (end - start) / 2;
        if (arr[mid] == target)
            return true;
        else if (arr[mid] < target) {
            return recursiveBinarySearch(arr,mid + 1,end,target);
        } else {
            return recursiveBinarySearch(arr,start,mid - 1,target);
        }
    }
    static boolean binarySearch(int [] arr,int target) {
        int start = 0,end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target)
                return true;
            else if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] arr = {2,4,5,7,15,20,24,45,50,77};
        int target = 24;
        System.out.println(target + " is present in the array : " + binarySearch(arr,target));
        System.out.println(target + " is present in the array : " + recursiveBinarySearch(arr,0,arr.length - 1,target));
    }
}
