// Q.1) Given a number num and a value k.Print k multiples of num
import java.util.*;
public class BasicRecursion2 {
//    public static void Print_K_Multiples_Of_Num(int num,int k) {
//        if (k == 1) {
//            System.out.print(num * k + " ");
//            return;
//        }
//        Print_K_Multiples_Of_Num(num,k - 1);
//        System.out.print(num * k + " ");
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter num : ");
//        int num = sc.nextInt();
//        System.out.print("Enter k : ");
//        int k = sc.nextInt();
//        Print_K_Multiples_Of_Num(num,k);
//    }
}

// Q.2) Given a number n.Find the sum of natural numbers till n but with alternate signs.
// That means if n = 5 then you have to return 1-2+3-4+5=3 as your answer
//class SumOfNaturalNumbersWithAlternateSign {
//    public static int sumOfAlternateSign(int n) {
//        if (n == 0)
//            return 0;
//        if (n % 2 == 0) {
//            return (-n + sumOfAlternateSign(n - 1));    // Time Complexity : O(n)
//        }
//        return (n + sumOfAlternateSign(n - 1));
//
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n : ");
//        int n = sc.nextInt();
//        int ans = sumOfAlternateSign(n);
//        System.out.println(ans);
//    }
//}

// Q.3) Given two numbers x and y. Find the greatest common divisor of x and y
//class GCD {
//    public static int GCDUsingEuclidAlgo(int x,int y) {
//        if (y == 0)
//            return x;
//        return GCDUsingEuclidAlgo(y,x % y);
//    }
//    public static int GCDUsingLongDivision(int x,int y) {
//        while (x % y != 0) {
//            int rem = x % y;
//            x = y;
//            y = rem;
//        }
//        return y;
//    }
//    public static int GCDUsingBruteFroce(int x,int y) {
//        int ans = 1;
//        int num = 0;
//        if (x > y)
//            num = y;
//        else
//            num = x;
//        for(int i = num;i > 0;i--)
//        {
//            if(x % i == 0 && y % i == 0)
//            {
//                ans = i;
//                break;
//            }
//        }
//        return ans;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter x : ");
//        int x = sc.nextInt();
//        System.out.print("Enter y : ");
//        int y = sc.nextInt();
//        //int ans = GCDUsingLongDivision(x,y);
//        //int ans = GCDUsingBruteFroce(x,y);
//        int ans = GCDUsingEuclidAlgo(x,y);
//        System.out.print("The GCD of "+x+" and "+y+" is : "+ans);
//    }
//}

// Q.4) Print all elements of an array using recursion
//class ArrayPrint {
//    public static void PrintingAllArrayElements(int [] arr,int idx) {
//        if (idx > arr.length - 1)
//            return;
//        System.out.print(arr[idx]+" ");
//        PrintingAllArrayElements(arr,idx + 1);
//    }
//    public static void main(String[] args) {
//        int [] arr = {8,4,5,10,1};
//        PrintingAllArrayElements(arr,0);
//    }
//}

// Q.5) Print the maximum value of an array using recursion
//class ArrayMax {
//    public static int PrintMaxArrayElement(int [] arr,int idx) {
//        if (idx == arr.length - 1) {
//            return arr[idx];
//        }
//        int SmallAns = PrintMaxArrayElement(arr,idx + 1);
//        return Math.max(arr[idx],SmallAns);
//
//    }
//    public static void main(String[] args) {
//        int [] arr = {8,4,5,10,1};
//        int max = PrintMaxArrayElement(arr,0);
//        System.out.print("Maximum value is : "+max);
//    }
//}

// Q.6) Find the sum of the elements of an array using recursion
//class sumOfArray{
//    public static int SumOfArrayElements(int [] arr,int idx) {
//        if (idx == arr.length) {
//            return 0;
//        }
//        int sum = SumOfArrayElements(arr,idx + 1);
//        return (arr[idx] + sum);
//    }
//    public static void main(String[] args) {
//        int [] arr = {8,4,5,10,1};
//        int sum = SumOfArrayElements(arr,0);
//        System.out.print("The sum is : "+sum);
//    }
//}

// Q.7) Given an array of n integers and a target value x. Print whether x exists in the array or not.
//class linearSearch {
//    static boolean search(int [] arr,int target,int n,int idx) {
//        if (idx >= n)
//            return false;
//        if (arr[idx] == target)
//            return true;
//        return search(arr,target,n,idx + 1);
//    }
//    public static void main(String[] args) {
//        int [] arr = {2,5,10,4,8};
//        int target = 4;
//        int n = arr.length;
//        if (search(arr,target,n,0)) {
//            System.out.println("Yes");
//        }
//        else System.out.println("No");
//    }
//}

// Q.8) Given an array of size n and an integer x.The task is to find all the indices of integer x in the array.
//class findAllIndicesOfx {
//    static void FindAllIndices(int [] arr,int target,int n,int idx) {
//        if (idx >= n)
//            return;
//        if (arr[idx] == target)
//            System.out.print(idx+" ");
//        FindAllIndices(arr,target,n,idx + 1);
//    }
//    public static void main(String[] args) {
//        int [] arr = {2,4,5,4,10,4,8,4};
//        int target = 4;
//        int n = arr.length;
//        FindAllIndices(arr,target,n,0);
//    }
//}

// Q.9) Given an array of size n and an integer x.The task is to find the last index of integer x in the array.
//class findLastIndexOfx {
//    static int FindLastIndex(int [] arr,int target,int n,int idx) {
//        if (idx <= 0)
//            return -1;
//        if (arr[idx] == target)
//             return idx;
//        return FindLastIndex(arr,target,n,idx - 1);
//    }
//    public static void main(String[] args) {
//        int [] arr = {2,4,5,4,10,4,8,4};
//        int target = 4;
//        int n = arr.length;
//        int lastIndex = FindLastIndex(arr,target,n,n - 1);
//        System.out.println(lastIndex);
//    }
//}

// Q.10) Given an array of size n and an integer x.The task is to find arraylist of all the indices of integer x in the array.
class findArraylistOfAllIndices {
    static ArrayList<Integer> allArraylistIndices(int [] arr,int target,int n,int idx) {
        if (idx >= n)
            return new ArrayList<Integer>();  // return empty arraylist
        ArrayList<Integer> ans = new ArrayList<>();
        if (arr[idx] == target) {
            ans.add(idx);
        }
        ArrayList<Integer> smallAns = allArraylistIndices(arr,target,n,idx + 1);
        ans.addAll(smallAns);
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {2,4,5,4,10,4,8,4};
        int target = 4;
        int n = arr.length;
        ArrayList<Integer> ans = allArraylistIndices(arr,target,n,0);
        for (Integer i : ans)
            System.out.print(i+" ");
    }
}