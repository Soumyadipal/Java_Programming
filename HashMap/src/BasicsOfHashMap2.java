import java.util.*;
public class BasicsOfHashMap2 {
    public static void main(String[] args) {

        // Q.1) Given an array, find the most frequent element in it. If there are multiple elements that appear a maximum number of times, print any one of them.
        //Input : n = 6  arr[] = {1, 3, 2, 1, 4, 1}
        // Output : 1
        //n = 7  arr[] = {10, 20, 10, 20, 30, 20, 20}
        // Output : 20

        int [] arr = {1,4,2,5,1,4,4,6,4,4,4,6,2,2};
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i = 0;i < arr.length;i++){
            if(!mp.containsKey(arr[i])){
                mp.put(arr[i],1);
            }
            else {
                mp.put(arr[i],mp.get(arr[i]) + 1);
            }
        }
        System.out.println(mp);
        int max = -1,ansKey = -1;
        for (var i : mp.entrySet()){
            if(i.getValue() > max){
                max = i.getValue();
                ansKey = i.getKey();
            }
        }
        System.out.println(ansKey);
    }
}
