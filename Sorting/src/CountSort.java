public class CountSort {
    static int findMax(int [] arr) {
        int mx = Integer.MIN_VALUE;
        for (int i = 0;i < arr.length;i++) {
            if (arr[i] > mx)
                mx = arr[i];
        }
        return mx;
    }
    static void advanceCountSorting(int [] arr) {
        int [] output = new int[arr.length];
        int max = findMax(arr); // find the largest element of the array
        int [] count = new int[max + 1];
        for (int i = 0;i < arr.length;i++)  // make frequency array
            count[arr[i]]++;

        // make prefix sum array of count array
        for (int i = 1;i < count.length;i++)
            count[i] += count[i - 1];

        // find the index of each element in the original array and put it in output array
        for (int i = arr.length - 1;i >= 0;i--) {
            int idx = count[arr[i]] - 1;
            output[idx] = arr[i];
            count[arr[i]] --;
        }

        // copy all elements of output to arr
        for (int i = 0;i < output.length;i++)
            arr[i] = output[i];

    }
    static void basicCountSorting(int [] arr) {
        int max = findMax(arr);
        int [] count = new int[max + 1];
        for (int i = 0;i < arr.length;i++)
            count[arr[i]]++;
        int k = 0;
        for (int i = 0;i < count.length;i++) {
            for (int j = 0;j < count[i];j++) {
                arr[k++] = i;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {4,3,1,5,3,1,3,5};
//        basicCountSorting(arr);
//        System.out.print("The sorted array is : ");
//        for (int i = 0;i < arr.length;i++)
//            System.out.print(arr[i] + " ");
        advanceCountSorting(arr);
        System.out.print("The sorted array is : ");
        for (int i = 0;i < arr.length;i++)
            System.out.print(arr[i] + " ");
    }
}
