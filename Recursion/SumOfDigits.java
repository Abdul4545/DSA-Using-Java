package Recursion;

public class SumOfDigits {

    static int SOD(int n) {

        if(n >= 0 && n <= 9 ) {
            return n;
        }

        int lastDigit = n % 10;
        return lastDigit + SOD(n/10);
    }
    public static void main(String[] args) {
        
        System.out.println(SOD(250));
    }  
}