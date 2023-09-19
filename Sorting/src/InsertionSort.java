public class InsertionSort {
    static void swap(int [] arr,int a,int b) {
        arr[a] = arr[a] + arr[b];
        arr[b] = arr[a] - arr[b];
        arr[a] = arr[a] - arr[b];
    }
    static void insertionSorting(int [] arr) {
        for (int i = 1;i < arr.length;i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                swap(arr, j, j - 1);
                j--;
            }

        }
    }
    public static void main(String[] args) {
        int [] arr = {8,3,6,2,4,5};
        insertionSorting(arr);
        System.out.print("The sorted array is : ");
        for (int i = 0;i < arr.length;i++)
            System.out.print(arr[i] + " ");
    }
}
