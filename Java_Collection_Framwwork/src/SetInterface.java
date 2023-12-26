import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterface {
    static void TreeSetExamples(){  // Sorted order  TC -> O(log n)
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(2);
        ts.add(3);
        ts.add(4);
        ts.add(48);
        ts.add(15);
        ts.add(8);
        System.out.println(ts);
        ts.add(1);
        ts.add(1);
        ts.add(2);
        System.out.println(ts);
        ts.remove(3);
        System.out.println(ts);
        System.out.println(ts.contains(10));
        System.out.println(ts.size());
    }
    static void LinkedHashSetExamples(){  // Order of insertion and LinkedList + HashTable
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(1);
        lhs.add(2);
        lhs.add(3);
        lhs.add(4);
        lhs.add(48);
        lhs.add(15);
        lhs.add(8);
        System.out.println(lhs);
        lhs.add(1);
        lhs.add(1);
        lhs.add(2);
        System.out.println(lhs);
        lhs.remove(3);
        System.out.println(lhs);
        System.out.println(lhs.contains(10));
        System.out.println(lhs.size());
    }
    static void HashSetExamples(){    // Unordered and unique elements and hashing internally  TC -> O(1)
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(48);
        hs.add(15);
        hs.add(8);
        System.out.println(hs);
        hs.add(1);
        hs.add(1);
        hs.add(2);
        System.out.println(hs);
        hs.remove(3);
        System.out.println(hs);
        System.out.println(hs.contains(10));
        System.out.println(hs.size());
    }
    public static void main(String[] args) {
        HashSetExamples();
        LinkedHashSetExamples();
        TreeSetExamples();
    }
}
