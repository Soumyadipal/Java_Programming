public class BubbleSort {
    static void swap(int [] arr,int a,int b) {
        arr[a] = arr[a] + arr[b];
        arr[b] = arr[a] - arr[b];
        arr[a] = arr[a] - arr[b];
    }
     static void bubbleSorting(int [] arr) {
         int n = arr.length;
         for (int i = 0;i < n - 1;i++) {
             boolean flag = false;
             for (int j = 0;j < n - 1 - i;j++) {
//                 last i elements are already at correct position,so no need to check them
                 if (arr[j] > arr[j + 1]) {
                     swap(arr, j, j + 1);
                     flag = true;
                 }
             }
             if (flag == false)
                 return;
         }
     }
    public static void main(String[] args) {
        int [] arr = {5,7,4,3,1};
        bubbleSorting(arr);
        System.out.print("The sorted array is : ");
        for (int i = 0;i < arr.length;i++)
            System.out.print(arr[i] + " ");
    }
}
