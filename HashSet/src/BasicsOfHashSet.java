import java.util.*;
public class BasicsOfHashSet {
    public static void main(String[] args) {
        HashSet<String> st = new HashSet<>();
        st.add("Soumyadip");
        st.add("Virat");
        st.add("Rohit");
        st.add("Rinku");
        System.out.println(st);
        System.out.println(st.size());
        System.out.println(st.contains("Rinku"));
        st.remove("Rohit");
        System.out.println(st.contains("Rohit"));
        System.out.println(st.size());
        for (String s : st){
            System.out.println(s);
        }
    }
}
