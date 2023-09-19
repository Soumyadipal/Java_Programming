import java.util.Scanner;
public class ArraySortingCheck {
    static boolean IsSorted(int[] arr) {
        boolean check = true;
        for (int i = 1;i < arr.length;i++){
            if(arr[i] < arr[i-1]) {
                check = false;
                break;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array :");
        for (int i = 0;i < arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Is Sorted : "+IsSorted(arr));
    }
}
