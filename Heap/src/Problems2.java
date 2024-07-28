 // Q.1) Given two binary max heaps as arrays, the task is to merge the given heaps
 // Input: Max heap-1 : 10 5 3 2 4 Max heap-2 : 15 12 7 6 9 11
 // Output: Merged heap: 15 11 12 7 9 3 10 2 6 5 4

 // Q.2) Q4. Given an array A[] of N positive integers and two positive integers K1 and K2. Find the sum of all elements
 //between K1th and K2th smallest elements of the array. It may be assumed that (1 <= k1 < k2 <= n).
 // Input :
 //N = 7
 //A[] = {20, 8, 22, 4, 12, 10, 14}
 //K1 = 3, K2 = 6
 // Output : 26
public class Problems2 {

     public static int[] merge(int[] heap1, int[] heap2) {  // Q.1
         int size1 = heap1.length;                          // Q.1
         int size2 = heap2.length;                          // Q.1
         int[] mergedHeap = new int[size1 + size2];         // Q.1

         // Copy elements of the first heap                 // Q.1
         for (int i = 0; i < size1; i++) {                  // Q.1
             mergedHeap[i] = heap1[i];                      // Q.1
         }                                                  // Q.1

         // Copy elements of the second heap                // Q.1
         for (int i = 0; i < size2; i++) {                  // Q.1
             mergedHeap[size1 + i] = heap2[i];              // Q.1
         }                                                  // Q.1

         // Build a new max heap from the merged array      // Q.1
         for (int i = (size1 + size2) / 2 - 1; i >= 0; i--) { // Q.1
             heapify(mergedHeap, size1 + size2, i);      // Q.1
         }                                                  // Q.1
         return mergedHeap;                                 // Q.1
     }

     // Heapify algorithm to maintain max heap property     // Q.1
     public static void heapify(int[] arr, int n, int i) {  // Q.1
         int largest = i;                                   // Q.1
         int l = 2 * i + 1;                                 // Q.1
         int r = 2 * i + 2;                                 // Q.1

         if (l < n && arr[l] > arr[largest]) {              // Q.1
             largest = l;                                   // Q.1
         }                                                  // Q.1

         if (r < n && arr[r] > arr[largest]) {              // Q.1
             largest = r;                                   // Q.1
         }                                                  // Q.1

         if (largest != i) {                                // Q.1
             int temp = arr[i];                             // Q.1
             arr[i] = arr[largest];                         // Q.1
             arr[largest] = temp;                           // Q.1
             heapify(arr, n, largest);                      // Q.1
         }                                                  // Q.1
     }                                                      // Q.1


     public static void minHeapify(int[] a, int index, int n) {  // Q.2
         int small = index;                                      // Q.2
         int l = 2 * index + 1;                                  // Q.2
         int r = 2 * index + 2;                                  // Q.2

         if (l < n && a[l] < a[small])                           // Q.2
             small = l;                                          // Q.2

         if (r < n && a[r] < a[small])                           // Q.2
             small = r;                                          // Q.2

         if (small != index) {                                   // Q.2
             int temp = a[small];                                // Q.2
             a[small] = a[index];                                // Q.2
             a[index] = temp;                                    // Q.2
             minHeapify(a, small, n);                            // Q.2
         }                                                       // Q.2
     }                                                           // Q.2
    public static void main(String[] args) {                // Q.1
//        int[] heap1 = {10, 5, 3, 2, 4};                     // Q.1
//        int[] heap2 = {15, 12, 7, 6, 9, 11};                // Q.1
//
//        int[] mergedHeap = merge(heap1, heap2);             // Q.1
//
//        // Print the merged heap                            // Q.1
//        System.out.print("Merged heap: ");                  // Q.1
//        for (int i = 0; i < mergedHeap.length; i++) {       // Q.1
//            System.out.print(mergedHeap[i] + " ");          // Q.1
//        }                                                   // Q.1



        int i = 0;                                 // Q.2
        int k1 = 3;                                // Q.2
        int k2 = 6;                                // Q.2

        int[] a = { 20, 8, 22, 4, 12, 10, 14 };    // Q.2
        int n = a.length;                          // Q.2
        int ans = 0;                               // Q.2

        for (i = (n / 2) - 1; i >= 0; i--) {       // Q.2
            minHeapify(a, i, n);                   // Q.2
        }

        // Decrease value by 1 because we want to min heapify k times and it starts
        // from 0, so we have to decrease it 1 time
        k1--;                                      // Q.2
        k2--;                                      // Q.2

        // Step 1: Extract minimum k1 times (This step takes O(K1 Log n) time)
        for (i = 0; i <= k1; i++) {                // Q.2
            a[0] = a[n - 1];                       // Q.2
            n--;                                   // Q.2
            minHeapify(a, 0, n);             // Q.2
        }                                          // Q.2

        // Step 2: Extract minimum k2 - k1 - 1 times and sum all extracted elements.
        // (This step takes O((K2 - k1) * Log n) time)
        for (i = k1 + 1; i < k2; i++) {             // Q.2
            ans += a[0];                            // Q.2
            a[0] = a[n - 1];                        // Q.2
            n--;                                    // Q.2
            minHeapify(a, 0, n);              // Q.2
        }                                           // Q.2
        System.out.println(ans);                    // Q.2
    }
}
