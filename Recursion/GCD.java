package Recursion;

// GCD of x and y

public class GCD {

    static int gcd(int x, int y) {
        while (x % y != 0) {
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;
    }



    static int RecursionGCD(int x, int y) {
        if(x == 0) {
            return y;
        }

        if(y == 0) {
            return x;
        }

        return RecursionGCD(y, x % y);
    }


    public static void main(String[] args) {
        

        // brute force approach
        // here x is always less than y 
        // int gcd = 1;
        int x = 27;
        int y = 36;

        // int i = x;
        // while(i >= 1) {

        //     if(x % i == 0 && y % i == 0) {
        //         gcd = i;
        //         System.out.println("GCD is : " + gcd);
        //         break;
        //     }

        //     else {
        //         i--;
        //     }
        // }


        // System.out.println(gcd(x,y));


        System.out.println(RecursionGCD(x, y));
        System.out.println(RecursionGCD(0, 5));
        System.out.println(RecursionGCD(5, 5));
        System.out.println(RecursionGCD(55, 0));

    }
}
