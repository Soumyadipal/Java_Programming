package AccessModifiers;

import java.sql.SQLOutput;

public class App {
    public String Str_1 = "I am a public member";

    void PrintFromClass() {

        System.out.println("Within a class "+Str_1);
    }

    public static void main(String[] args) {
        App obj = new App();
        obj.PrintFromClass();
        System.out.println(obj.Str_1);

        App2 obj2 = new App2();
        obj2.PrintFromOutsideClass();

    }
}
class App2 {
    void PrintFromOutsideClass() {
        App obj = new App();
        System.out.println("Within package but outside class : "+obj.Str_1);
    }

}
