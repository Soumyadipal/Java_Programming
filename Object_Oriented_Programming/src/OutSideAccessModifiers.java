import AccessModifiers.App;
public class OutSideAccessModifiers {
    public static void main(String[] args) {
        App obj = new App();
        System.out.println("Outside package and non-child class : "+obj.Str_1);

        App3 obj3 = new App3();
        obj3.PrintFromChildClass();
    }
}
//Child class    Parent class
class App3 extends App {
    void PrintFromChildClass() {
        App3 obj3 = new App3();
        System.out.println("Child class : "+obj3.Str_1);
    }

}