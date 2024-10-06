package Recursion;

public class PalindromeNumber {

    static boolean palindrome(int n) {
        return n == ReverseNumber.reverse2(n);
    }

    public static void main(String[] args) {
        System.out.println(palindrome(1221));
    }
    
}
