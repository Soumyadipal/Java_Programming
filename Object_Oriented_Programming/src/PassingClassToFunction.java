public class PassingClassToFunction {
    static class Student {
        String name;
        int roll;
    }
    public static void change(Student s) {
        s.name = "Neymar";
    }

    public static void main(String[] args) {
        Student S1 = new Student();
        S1.name = "Soumyadip";
        S1.roll = 22;
        System.out.println(S1.name);
        change(S1);
        System.out.println(S1.name);
    }
}
