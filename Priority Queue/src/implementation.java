import java.util.Comparator;
import java.util.PriorityQueue;

public class implementation {

    public static class Student {
        String name;
        int rollNo;
        int marks;
        String dob;
    }

    public static class StudentComparator implements Comparator<Student>{
        //overriding
        public int compare(Student s1,Student s2){
            if (s1.marks > s2.marks) return -1;
            else if (s1.marks < s2.marks) return 1;
            else {
                if (s1.rollNo > s2.rollNo) return -1;
                else if(s1.rollNo < s2.rollNo) return 1;
                else return 0;
            }
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // min heap
        pq.add(10);
        pq.add(20);
        pq.add(15);
        pq.add(5);
        pq.add(7);

        System.out.println(pq.peek()); // 5
        pq.remove(); // remove top element
        System.out.println(pq.peek()); // 7
        System.out.println(pq.remove()); // 7
        System.out.println(pq.peek()); // 10


        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder()); // max heap
        pq1.add(10);
        pq1.add(20);
        pq1.add(15);
        pq1.add(5);
        pq1.add(7);

        System.out.println(pq1.peek()); // 20
        pq1.remove(); // remove top element
        System.out.println(pq1.peek()); // 15
        System.out.println(pq1.remove()); // 15
        System.out.println(pq1.peek()); // 10


        PriorityQueue<Student> studentPriorityQueue = new PriorityQueue<>(new StudentComparator());

        Student stu1 = new Student();
        stu1.name = "Soumyadip";
        stu1.dob = "08-09-2001";
        stu1.rollNo = 22;
        stu1.marks = 98;

        Student stu2 = new Student();
        stu2.name = "Subhman";
        stu2.dob = "08-09-1999";
        stu2.rollNo = 77;
        stu2.marks = 100;

        studentPriorityQueue.add(stu1);
        studentPriorityQueue.add(stu2);

        System.out.println(studentPriorityQueue.peek().name);
        System.out.println(studentPriorityQueue.peek().rollNo);
        System.out.println(studentPriorityQueue.peek().marks);
    }
}
