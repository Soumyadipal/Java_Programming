import java.util.ArrayList;
import java.util.Collections;
public class BucketSort {
    static void bucketSorting(float [] arr) {
        int n = arr.length;
        // Buckets
        ArrayList<Float> [] buckets = new ArrayList[n];
        // Create empty buckets
        for (int i = 0;i < n;i++)
            buckets[i] = new ArrayList<Float>();
        // Add elements into our buckets
        for (int i = 0;i < n;i++) {
            int bucketIndex = (int) arr[i] * n;
            buckets[bucketIndex].add(arr[i]);
        }
        // Sort each bucket individually
        for (int i = 0;i < buckets.length;i++)
            Collections.sort(buckets[i]);
        // Merge all buckets to get final sorted array
        int index = 0;
        for (int i = 0;i < buckets.length;i++) {
            ArrayList<Float> currBucket = buckets[i];
            for (int j = 0;j < currBucket.size();j++)
                arr[index++] = currBucket.get(j);
        }
    }
    public static void main(String[] args) {
        float [] arr = {0.5f,0.4f,0.3f,0.2f,0.1f};
        bucketSorting(arr);
        System.out.print("The sorted array is : ");
        for (int i = 0;i < arr.length;i++)
            System.out.print(arr[i] + " ");
    }
}
