public class Try_With_Multiple_Catch_Blocks {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 2;
        int result = 0;
        int [] values = {2,5,8,10};
        String name = null;
        try {
            result = num1 / name.length();
            System.out.println(values[5]);
        }
        catch (ArithmeticException e){
            System.out.println("Cannot divide by zero : " + e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your limits : " + e);
        }
        catch (Exception e){
            System.out.println("Something went wrong : " + e);
        }
        System.out.println(result);
        System.out.println("Bye");
    }
}
