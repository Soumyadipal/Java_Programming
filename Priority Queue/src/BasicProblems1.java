import java.awt.*;
import java.util.*;
import java.util.List;

// Q.1) Given an integer array nums and an integer k, return the kth largest element in the array.
 // Note that it is the kth largest element in the sorted order, not the kth distinct element.
 // Input : nums : [3,7,2,9,5]
 // k:3
 // Output = 5


 // Q.2) You are given a set of points in a XY plane. You need to find the k closest points to the origin using
 //manhattan distance.
 //It is guaranteed that no 2 points will have the same distance from the origin.
public class BasicProblems1 {

    public static class Point{
        int x = 0;
        int y = 0;
        int distance = 0;

        Point(int x,int y){
            this.x = x;
            this.y = y;
        }
    }

    public static class PointComparator implements Comparator<Point>{
        public int compare(Point p1,Point p2){
            if (p1.distance < p2.distance) return 1;
            return -1;
        }
    }

    public static List<Point> kClosestPoints(List<Point> pts,int n,int k){
        PriorityQueue<Point> pointPriorityQueue = new PriorityQueue<>(new PointComparator()); // max heap
        for (int i = 0;i < n;i++){
            pts.get(i).distance = Math.abs(pts.get(i).x) + Math.abs(pts.get(i).y);
            pointPriorityQueue.add(pts.get(i));
            if(pointPriorityQueue.size() > k){
                pointPriorityQueue.poll();
            }
        }
        return new ArrayList<>(pointPriorityQueue);
    }
    public static void main(String[] args) {
//        List<Integer> arr = new ArrayList<>(); // Q.1
//        int k = 3;                             // Q.1
//        arr.add(3);                            // Q.1
//        arr.add(7);                            // Q.1
//        arr.add(2);                            // Q.1
//        arr.add(9);                            // Q.1
//        arr.add(5);                            // Q.1
//        List<Integer> sortedArr = new ArrayList<>(arr); // Space complexity -> O(n) // Q.1
//        sortedArr.sort(Comparator.reverseOrder()); // T.C -> O(nlogn) // Q.1
//        System.out.println("The kth largest element in the array : " + sortedArr.get(k - 1)); // T.C -> O(1) ,So final T.C -> O(nlogn) // Q.1
//
//        PriorityQueue<Integer> pq = new PriorityQueue<>(); // Q.1 (Better approach)
//        for (int i = 0;i < arr.size();i++){                // Q.1 (Better approach)
//            if(pq.size() == k){                            // Q.1 (Better approach)
//                // agar top chota tha, remove top and add element
//                if(pq.peek() < arr.get(i)){                // Q.1 (Better approach)
//                    pq.poll();                             // Q.1 (Better approach)
//                    pq.add(arr.get(i));                    // Q.1 (Better approach)
//                    continue;                              // Q.1 (Better approach)
//                }                                          // Q.1 (Better approach)
//                else continue;                             // Q.1 (Better approach)
//            }                                              // Q.1 (Better approach)
//            // for normal case
//            pq.add(arr.get(i));                            // Q.1 (Better approach)
//        }                                                  // Q.1 (Better approach)
//        System.out.println("The kth largest element in the array : " + pq.peek()); // T.C -> O(nlogn) S.C -> O(k) Q.1 (Better approach)


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of points : ");
        int n = sc.nextInt();
        System.out.print("Enter the value of k : ");
        int k = sc.nextInt();
        List<Point> pts = new ArrayList<>();
        System.out.println("Enter the points : ");
        for (int i = 0;i < n;i++){
            pts.add(new Point(sc.nextInt(),sc.nextInt()));
        }
        pts = kClosestPoints(pts,n,k);
        for (int i = 0; i < k; i++) {
            System.out.println(pts.get(i).x + " " + pts.get(i).y);
        }
    }
}
