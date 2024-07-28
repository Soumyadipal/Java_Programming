 // Q.1) Given an array arr[] and an integer K is smaller than size of array, the task is to find the Kth smallest
 // element in the given array. It is given that all array elements are distinct.
 // Note : l and r denotes the starting and ending index of the array.
 // Input : N = 6
 //         arr[] = 7 10 4 3 20 15
 //         K = 3
 // Output : 7

 // Q2. Given an array representing min heap. Convert it into max heap.
 //Input : Min heap: 1, 3, 6, 5, 9, 8 Output : Max heap: 9, 5, 8, 1, 3, 6
public class Problems1 {
     static class MinHeap { // Q.1
         private int[] harr; // pointer to array of elements in heap // Q.1
         private int capacity; // maximum possible size of min heap // Q.1
         private int heap_size; // Current number of elements in min heap // Q.1

         public MinHeap(int a[], int size) { // Q.1
             heap_size = size;               // Q.1
             harr = a; // store address of array // Q.1
             int i = (heap_size - 1) / 2;    // Q.1
             while (i >= 0) {                // Q.1
                 minHeapify(i);              // Q.1
                 i--;                        // Q.1
             }                               // Q.1
         }                                   // Q.1

         // To minheapify subtree rooted with index i // Q.1
         private void minHeapify(int i) {   // Q.1
             int l = left(i);               // Q.1
             int r = right(i);              // Q.1
             int smallest = i;              // Q.1

             if (l < heap_size && harr[l] < harr[i]) // Q.1
                 smallest = l;                       // Q.1

             if (r < heap_size && harr[r] < harr[smallest]) // Q.1
                 smallest = r;                              // Q.1

             if (smallest != i) {                           // Q.1
                 swap(i, smallest);                         // Q.1
                 minHeapify(smallest);                      // Q.1
             }                                              // Q.1
         }                                                  // Q.1

         private int parent(int i) {                        // Q.1
             return (i - 1) / 2;                            // Q.1
         }                                                  // Q.1

         private int left(int i) {                          // Q.1
             return 2 * i + 1;                              // Q.1
         }                                                  // Q.1

         private int right(int i) {                         // Q.1
             return 2 * i + 2;                              // Q.1
         }                                                  // Q.1

         public int extractMin() {                          // Q.1
             if (heap_size == 0)                            // Q.1
                 return Integer.MAX_VALUE;                  // Q.1

             // Store the minimum value.                    // Q.1
             int root = harr[0];                            // Q.1

             // If there are more than 1 items, move the last item to // Q.1
             // root and call heapify.                      // Q.1
             if (heap_size > 1) {                           // Q.1
                 harr[0] = harr[heap_size - 1];             // Q.1
                 minHeapify(0);                          // Q.1
             }                                             // Q.1
             heap_size--;                                  // Q.1

             return root;                                  // Q.1
         }                                                 // Q.1

         private void swap(int x, int y) {                 // Q.1
             int temp = harr[x];                           // Q.1
             harr[x] = harr[y];                            // Q.1
             harr[y] = temp;                               // Q.1
         }                                                 // Q.1

         public int getMin() {                             // Q.1
             return harr[0];                               // Q.1
         }                                                 // Q.1
     }                                                     // Q.1

     public static int kthSmallest(int arr[], int N, int K) { // Q.1
         MinHeap mh = new MinHeap(arr, N);                    // Q.1

         for (int i = 0; i < K - 1; i++)                      // Q.1
             mh.extractMin();                                 // Q.1

         return mh.getMin();                                  // Q.1
     }                                                        // Q.1


     // Heapify subtree rooted at index i // Q.2
     static void maxHeapify(int arr[], int i, int n) { // Q.2
         int left = 2 * i + 1;                         // Q.2
         int right = 2 * i + 2;                        // Q.2
         int largest = i;                              // Q.2

         if (left < n && arr[left] > arr[i]) {         // Q.2
             largest = left;                           // Q.2
         }                                             // Q.2

         if (right < n && arr[right] > arr[largest]) { // Q.2
             largest = right;                          // Q.2
         }                                             // Q.2

         if (largest != i) {                           // Q.2
             // Swap arr[i] and arr[largest]           // Q.2
             int temp = arr[i];                        // Q.2
             arr[i] = arr[largest];                    // Q.2
             arr[largest] = temp;                      // Q.2
             maxHeapify(arr, largest, n);              // Q.2
         }                                             // Q.2
     }                                                 // Q.2

     // Function to convert min heap to max heap       // Q.2
     static void convertMaxHeap(int arr[], int n) {    // Q.2
         // Start from bottommost and rightmost internal node  // Q.2
         // and heapify all internal nodes in bottom up way    // Q.2
         for (int i = (n - 2) / 2; i >= 0; i--) {              // Q.2
             maxHeapify(arr, i, n);                            // Q.2
         }                                                     // Q.2
     }                                                         // Q.2

     // Utility function to print an array                   // Q.2
     static void printArray(int arr[], int n) {              // Q.2
         for (int i = 0; i < n; i++) {                       // Q.2
             System.out.print(arr[i] + " ");                 // Q.2
         }                                                   // Q.2
         System.out.println();                               // Q.2
     }                                                       // Q.2
    public static void main(String[] args) {
//        int arr[] = {7, 10, 4, 3, 20, 15}; // Q.1
//        int N = arr.length, K = 3; // Q.1
//        System.out.println("K'th smallest element is " + kthSmallest(arr, N, K)); // Q.1

        int arr[] = {1, 3, 6, 5, 9, 8}; // Q.2
        int n = arr.length;             // Q.2

        System.out.print("Min Heap: "); // Q.2
        printArray(arr, n);             // Q.2

        convertMaxHeap(arr, n);         // Q.2

        System.out.print("Max Heap: "); // Q.2
        printArray(arr, n);             // Q.2
    }
}
