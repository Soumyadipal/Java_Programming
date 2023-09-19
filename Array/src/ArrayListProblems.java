// Q.1) Write a program to reverse the given ArrayList
// Input : [0,10,3,5,22,10]
// Output : [10,22,5,3,10,0]
// Q.2) Write a program to sort an ArrayList of Strings in descending order
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListProblems {
    static void reverseList(ArrayList<Integer> list) {
        int i = 0,j = list.size() - 1;
        while (i < j) {
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("Original List : "+ list);
//        reverseList(list);
        Collections.reverse(list);                         // Q.1
        System.out.println("Reverse List : "+ list);       // Q.1
        Collections.sort(list);                            // Q.2
        System.out.println("Ascending Order : "+ list);    // Q.2
        Collections.sort(list,Collections.reverseOrder()); // Q.2
        System.out.println("Descending Order : "+ list);   // Q.2

        ArrayList<String> l1 = new ArrayList<>();          // Q.2
        l1.add("Soumyadip");                               // Q.2
        l1.add("Pal");                                     // Q.2
        l1.add("Virat");                                   // Q.2
        System.out.println("Original List is : "+ l1);     // Q.2
        Collections.sort(l1,Collections.reverseOrder());   // Q.2
        System.out.println("Sorted List in descending order is : "+ l1);  // Q.2
    }

}
