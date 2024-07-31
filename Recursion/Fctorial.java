package Recursion;

public class Fctorial {

    static int factorial(int n) {
        if(n < 0) {
            return -1;
        }
        if(n == 0) {
            return 1;
        }

        return factorial(n-1) * n;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(-5));
    }

}
