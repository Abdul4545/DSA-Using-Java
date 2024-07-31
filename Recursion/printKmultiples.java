package Recursion;

public class printKmultiples {

    static void printMultiples(int n, int k) {

        if(n == 0 || k == 0) {
            return;
        }

        if(k == 1) {
            System.out.println(n);
            return;
        } 

        // recursive work
        printMultiples(n, k - 1);

        // self work
        System.out.println(n * k);
    }
    public static void main(String[] args) {
     
        printMultiples(2, 8);
    }
}
