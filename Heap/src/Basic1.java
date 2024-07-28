import java.util.ArrayList;
import java.util.List;

public class Basic1 {

    static void swap(List<Integer> heap,int l,int r){
        int temp = heap.get(l);
        heap.set(l, heap.get(r));
        heap.set(r,temp);
    }

    static void push_up_in_Min_Heap(List<Integer> heap,int i){
        // compare with parent or SWAP until root reached or correct position found

        int parent_index = (i - 1) / 2;
        if(i == 0 || heap.get(parent_index) < heap.get(i)){
            return;
        }
        swap(heap,i,parent_index);
        push_up_in_Min_Heap(heap,parent_index);
    }

    static void insert_in_Min_Heap(List<Integer> heap,int element){
        // Time Complexity -> Height of tree = O(logn)
        // Space Complexity -> O(1)
        // last me add
        heap.add(element);

        int index = heap.size() - 1;
        push_up_in_Min_Heap(heap,index);
    }

    static void push_up_in_Max_Heap(List<Integer> heap,int i){
        // compare with parent or SWAP until root reached or correct position found

        int parent_index = (i - 1) / 2;
        if(i == 0 || heap.get(parent_index) > heap.get(i)){
            return;
        }
        swap(heap,i,parent_index);
        push_up_in_Max_Heap(heap,parent_index);
    }

    static void insert_in_Max_Heap(List<Integer> heap,int element){
        // Time Complexity -> Height of tree = O(logn)
        // Space Complexity -> O(1)
        // last me add
        heap.add(element);

        int index = heap.size() - 1;
        push_up_in_Max_Heap(heap,index);
    }

    static void delete_from_Min_Heap(List<Integer> heap){
        swap(heap,0, heap.size() - 1);
        heap.remove(heap.size() - 1);
        push_down_in_Min_Heap(heap,0);
    }

    static void push_down_in_Min_Heap(List<Integer> heap,int i){
        int n = heap.size() - 1;
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
        swap(heap,i,smallest);
        push_down_in_Min_Heap(heap,smallest);
    }

    static void delete_from_Max_Heap(List<Integer> heap){
        swap(heap,0, heap.size() - 1);
        heap.remove(heap.size() - 1);
        push_down_in_Max_Heap(heap,0);
    }

    static void push_down_in_Max_Heap(List<Integer> heap,int i){
        int n = heap.size() - 1;
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
        push_down_in_Max_Heap(heap,largest);
    }
    public static void main(String[] args) {
        List<Integer> heap = new ArrayList<>();
//        heap.add(10); // insertion in min heap
//        heap.add(20); // insertion in min heap
//        heap.add(30); // insertion in min heap
//        heap.add(40); // insertion in min heap
//        heap.add(50); // insertion in min heap
//        System.out.println(heap); // insertion in min heap
//        insert_in_Min_Heap(heap,5); // insertion in min heap
//        System.out.print("After insert in Min Heap result is : "); // insertion in min heap
//        System.out.println(heap); // insertion in min heap

//        heap.add(60); // insertion in max heap
//        heap.add(50); // insertion in max heap
//        heap.add(40); // insertion in max heap
//        heap.add(30); // insertion in max heap
//        heap.add(20); // insertion in max heap
//        heap.add(30); // insertion in max heap
//        heap.add(10); // insertion in max heap
//        System.out.println(heap); // insertion in max heap
//        insert_in_Max_Heap(heap,40); // insertion in max heap
//        System.out.print("After insert in Max Heap result is : "); // insertion in max heap
//        System.out.println(heap); // insertion in max heap

//        heap.add(5); // deletion in min heap
//        heap.add(20); // deletion in min heap
//        heap.add(10); // deletion in min heap
//        heap.add(40); // deletion in min heap
//        heap.add(50); // deletion in min heap
//        heap.add(30); // deletion in min heap
//        heap.add(60); // deletion in min heap
//        System.out.println(heap); // deletion in min heap
//        delete_from_Min_Heap(heap); // deletion in min heap
//        System.out.print("After deletion in Min Heap result is : "); // deletion in min heap
//        System.out.println(heap); // deletion in min heap

        heap.add(90); // deletion in max heap
        heap.add(80); // deletion in max heap
        heap.add(70); // deletion in max heap
        heap.add(20); // deletion in max heap
        heap.add(10); // deletion in max heap
        heap.add(50); // deletion in max heap
        heap.add(60); // deletion in max heap
        System.out.println(heap); // deletion in max heap
        delete_from_Max_Heap(heap); // deletion in max heap
        System.out.print("After deletion in Max Heap result is : "); // deletion in max heap
        System.out.println(heap); // deletion in max heap
    }
}
