import java.lang.Math;
public class Functions {

    public static void main(String[] args) {
        // System.out.println(sum(2,3));
        // System.out.println(printMyName("Abdul Moid Khan"));

        // System.out.println(factorial(-2));

        // System.out.println(Average(10, 15, 12));

        // System.out.println(SumOfOddNumbers(5));

        fun1();
    }


    // print sum
    static int sum(int a, int b) {
        return a + b;
    }

    // print name
    static String printMyName(String name) {
        return "My Name is " + name;
    }

    // find factorial
    static int factorial(int number) {
        if(number < 0) {
            System.out.println("Invalid Number");
            return 0;
        }
        int factorial = 1;
        for(int i = number; i >= 1; i--) {
                factorial = factorial * i;
        }
        return factorial;
    }

    // Average of 3 numbers
    static double Average(int a, int b, int c) {
        return Math.round(((a+b+c)/3));
    }

    // sum of odd numbers from 1 to n
    static int SumOfOddNumbers(int number) {
        int sum = 0;

        while (number >= 1) {
            if(number % 2 == 0) {
                number = number - 1;
            }

            else {
                sum = sum + number;
                number = number - 2;
            }
        }

        return sum;
    }

    
    static void fun1() {
        int x = 1;
        fun2();
        System.out.println(x);
    }

    static void fun2() {
        int x = 2;
        fun3();
        System.out.println(x);
    }

    static void fun3() {
        int x = 3;
        System.out.println(x);
    }

}

