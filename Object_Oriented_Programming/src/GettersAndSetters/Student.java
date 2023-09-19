package GettersAndSetters;

public class Student {
    public String Name;
    private int Roll;

    public int getRoll() { //getter
        return Roll;
    }

//    public int setRoll(int roll) { //setter integer type for return a value
//        Roll = roll;
//        return Roll;
//    }

    public void setRoll(int roll) {   // setter void type
        Roll = roll;
    }

//    public void setRoll(int Roll) {   // setter void type
//        this.Roll = Roll;             // using of "this" keyword
//    }
}
