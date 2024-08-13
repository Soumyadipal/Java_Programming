import java.util.*;

// Q.1) Given an array of n integers. You are supposed to perform k operationY on it. At each operation, the
 // smallest 2 elements of the array are removed from the array, multiplied by each other and the product is
 // added back to the array.
 // Return the largest element of the array after the k operations.
 // It is guaranteed that at least one element will remain after the k operations.
 // Input : n = 5 ,k = 3 ,array = {2 4 3 1 5}
 // Output : 20


// Q.2) Q4. Given an array A[] of N positive integers and two positive integers K1 and K2. Find the sum of all elements
//between K1th and K2th smallest elements of the array. It may be assumed that (1 <= k1 < k2 <= n).
// Input :
//N = 7
//A[] = {20, 8, 22, 4, 12, 10, 14}
//K1 = 3, K2 = 6
// Output : 26
public class BasicProblems2 {
    public static int largestNum(List<Integer> arr,int n,int k){  // Q.1
        PriorityQueue<Integer> pq = new PriorityQueue<>(arr);     // Q.1
        for(int i = 0;i < k;i++){                                 // Q.1
            int x = pq.poll();                                    // Q.1
            int y = pq.poll();                                    // Q.1
            pq.add(x * y);                                        // Q.1
        }                                                         // Q.1
        while (pq.size() > 1){                                    // Q.1
            pq.remove();                                          // Q.1
        }                                                         // Q.1
        return pq.peek();                                         // Q.1
    }                                                             // Q.1
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);    // Q.1
//        System.out.print("Enter n : ");         // Q.1
//        int n = sc.nextInt();                   // Q.1
//        System.out.print("Enter k : ");         // Q.1
//        int k = sc.nextInt();                   // Q.1
//        List<Integer> arr = new ArrayList<>();  // Q.1
//        System.out.println("Enter the values : "); // Q.1
//        for (int i = 0; i < n; i++) {           // Q.1
//            arr.add(sc.nextInt());              // Q.1
//        }                                       // Q.1
//        System.out.println("The largest number is : " + largestNum(arr, n, k)); // Q.1


        int n = 7;                              // Q.2
        int k1 = 3,k2 = 6;                      // Q.2
        List<Integer> arr = new ArrayList<>();  // Q.2
        arr.add(20);                            // Q.2
        arr.add(8);                             // Q.2
        arr.add(22);                            // Q.2
        arr.add(4);                             // Q.2
        arr.add(12);                            // Q.2
        arr.add(10);                            // Q.2
        arr.add(14);                            // Q.2
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // Q.2
        for (int i = 0;i < arr.size();i++){     // Q.2
            pq.add(arr.get(i));                 // Q.2
            if(pq.size() > k2){                 // Q.2
                pq.remove();                    // Q.2
            }                                   // Q.2
        }                                       // Q.2
        // smallest k2 elements
        pq.remove();                            // Q.2
        // remove k2th element
        int sum  = 0;                           // Q.2
        while (pq.size() != k1){                // Q.2
            sum += pq.remove();                 // Q.2
        }                                       // Q.2
        System.out.println("The sum is : " + sum); // Q.2 T.C -> O(nlogk2) S.C -> O(k2)

    }
}
