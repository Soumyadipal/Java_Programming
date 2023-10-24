// Q.1) Calculate the sum of elements in the given Array
// arr = {8,4,6,5,10}
// Q.2) Calculate the maximum value out of all the elements in an Array
// Q.3) Search the given x in the array.If present then return the index else return -1
// Q.4) Count the number of occurances of a particular element x
// Q.5) Find the last occurance of an element x in the given array

import java.util.Scanner;
 class ArrayExample {

    void SearchInArray() {
        int[] arr = {8,4,6,5,10};
        int x = 5;
        int ans = -1;
        for (int i = 0;i < arr.length;i++) {
            if (x == arr[i]) {
                ans = i;
                break;
            }
        }
        if(ans == -1)
            System.out.println("Not Found.Index : "+ans);
        else System.out.println("Found "+x+" at index : "+ans);
    }
    void SumOfArrayElements() {
        int[] arr = {8,4,6,5,10};
        int sum = 0;
        for(int i = 0;i < arr.length;i++) {
            sum = sum + arr[i];
        }
        System.out.println("The Summation is : "+sum);
    }

    void MaximumValueOfArrayElement() {
        int[] arr = {8,4,6,5,10};
        int Max = 0;
        for (int i = 0;i < arr.length;i++) {
            if(arr[i] > Max)
                Max = arr[i];
        }
        System.out.println("Maximum Value of all Array elements is : "+Max);
    }
}
public class BasicArray2 {
     public static int LastOccurance(int[] arr,int x) {         //Q.5
         int lastcoourance = -1;                                //Q.5
         for(int i = 0;i < arr.length;i++){                     //Q.5
             if (arr[i] == x)                                   //Q.5
                 lastcoourance = i;                             //Q.5
         }                                                      //Q.5
         return lastcoourance;                                  //Q.5
     }                                                          //Q.5
    public static int CountNumberOfElements(int[] arr,int x) { //Q.4
        int count = 0;                                         //Q.4
        for(int i = 0;i < arr.length;i++){                     //Q.4
            if (arr[i] == x)                                   //Q.4
                count++;                                       //Q.4
        }                                                      //Q.4
        return count;                                          //Q.4
    }                                                          //Q.4
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayExample obj = new ArrayExample();
        obj.SumOfArrayElements();
        obj.MaximumValueOfArrayElement();
        obj.SearchInArray();

        System.out.print("Enter the size of the Array : ");                       //Q.4
        int n = sc.nextInt();                                                     //Q.4
        int[] arr = new int[n];                                                   //Q.4
        System.out.print("Enter the elements of the array :");                    //Q.4
        for (int i = 0;i < arr.length;i++) {                                      //Q.4
            arr[i] = sc.nextInt();                                                //Q.4
        }                                                                         //Q.4
        System.out.print("Enter the element : ");                                 //Q.4
        int x = sc.nextInt();                                                     //Q.4
        System.out.println("Count of x is : "+CountNumberOfElements(arr,8));   //Q.4
        System.out.println("Last Occurance of x is at index : "+LastOccurance(arr,8));  //Q.5
    }
}
