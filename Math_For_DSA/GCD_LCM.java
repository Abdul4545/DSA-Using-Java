package Math_For_DSA;

public class GCD_LCM {

    static int gcd(int a, int b) {
        if(a == 0) {
            return b;
        }

        if(b == 0) {
            return a;
        }

        return gcd(b%a, a);
    }

    static int lcm(int a, int b) {
        return (a * b)/gcd(a, b);

    }

    public static void main(String[] args) {
        System.out.println(gcd(12, 0));
        System.out.println(gcd(12, 86));
        System.out.println(gcd(22, 12));
        System.out.println(lcm(22, 12));
    }

}
