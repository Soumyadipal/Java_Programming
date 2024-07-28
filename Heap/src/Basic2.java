import java.util.ArrayList;
import java.util.List;

public class Basic2 {

    static void swap(List<Integer> heap,int l,int r){
        int temp = heap.get(l);
        heap.set(l, heap.get(r));
        heap.set(r,temp);
    }

    static void push_down_in_Min_Heap(List<Integer> heap,int i,int n){
        if (i == n) return;

        int leftChild = (2 * i) + 1;
        int rightChild = (2 * i) + 2;

        int smallest = i;
        if(leftChild <= n && heap.get(leftChild) < heap.get(smallest)){
            smallest = leftChild;
        }
        if(rightChild <= n && heap.get(rightChild) < heap.get(smallest)){
            smallest = rightChild;
        }
        if(smallest == i) return;
        swap(heap,smallest,i);
        push_down_in_Min_Heap(heap,smallest,n);
    }

    public static void minHeapify(List<Integer> arr){ // build heap(min)
        int first_non_leaf_node = ((arr.size() - 1) - 1) / 2; // last element ka parent
        for (int i = first_non_leaf_node;i >= 0;i--){
            push_down_in_Min_Heap(arr,i,arr.size() - 1);
        }
    }

    static void push_down_in_Max_Heap(List<Integer> heap,int i,int n){
        if (i == n) return;

        int leftChild = (2 * i) + 1;
        int rightChild = (2 * i) + 2;

        int largest = i;
        if(leftChild <= n && heap.get(leftChild) > heap.get(largest)){
            largest = leftChild;
        }
        if(rightChild <= n && heap.get(rightChild) > heap.get(largest)){
            largest = rightChild;
        }
        if(largest == i) return;
        swap(heap,i,largest);
        push_down_in_Max_Heap(heap,largest,n);
    }

    public static void maxHeapify(List<Integer> arr){ // build heap(max)
        int first_non_leaf_node = ((arr.size() - 1) - 1) / 2; // last element ka parent
        for (int i = first_non_leaf_node;i >= 0;i--){
            push_down_in_Max_Heap(arr,i,arr.size() - 1);
        }
    }

    public static void heapSort(List<Integer> arr){
        // Time Complexity -> O(nlogn)
        maxHeapify(arr);
        int n = arr.size() - 1;
        for (int i = n;i > 0;i--){
            swap(arr,0,i);
            push_down_in_Max_Heap(arr,0,i - 1);
        }
    }
    public static void main(String[] args) {
        List<Integer> heap = new ArrayList<>();
//        heap.add(90); // generate min heap using heapify
//        heap.add(80); // generate min heap using heapify
//        heap.add(70); // generate min heap using heapify
//        heap.add(20); // generate min heap using heapify
//        heap.add(10); // generate min heap using heapify
//        heap.add(50); // generate min heap using heapify
//        heap.add(60); // generate min heap using heapify
//        System.out.println(heap); // generate min heap using heapify
//        minHeapify(heap); // generate min heap using heapify
//        System.out.print("After generate min heap using heapify : "); // generate min heap using heapify
//        System.out.println(heap); // generate min heap using heapify

//        heap.add(60); // generate max heap using heapify
//        heap.add(10); // generate max heap using heapify
//        heap.add(80); // generate max heap using heapify
//        heap.add(50); // generate max heap using heapify
//        heap.add(5); // generate max heap using heapify
//        heap.add(20); // generate max heap using heapify
//        heap.add(70); // generate max heap using heapify
//        System.out.println(heap); // generate max heap using heapify
//        maxHeapify(heap); // generate max heap using heapify
//        System.out.print("After generate max heap using heapify : "); // generate max heap using heapify
//        System.out.println(heap); // generate max heap using heapify

        heap.add(90); // heapSort
        heap.add(80); // heapSort
        heap.add(70); // heapSort
        heap.add(20); // heapSort
        heap.add(10); // heapSort
        heap.add(50); // heapSort
        heap.add(60); // heapSort
        System.out.println(heap); // heapSort
        heapSort(heap); //heapSort
        System.out.print("Sorted heap is : "); //heapSort
        System.out.println(heap); // heapSort
    }
}
