import java.util.LinkedList;

public class ImplementationOfHashMap {
    static class MyHashMap<K,V>{
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;
        private class Node{
            K key;
            V value;
            Node(K key,V value){
                this.key = key;
                this.value = value;
            }
        }
        private int n; // number of entries in map
        private LinkedList<Node> [] buckets;
        private void initBuckets(int N){ // N -> capacity/size of buckets array
            buckets = new LinkedList[N];
            for(int i = 0;i < buckets.length;i++){
                buckets[i] = new LinkedList<>();
            }
        }
        private int HashFunc(K key){
            int hc = key.hashCode();
            return (Math.abs(hc)) % buckets.length;
        }
        private int searchInBucket(LinkedList<Node> ll,K key){ // Traverse the ll and looks for a node with key. If found it returns its index otherwise it returns null
            for(int i = 0;i < ll.size();i++){
                if(ll.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }
        public MyHashMap(){
            initBuckets(DEFAULT_CAPACITY);
        }
        public int capacity(){
            return buckets.length;
        }
        public float load(){
            return (n * 1.0f) / buckets.length;
        }
        private void rehash(){
            LinkedList<Node>[] oldBuckets = buckets;
            initBuckets(oldBuckets.length * 2);
            n = 0;
            for (var bucket : oldBuckets){
                for (var node : bucket){
                    put(node.key, node.value);
                }
            }
        }
        public int size(){ // return the number of entries in map
            return n;
        }
        public void put(K key, V value){ // insert/update
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if(ei == -1){ // key doesn't exist, we have to insert a new node
                Node node = new Node(key, value);
                currBucket.add(node);
                n++;
            }
            else { // update case
                Node currNode = currBucket.get(ei);
                currNode.value = value;
            }
            if(n >= buckets.length * DEFAULT_LOAD_FACTOR){
                rehash();
            }
        }
        public V get(K key){
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if (ei != -1){ // key exists
                Node currNode = currBucket.get(ei);
                return currNode.value;
            }
            return null; // key doesn't exist
        }
        public V remove(K key){
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if(ei != -1){ // key exists
                Node currNode = currBucket.get(ei);
                V val = currNode.value;
                currBucket.remove(ei);
                n--;
                return val;
            }
            return null; // key doesn't exist
        }
    }
    public static void main(String[] args) {
        MyHashMap<String,Integer> mp = new MyHashMap<>();
        System.out.println("Testing Put");
        mp.put("a",1);
        mp.put("b",2);
        mp.put("c",3);
        mp.put("x",4);
        mp.put("y",100);
        mp.put("z",80);
        System.out.println("Testing Size : " + mp.size()); // 3
        mp.put("c",50);
        System.out.println("Testing Size : " + mp.size()); // 3
        // Testing get
        System.out.println(mp.get("a")); // 1
        System.out.println(mp.get("b")); // 2
        System.out.println(mp.get("c")); // 50
        System.out.println(mp.get("x")); // 4
        System.out.println(mp.get("y")); // 100
        System.out.println(mp.get("z")); // 80
        System.out.println(mp.get("Soumyadip")); // null
        System.out.println(mp.remove("c")); // 50
        System.out.println(mp.remove("c")); // null
        System.out.println("Testing Size : " + mp.size()); // 2
        System.out.println("Capacity : " + mp.capacity());
        System.out.println("Load Factor : " + mp.load());
    }
}
