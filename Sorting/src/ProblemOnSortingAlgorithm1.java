// Q.1) Given an integer array arr, move all the 0's to the end of it while maintaining the relative
// order of the non-zero elements.
// Note that you must do this in-place without making a copy of the array.
// Input : 0 5 0 3 4 2
// Output : 5 3 4 2 0 0
public class ProblemOnSortingAlgorithm1 {
    // This problem is done by the help of Bubble Sort Algorithm
//    static void swap(int [] arr,int a,int b) {
//        arr[a] = arr[a] + arr[b];
//        arr[b] = arr[a] - arr[b];
//        arr[a] = arr[a] - arr[b];
//    }
//    public static void main(String[] args) {
//        int [] arr = {0,5,0,3,4,2};
//        for (int i = 0;i < arr.length - 1;i++) {
//            for (int j = 0;j < arr.length - 1 - i;j++) {
//                if (arr[j] == 0 && arr[j + 1] != 0) {
//                    swap(arr,j,j + 1);
//                }
//            }
//        }
//        System.out.print("The sorted array is : ");
//        for (int i = 0;i < arr.length;i++)
//            System.out.print(arr[i] + " ");
//    }
}

// Q.2) Given an array of names of the fruits; you are supposed to sort it in lexicographical order using
// the selection sort
// Input : ["papaya","lime","watermelon","apple","mango","kiwi"]
// Output : ["apple","kiwi","lime","mango","papaya","watermelon"]
class LexicographicalStringSort {
    static void swap(String [] arr,int a,int b) {
        String temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void lexicographicalSort(String [] arr) {
        for (int i = 0;i < arr.length - 1;i++) {
            int minIndex = i;
            for (int j = i + 1;j < arr.length;j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0)
                    minIndex = j;
            }
            swap(arr,i,minIndex);
        }
    }
    public static void main(String[] args) {
        String [] fruits = {"papaya","lime","watermelon","apple","mango","kiwi"};
        lexicographicalSort(fruits);
        System.out.print("The sorted array is : ");
        for (int i = 0;i < fruits.length;i++)
            System.out.print(fruits[i] + " ");

    }
}