public class SelectionSort {
    static void swap(int [] arr,int a,int b) {
        arr[a] = arr[a] + arr[b];
        arr[b] = arr[a] - arr[b];
        arr[a] = arr[a] - arr[b];
    }
    static void selectionSorting(int [] arr) {
        for (int i = 0;i < arr.length - 1;i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length;j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            if (minIndex != i) {
                swap(arr, i, minIndex);
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {5,7,4,3,1};
        selectionSorting(arr);
        System.out.print("The sorted array is : ");
        for (int i = 0;i < arr.length;i++)
            System.out.print(arr[i] + " ");
    }
}
