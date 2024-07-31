package Math_For_DSA;

public class NumberOfDigits {
    public static void main(String[] args) {
        
        int number = 123; // In decimal
        int base = 2; // base to which we are converting number

        int ans = (int)(Math.log(number) / Math.log(base)) + 1;

        System.out.println(ans);
    }

}
