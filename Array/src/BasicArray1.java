class Array {
    void demoArray() {
        int[] ages = new int[3];
        float[] weights = new float[5];
        String[] name = {"Soumyadip","Rohit","virat"};
        ages[0] = 8;
        ages[1] = 16;
        ages[2] = 21;
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        System.out.println(weights.length);
    }
}
public class BasicArray1 {
    public static void main(String[] args) {
        Array obj = new Array();
        obj.demoArray();
    }
}
