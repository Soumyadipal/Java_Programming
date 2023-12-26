import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapInterface {
    static void TreeMapExamples(){  // Sorted order
        TreeMap<Integer,String> tp = new TreeMap<>();
        tp.put(2,"Gill");
        tp.put(3,"Soumyadip");
        tp.put(1,"Virat");
        System.out.println(tp);
    }
    static void LinkedHashMapExamples(){  // Order of insertion
        Map<Integer,String> lhp = new LinkedHashMap<>();
        lhp.put(2,"Gill");
        lhp.put(3,"Soumyadip");
        lhp.put(1,"Virat");
        System.out.println(lhp);
    }
    static void HashMapExamples(){   // Unordered
        Map<Integer,String> hp = new HashMap<>();
        hp.put(2,"Gill");
        hp.put(3,"Soumyadip");
        hp.put(1,"Virat");
        hp.put(48,"Rahul");
        hp.put(15,"Rinku");
        System.out.println(hp);
        hp.put(2,"Rohit");  // Over-rides
        System.out.println(hp);
        hp.putIfAbsent(1,"Shreyas");
        System.out.println(hp);
        System.out.println(hp.get(3));
        System.out.println(hp.containsKey(4));
        System.out.println(hp.containsValue("Rohit"));
        System.out.println(hp.keySet());
        System.out.println(hp.values());
        System.out.println(hp.entrySet());

        // iterating over values in a map
        for (var i : hp.values()){
            System.out.print(i + " ");
        }
        System.out.println();

        // iterating over key values in a map
        for (var i : hp.keySet()){
            System.out.print(i + " ");
        }
        System.out.println();

        // iterating over keys,values in a map
        for (var i : hp.entrySet()){
            System.out.print(i + " ");
        }
        System.out.println();
        // iterating over keys,values in a map
        for (var i : hp.entrySet()){
            System.out.print(i.getKey() + " ");
        }
        System.out.println();
        // iterating over keys,values in a map
        for (var i : hp.entrySet()){
            System.out.print(i.getValue() + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        HashMapExamples();
        LinkedHashMapExamples();
        TreeMapExamples();
    }
}
