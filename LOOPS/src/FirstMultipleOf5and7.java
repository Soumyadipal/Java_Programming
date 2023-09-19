public class FirstMultipleOf5and7 {
    public static void main(String[] args) {
        int num = 1;
        while(true){
            if((num % 5 == 0) && (num % 7 == 0)) {
                System.out.println("First Number is Found : " + num);
                break;
            }
            num++;
        }
    }
}

//First and Second Multiple of 5 & 7
//public class FirstMultipleOf5and7 {
//    public static void main(String[] args) {
//        int num = 1,i = 1;
//        while(i<=2){
//            if((num % 5 == 0) && (num % 7 == 0)) {
//                System.out.println("Number is Found : " + num);
//                i++;
//            }
//            num++;
//        }
//    }
//}

