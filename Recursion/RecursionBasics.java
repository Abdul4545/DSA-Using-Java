package Recursion;

import java.util.Scanner;

public class RecursionBasics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // printNumber(5);

        System.out.print("Enter your number here : ");
        int n = sc.nextInt();

        // printNumber2(n);

        // if(n < 0) {
        //     System.out.println("Factorial is not possible");
        // }

        // else {
        //     System.out.println("The factorial of " + n + " is : " + printFactorial(n));
        // }


        System.out.println(printFibonacciNumber(n));

        // printSum(5, 1, 0);

        // System.out.println(calculateFactorial(-1));


        // int a = 0;
        // int b = 1;
        // System.out.print(a + " " + b + " ");
        // int n = 7;
        // printFibonacci(a, b, n-2);


        // int x = 2, n = 5;
        // int ans = calculateXpowerN1(2, 5);
        // System.out.println(ans);

        System.out.println(calculateXpowerN(0, 0));


        sc.close();

    }


    // print number from 5 to 1
    static void printNumber(int n) {
        if(n == 0) {
            return;
        }
        
        System.out.println(n);
        printNumber(n-1);
    }


    // print number from 1 to n
    static void printNumber2(int n) {
        if(n == 1) {
            System.out.println(n);
            return;
        }
        
        printNumber2(n-1);
        System.out.println(n);
    }



    // print Sum of n natural numbers
    static void printSum(int n, int i, int sum) {

        if(i == n) {
            System.out.println(sum + i);
            return;
        }

        sum = sum + i;
        printSum(n, i+1, sum);
        System.out.println(i);
    }



    // print Factorial of a number n
    static int calculateFactorial(int number) {
        
        if(number == 1 || number == 0) {
            return 1;
        }

        if(number < 0) {
            System.out.println("factorial can not be calculated");
            return 0;
        }

        int fact_nm1 = calculateFactorial(number-1); 
        int fact_n = number * fact_nm1;

        return fact_n;
    }



    // print the fibonacci sequence
    static void printFibonacci(int a, int b, int n) {
        if(n == 0) {
            return;
        }

        int c = a + b; 
        System.out.print(c + " ");
        printFibonacci(b, c, n-1);
    }

    
    // print x^n (stack height = n)
    static int calculateXpowerN(int x, int N) {
        
        // base cases
        if(x == 0 && N > 0) {
            return 0;
        }

        if(x > 0 && N == 0 || x == 0 && N == 0) {
            return 1;
        }

        // kaam
        int xPownm1 = calculateXpowerN(x, N-1);
        int xPown = x * xPownm1;
        return xPown;
    }



    // print x^n (stack height = log n)
    static int calculateXpowerN1(int x, int N) {
        
        // base cases
        if(x == 0 && N > 0) {
            return 0;
        }

        if(x > 0 && N == 0) {
            return 1;
        }

        if(x == 0 && N == 0) {
            return 1;
        }

        // kaam
        // if power is even

        int smallPow = calculateXpowerN1(x, N/2);
        if(N % 2 == 0) {
           return smallPow * smallPow;
        }

        else {
            return smallPow * smallPow * x;
        }    
    }


    static int printFactorial(int number) {
        if(number == 0) { 
            return 1;
        }

        return number * printFactorial(number - 1);
    }



    static int printFibonacciNumber(int number) {
        
        // Base case
        if(number == 0 || number == 1) {
            return number;
        }

        int prev = printFibonacciNumber(number - 1);
        int prevPrev = printFibonacciNumber(number - 2);

        int ans = prev + prevPrev;
        return ans;
    }

}
