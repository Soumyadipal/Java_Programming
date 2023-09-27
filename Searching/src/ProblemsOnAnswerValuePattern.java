// Q.1) You have 'n'(n <= 10^5) boxes of chocolate.Each box contains a[i](a[i] <= 10000) chocolates.YOu
// need to distribute these boxes among 'm' students such that the maximum number of chocolates allocated to
// a student is minimum.
//             a) One box will be allocated to exactly one student.
//             b) All the boxes should be allocated.
//             c) Each student has to be allocated at least one box.
//             d) Allotment should be in contiguous order,for instance,a student cannot be allocated box 1 and box 3,skipping box 2.
// Calculate and return that minimum possible number.
// Assume that it is always to distribute the chocolates.
// The first line of input will contain the value of n,the number of boxes.
// The second line of input will contain the n numbers denoting the number of chocolates in each box.
// The third line will contain the m,number of students.
// Input : 4
//         12 34 67 90
//         2
// Output : 113
public class ProblemsOnAnswerValuePattern {
//    static boolean isDivisionPossible(int [] arr,int m,int mxChocAllowed) {
//        int numOfStudents = 1;
//        int choc = 0;  // number of chocolates current students has
//        for (int i = 0;i < arr.length;i++) {
//            if (arr[i] > mxChocAllowed)
//                return false;
//            if (choc + arr[i] <= mxChocAllowed)
//                choc += arr[i];
//            else {
//                numOfStudents++;
//                choc = arr[i];
//            }
//        }
//        return numOfStudents <= m;
//    }
//    static int distributeChocolates(int [] arr,int m) {
//        if (arr.length < m)
//            return -1;
//        int ans = 0,st = 1,end = (int)1e9;
//        while (st <= end) {
//            int mid = st + (end - st) / 2;
//            /* such that none of the students receives more than m chocolates there are no more than m students
//            if mid is kept as maximum allowed chocolates for any student */
//            if (isDivisionPossible(arr,m,mid)) {
//                ans = mid;
//                end = mid - 1;
//            }else st = mid + 1;
//        }
//        return ans;
//    }
//    public static void main(String[] args) {
//        int [] arr = {12,34,67,90};
//        int m = 2;
//        System.out.println(distributeChocolates(arr,m));
//    }
}

// Q.2) A new racing track for kids is being built in New York with 'n' starting spots. The spots are located along
// a straight line at positions x1,x2,....xn(xi <= 10^9). For each 'i',xi + 1 > xi.
// At a time only 'm' children are allowed to enter the race.Since the race track is for kids,they may into
// each other while running.To prevent this, we want to choose the starting spots such that the minimum distance
// between any two of them is as large as possible.What is the largest minimum distance?

// The first line of input will contain the value of n,the number of starting spots.
// The second line of input will contain the n numbers denoting the location of each spot.
// The third line will contain the value of m,number of each children.
// Input : 5
//         1 2 4 8 9
//         3
// Output : 3
class RaceTrack {
    static boolean isPossible(int [] arr,int k,int dist) {
        int kidsPlaced = 1;
        int lastKid = arr[0];
        for (int i = 1;i < arr.length;i++) {
            if (arr[i] - lastKid >= dist) {
                kidsPlaced++;
                lastKid = arr[i];
            }
        }
        return kidsPlaced >= k;
    }
    static int raceTrack(int [] arr,int k) {
        if (arr.length < k)
            return -1;
        int ans = -1,st = 0,end = (int)1e9;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (isPossible(arr,k,mid)) {  // can k kids be placed so that no 2 kids have distance lesser than mid
                ans = mid;
                st = mid + 1;
            }else end = mid - 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,4,8,9};
        int k = 3;
        System.out.println(raceTrack(arr,k));
    }
}