public class PassByValue {
    static void ChangeValue(int a){
        a*=100;
        System.out.println("Inside Change value : "+a);
    }

    public static void main(String[] args) {
        int a = 10;
        System.out.println("Before Changing value : "+a);
        ChangeValue(a);
        System.out.println("After Changing value : "+a);
    }
}
