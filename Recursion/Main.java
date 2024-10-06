package Recursion;

public class Main {

    static void print(int n) {
        if(n > 5) {
            return;
        }
        System.out.println(n);
        // print(n+1);
        // print(n = n++);
        print(++n);
    } 

    static int fibonacci(int n) {
        if(n == 1) {
            return 1;
        }

        if(n == 0) {
            return 0;
        }

        if(n < 0) {
            return -1;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }

    static long fibonacciFormula(int n) {
        return (long)((Math.pow(((1 + Math.sqrt(5)) / 2), n) - Math.pow(((1 - Math.sqrt(5)) / 2), n)) / Math.sqrt(5));

        // return (long)(Math.pow(((1 + Math.sqrt(5)) / 2), n)/ Math.sqrt(5));
    }


    public static void main(String[] args) {

        print(1);
        // System.out.println(fibonacci(7));
        // for (int i = 0; i < 11; i++) {
        //     System.out.println(fibonacciFormula(i));
        // }

        // System.out.println(fibonacciFormula(50));

    }
    
}
