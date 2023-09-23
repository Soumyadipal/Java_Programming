public class QuickSort {
    static void swap(int [] arr,int a,int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static int partition(int [] arr,int st,int end) {
        int pivot = arr[st];
        int count = 0;
        for (int i = st + 1;i <= end;i++) {
            if (arr[i] <= pivot)
                count++;
        }
        int pivotIdx = st + count;
        swap(arr,st,pivotIdx);
        int i = st,j = end;
        // element lesser or equal -> left of pivotIdx and greater -> right of pivotIdx
        while (i < pivotIdx && j > pivotIdx) {
            while (arr[i] <= pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i < pivotIdx && j > pivotIdx) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }
    static void quickSorting(int [] arr,int st,int end) {
        if (st >=end)
            return;
        int pi = partition(arr,st,end);
        quickSorting(arr,st,pi - 1);
        quickSorting(arr,pi + 1,end);
    }
    public static void main(String[] args) {
        int [] arr = {8,3,6,2,4,5};
        quickSorting(arr,0, arr.length - 1);
        System.out.print("The sorted array is : ");
        for (int i = 0;i < arr.length;i++)
            System.out.print(arr[i] + " ");
    }
}
