class Demo2 {
    public void a() throws Exception {
        b();
    }

    public void b() throws Exception {
        int num1 = 6;
        int num2 = 0;
        int result = num1 / num2;
        System.out.println(result);
    }
}
public class throws_keyword2 {
    public static void main(String[] args) {
        Demo2 obj = new Demo2();
        try {
            obj.a();
        }
        catch (Exception e){
            System.out.println("Error " + e.getMessage());
        }
    }
}
