package OOPS.ExceptionHandling;

public class Main {

    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try {
            // int c = a / b;

            divide(a, b);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
        }

        finally {
            System.out.println("I will always run");
        }

    }

    static int divide(int a, int b) throws ArithmeticException {
        // return a / b;

        if(b == 0) {
            throw new ArithmeticException("Please do not divide by zero");
        }

        return a / b;
    }

}
