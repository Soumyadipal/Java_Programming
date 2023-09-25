public class RadixSort {
    static int findMax(int [] arr) {
        int mx = Integer.MIN_VALUE;
        for (int i = 0;i < arr.length;i++) {
            if (arr[i] > mx)
                mx = arr[i];
        }
        return mx;
    }
    static void countSorting(int [] arr,int place) {
        int [] output = new int[arr.length];
        int [] count = new int[10];
        for (int i = 0;i < arr.length;i++)  // make frequency array
            count[(arr[i]/place) % 10]++;

        // make prefix sum array of count array
        for (int i = 1;i < count.length;i++)
            count[i] += count[i - 1];

        // find the index of each element in the original array and put it in output array
        for (int i = arr.length - 1;i >= 0;i--) {
            int idx = count[(arr[i]/place) % 10] - 1;
            output[idx] = arr[i];
            count[(arr[i]/place) % 10] --;
        }

        // copy all elements of output to arr
        for (int i = 0;i < output.length;i++)
            arr[i] = output[i];

    }
    static void radixSorting(int [] arr) {
        int max = findMax(arr);
        for (int place = 1;max / place > 0;place *= 10) {
            countSorting(arr,place);
        }
    }
    public static void main(String[] args) {
        int [] arr = {170,45,75,90,802,2};
        radixSorting(arr);
        System.out.print("The sorted array is : ");
        for (int i = 0;i < arr.length;i++)
            System.out.print(arr[i] + " ");
    }
}
