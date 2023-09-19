import java.util.ArrayList;
public class ArrayListBasic1 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();

        // Add new elements
        l1.add(4); // 4
        l1.add(5); // 4 5
        l1.add(6); // 4 5 6
        l1.add(7); // 4 5 6 7
        l1.add(8); // 4 5 6 7 8

        // Get an element at index 1
        System.out.println(l1.get(1)); // 5

        // Print with for loop
        for (int i = 0;i < l1.size();i++) {
            System.out.print(l1.get(i)+" "); // 4 5 6 7 8
        }
        System.out.println();

        // Printing the ArrayList directly
        System.out.println(l1); // [4, 5, 6, 7, 8]

        // Adding element at some index i
        l1.add(1,88);
        System.out.println(l1); // [4, 88, 5, 6, 7, 8]

        // Modify element at index i
        l1.set(1,48);
        System.out.println(l1); // [4, 48, 5, 6, 7, 8]

        // Removing an element at index i
        l1.remove(1);
        System.out.println(l1); // [4, 5, 6, 7, 8]

        // Removing an element e
        l1.remove(Integer.valueOf(7));
        System.out.println(l1); // [4, 5, 6, 8]
        System.out.println(l1.remove(Integer.valueOf(6))); // true
        System.out.println(l1.remove(Integer.valueOf(888))); // false

        // Checking if an element exists
        boolean ans = l1.contains(Integer.valueOf(8));
        System.out.println(ans); // true

        // If you don't specify class, you can put anything inside l
        ArrayList l2 = new ArrayList();
        l2.add("Soumyadip");
        l2.add(8);
        l2.add(true);
        l2.add(8.8);
        System.out.println(l2); // [Soumyadip, 8, true, 8.8]
    }
}
