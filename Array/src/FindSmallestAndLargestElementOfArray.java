import java.util.Arrays;
import java.util.Scanner;
public class FindSmallestAndLargestElementOfArray {
    static int[] smallest_largest(int[] arr) {
        Arrays.sort(arr);
        int[] ans = {arr[0], arr[arr.length - 1]};
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = smallest_largest(arr);
        System.out.println("The Smallest element is : " + ans[0]);
        System.out.print("The Largest element is : " + ans[ans.length - 1]);
    }
}
