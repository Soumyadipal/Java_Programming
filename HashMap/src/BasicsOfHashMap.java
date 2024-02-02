import java.util.HashMap;
import java.util.Map;

public class BasicsOfHashMap {
    public static void main(String[] args) {
        Map<String,Integer> mp = new HashMap<>();
        // adding elements
        mp.put("Akash",21);
        mp.put("Yash",16);
        mp.put("Lav",17);
        mp.put("Rishika",19);
        mp.put("Harry",18);
        System.out.println(mp);
        // getting value of a key from the hashmap
        System.out.println(mp.get("Yash")); // 16
        System.out.println(mp.get("Rahul")); //null
        // changing or updating the value of a key in the hashmap
        mp.put("Akash",25);
        System.out.println(mp);
        // removing a pair from the hashmap
        //mp.remove("Akash");
        System.out.println(mp.remove("Akash")); // 25
        System.out.println(mp.remove("Riya")); // null
        // checking if a key is in the hashmap
        System.out.println(mp.containsKey("Akash")); // false
        System.out.println(mp.containsKey("Rishika")); // true
        // adding a new entry only if the new key doesn't exist already
        mp.putIfAbsent("Yash",30); // will not enter
        mp.putIfAbsent("Rohit",21); // will enter
        System.out.println(mp);
        // Get all keys in the hashmap
        System.out.println(mp.keySet());
        // Get all values in the hashmap
        System.out.println(mp.values());
        // Get all entry in the hashmap
        System.out.println(mp.entrySet());
        // traversing all entries of hashmap
        for (var i : mp.entrySet()){
            System.out.print(i.getKey() + " " + i.getValue() + " ");
        }
    }
}
