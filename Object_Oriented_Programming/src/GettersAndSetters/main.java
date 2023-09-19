package GettersAndSetters;

public class main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.Name = "Soumyadip";
        System.out.println(s1.Name);

//        s1.Roll = 22;
//        System.out.println(s1.Roll);
//        As Roll is private in class Student , so the above 2 lines give error

        System.out.println(s1.getRoll()); // using the getter to get access of Roll

        s1.setRoll(22);
        System.out.println(s1.getRoll()); // using the setter to change the value of Roll
    }
}
